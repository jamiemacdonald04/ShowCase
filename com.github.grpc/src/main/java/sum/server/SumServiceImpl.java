package sum.server;
import com.proto.sum.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.List;

public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {

   @Override
   public void hello(HelloReq request, StreamObserver<HelloResp> responseObserver) {
      //get the parameters
      String result = "my name is jamie";

      //Hello response
      HelloResp response = HelloResp.newBuilder()
              .setText(result)
              .build();
      //set a response
      responseObserver.onNext(response);
      // complete the rpc call
      responseObserver.onCompleted();
   }

   @Override
   public void calculateSumOf(SumRequest request, StreamObserver<SumResponse> responseObserver) {
      //get the parameters
      SumVars sumRequest = request.getSumvars();
      List<Integer> toCalculate = sumRequest.getMultiplyValuesList();

      int sum = 0;
      // create the response
      //toCalculate.stream().map(e -> e + sum);
      for (int val : toCalculate) {
         sum =(sum +val);
      }

      String result = "the number is:" + sum;

      SumResponse response = SumResponse.newBuilder()
              .setResult(result)
              .build();
      //set a response
      responseObserver.onNext(response);
      // complete the rpc call
      responseObserver.onCompleted();
   }

   @Override
   public void calculateSumOfStream(SumRequest request, StreamObserver<SumResponse> responseObserver) {
      //get the parameters
      SumVars sumRequest = request.getSumvars();
      List<Integer> toCalculate = sumRequest.getMultiplyValuesList();

      int sum = 0;
      // create the response
      //toCalculate.stream().map(e -> e + sum);
      //adding up as we go
      try {
         for (int val : toCalculate) {

            sum =(sum +val);
            //create a response
            SumResponse response = SumResponse.newBuilder()
                    .setResult("The most recent result:" + sum)
                    .build();
            //send this iteration response back
            responseObserver.onNext(response);

            Thread.sleep(1000L);

         }
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      finally {
         // complete the rpc call
         responseObserver.onCompleted();
      }
   }

   @Override
   public StreamObserver<SingleSumRequest> calculateOnTheFly(StreamObserver<SumResponse> responseObserver) {

      StreamObserver<SingleSumRequest> requestObserver = new StreamObserver<SingleSumRequest>() {
         String result = "The result of all the requests is: ";
         int calc = 0;
         @Override
         public void onNext(SingleSumRequest value) {
            //client sends a message
            calc = calc + value.getSingleSumVars().getTheNumber();
         }

         @Override
         public void onError(Throwable t) {
            //cleint sends an error
         }

         @Override
         public void onCompleted() {

            //client is done so complete the results
            responseObserver.onNext(
                    SumResponse.newBuilder()
                            .setResult(result + calc)
                            .build()
            );
            responseObserver.onCompleted();
         }
      };

      return requestObserver;
   }

   @Override
   public StreamObserver<SingleSumRequest> prescriptionNumber(StreamObserver<SumResponse> responseObserver) {

      StreamObserver<SingleSumRequest> requestObserver = new StreamObserver<SingleSumRequest>() {

         int numberOfPrescriptions = 0;
         @Override
         public void onNext(SingleSumRequest value) {
            //client sends a message
            String result = "Thanks you for your prescription with number:"  + value.getSingleSumVars().getTheNumber();
            numberOfPrescriptions = numberOfPrescriptions++;

            if(numberOfPrescriptions >=10)
            {
               responseObserver.onError(
                       Status.INVALID_ARGUMENT.withDescription("too many prescriptions").asRuntimeException()
               );

               throw new RuntimeException("Life sucks as you have two many prescriptions my friend");
            }

            //client is done so complete the results
            responseObserver.onNext(
                    SumResponse.newBuilder()
                            .setResult(result)
                            .build()
            );
         }

         @Override
         public void onError(Throwable t) {
            //cleint sends an error
         }

         @Override
         public void onCompleted() {

            responseObserver.onCompleted();
         }
      };

      return requestObserver;
   }

}
