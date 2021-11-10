package sum.server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class SumServer {
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Server server = ServerBuilder.forPort(50051)
                .addService(new SumServiceImpl())
                .build();
        System.out.println("server about to start");
        server.start();
        System.out.println("server started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
