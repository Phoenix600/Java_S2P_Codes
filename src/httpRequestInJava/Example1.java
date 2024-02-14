package httpRequestInJava;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Example1 {
    public static void main(String...args) throws Exception{
   HttpRequest httpRequest =  HttpRequest.newBuilder().GET().uri(URI.create("https://jsonplaceholder.typicode.com/todos/1")).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

}
