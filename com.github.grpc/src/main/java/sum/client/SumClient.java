package sum.client;

import com.proto.sum.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.net.ssl.SSLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SumClient {
    public static void main(String[] args) throws SSLException {
        System.out.println("starting the client");

        SumClient main = new SumClient();

        main.run();
    }

    private void run() throws SSLException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //doSumCall(channel);
        //doServerStreamingCall(channel);
        //doClientStreamingCall(channel);
        doBiDiStreamingCall(channel);

        System.out.println("Shutting down channel");

        channel.shutdown();
    }
    private void doSumCall(ManagedChannel channel) {
        SumServiceGrpc.SumServiceBlockingStub SumClient = SumServiceGrpc.newBlockingStub(channel);

        Integer[] figures = {1,2,3,4,5232,23,23,23,787867,545};

        SumVars setParameters = SumVars.newBuilder().addAllMultiplyValues(Arrays.asList(figures))
               .build();

        SumRequest sumRequest = SumRequest.newBuilder()
                .setSumvars(setParameters)
                .build();
        SumResponse servicesResponse = SumClient.calculateSumOf(sumRequest);

        System.out.println(servicesResponse.getResult());
    }

    private void doServerStreamingCall(ManagedChannel channel) {
        SumServiceGrpc.SumServiceBlockingStub SumClient = SumServiceGrpc.newBlockingStub(channel);

        // Set up the array to stream
        Integer[] figures = {1,2,3,4,5232,23,23,23,787867,545};
        // we prepare the request
        SumVars setParameters = SumVars.newBuilder().addAllMultiplyValues(Arrays.asList(figures))
                .build();

        // the request hoding the set parameters
        SumRequest sumRequest = SumRequest.newBuilder()
                .setSumvars(setParameters)
                .build();

        //call the method till its done
        SumClient.calculateSumOfStream(sumRequest)
                .forEachRemaining(
                        sumManyTimesResponse ->
                            {
                                System.out.println(sumManyTimesResponse.getResult());
                            }
                        );
    }
    private void doClientStreamingCall(ManagedChannel channel)
    {
        SumServiceGrpc.SumServiceStub asyncClient = SumServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<SingleSumRequest> requestObserver = asyncClient.calculateOnTheFly(new StreamObserver<SumResponse>() {
            @Override
            public void onNext(SumResponse value) {
                // we get a response from the server
                System.out.print("received a response from the server.");
                System.out.print(value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                // the server is done sending us data
                System.out.println("server is done sending us information.");
                latch.countDown();

            }
        });
        SingleClientCall(requestObserver, 99);
        SingleClientCall(requestObserver, 1);
        SingleClientCall(requestObserver, 1);
        SingleClientCall(requestObserver, 1);
        SingleClientCall(requestObserver, 1);
        SingleClientCall(requestObserver, 1);
        SingleClientCall(requestObserver, 1);
        SingleClientCall(requestObserver, 10);

        //complete the client request and get the one and only response
        requestObserver.onCompleted();

        try
        {
            latch.await(3L, TimeUnit.SECONDS);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    private void SingleClientCall(StreamObserver<SingleSumRequest> requestObserver, int theNumber){

        SingleSumVars setParameters = SingleSumVars.newBuilder().setTheNumber(theNumber)
                .build();
        requestObserver.onNext(SingleSumRequest.newBuilder()
                .setSingleSumVars(setParameters)
                .build());

    }

    private void doBiDiStreamingCall(ManagedChannel channel) {
        SumServiceGrpc.SumServiceStub asyncClient = SumServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<SingleSumRequest> requestObserver = asyncClient.prescriptionNumber(new StreamObserver<SumResponse>() {
            @Override
            public void onNext(SumResponse value) {
                //output response from server
                System.out.println("Response from server: " + value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("There was an error.  Why??" + t.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList(1234, 1235, 1236, 1237, 1234, 1235, 1236, 1237,1234, 1235, 1236, 1237).forEach(
                preccriptionNo -> {
                    System.out.println("Sending prescription no: " + preccriptionNo);
                    SingleSumVars setParameters = SingleSumVars.newBuilder().setTheNumber(preccriptionNo)
                            .build();

                    requestObserver.onNext(SingleSumRequest.newBuilder()
                            .setSingleSumVars(setParameters)
                            .build()
                    );
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
