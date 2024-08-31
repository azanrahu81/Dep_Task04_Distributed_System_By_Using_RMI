import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            // Get the registry from localhost at port 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup the remote object by name
            HelloWorld stub = (HelloWorld) registry.lookup("HelloWorld");

            // Call the remote method
            String response = stub.sayHello();

            // Print the response
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
