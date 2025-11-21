import io.grpc.stub.StreamObserver;

public class HelloWorldServiceImpl extends WarehouseServiceGrpc.WarehouseServiceImplBase {

    @Override
    public void sendWarehouseData(WarehouseOuterClass.WarehouseRequest request, StreamObserver<WarehouseOuterClass.WarehouseResponse> responseObserver) {
        // Warehouse-Daten aus dem Request holen
        WarehouseOuterClass.Warehouse warehouse = request.getData();

        // Verarbeitung: z.B. ausgeben oder speichern
        System.out.println("Received warehouse: " + warehouse.getWarehouseID());
        System.out.println("Warehouse Name: " + warehouse.getWarehouseName());
        System.out.println("Products:");
        for (WarehouseOuterClass.ProductData product : warehouse.getProductsList()) {
            System.out.println("- " + product.getProductName() + " (" + product.getProductQuantity() + ")");
        }

        // Antwort erstellen
        WarehouseOuterClass.WarehouseResponse response = WarehouseOuterClass.WarehouseResponse.newBuilder()
                .setMessage("Warehouse received successfully")
                .build();

        // Antwort senden und Stream abschließen
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}


