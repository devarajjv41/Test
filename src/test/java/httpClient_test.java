import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class httpClient_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		HttpClient httpclient = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
											.GET()
											.uri(URI.create("https://simple-books-api.glitch.me/books/1"))
											.build();
		HttpResponse<String> response = null;
		try {
			response = httpclient.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(response.statusCode());
		System.out.println(response.body());
		

	}

}
