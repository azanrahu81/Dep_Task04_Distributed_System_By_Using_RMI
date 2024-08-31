import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloWorldServer {
    public static void main(String[] args) {
        try {
            // Create a remote object
            HelloWorldImpl obj = new HelloWorldImpl();

            // Create and export a registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object in the registry with the name "HelloWorld"
            registry.rebind("HelloWorld", obj);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
