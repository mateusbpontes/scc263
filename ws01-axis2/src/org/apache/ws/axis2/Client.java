package org.apache.ws.axis2;
 
import org.apache.ws.axis2.SimpleServiceStub.EchoResponse;
 
public class Client {
    public static void main(String[] args) throws Exception {
        SimpleServiceStub stub = new SimpleServiceStub();
 
        //Create the request
        SimpleServiceStub.Echo request = new SimpleServiceStub.Echo();
        //request.setArgs0("Hello world");
        request.setValue("Hello world");
 
        //Invoke the service
        EchoResponse response = stub.echo(request);
 
        System.out.println("Response : " + response.get_return());
    }
}
