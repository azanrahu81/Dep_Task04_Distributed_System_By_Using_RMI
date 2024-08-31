import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {

    protected HelloWorldImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello World!";
    }
}
