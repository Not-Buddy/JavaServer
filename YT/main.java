import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Paths;
import java.nio.file.*;

public class main
{
  public static void main(String args[]) throws IOException
  {
    //Create a new HttpServer instancne bound to port 8000
    HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);

    //Define the root context ("/") and associate it with the HelloHandler
    server.createContext("/", new HelloHandler());

    //Set the default executor (null which means using the default browser)
    server.setExecutor(null);


    //Start server
    server.start();
    System.out.println("Server started on port 8000");
    
  }
  static class HelloHandler implements HttpHandler 
  {
    @Override
    public void handle(HttpExchange exchange) throws IOException 
    {
        byte[]response = Files.readAllBytes(Paths.get("/home/buddy/Programming/JavaServer/YT/index.html"));

        //Send an Http response header with a 200 OK status and the length of the response 
        exchange.sendResponseHeaders(200, response.length);

        //Get the response body output stream 
        OutputStream os = exchange.getResponseBody();
        
        //Write the response message string to the output stream
        os.write(response);

        //Close the output stream
        os.close();
    }
  }
}
