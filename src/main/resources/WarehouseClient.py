import grpc
import warehouse_pb2
import warehouse_pb2_grpc

def run():
    channel = grpc.insecure_channel('localhost:50051')
    stub = warehouse_pb2_grpc.WarehouseServiceStub(channel)

    warehouse = warehouse_pb2.Warehouse(
        warehouseID="001",
        warehouseName="Linz Bahnhof",
        timestamp="2025-11-11 10:00:00",
        warehouseAddress="Bahnhofsstrasse 27/9",
        warehousePostalCode="Linz",
        warehouseCity="Linz",
        warehouseCountry="Austria",
        products=[
            warehouse_pb2.ProductData(
                productID="00-443175",
                productName="Bio Orangensaft Sonne",
                productCategory="Getraenk",
                productUnit="Packung 1L",
                productQuantity=2500
            ),
            warehouse_pb2.ProductData(
                productID="01-926885",
                productName="Ariel Waschmittel Color",
                productCategory="Waschmittel",
                productUnit="Packung 3KG",
                productQuantity=478
            )
        ]
    )

    # Request senden
    response = stub.SendWarehouseData(
        warehouse_pb2.WarehouseRequest(data=warehouse)
    )
    print("Server antwortet:", response.message)

if __name__ == "__main__":
    run()
