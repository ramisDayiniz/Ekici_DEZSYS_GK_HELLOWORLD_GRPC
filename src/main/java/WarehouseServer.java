import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class WarehouseServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new HelloWorldServiceImpl())
                .build()
                .start();
        System.out.println("Server running on port 50051");
        server.awaitTermination();
    }
}
