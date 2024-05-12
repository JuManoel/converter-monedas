package chalenger.alura;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;


public class ConnectorApi {
    public static JSONObject connect(String monedaFrom, int taxa){
        /*
         * monedaFrom sirve para cojer la moneda de donde viene
         * monedaTo sirve para cojer la moneda para donde Va
         * taxa solo sirve unicamente para caso donde este las tasas de conversion cambien
         * podamos correjir con ese parametro
         * 
         */
        String url_str="https://v6.exchangerate-api.com/v6/df50fed224faf8c5af5f6bbe/latest/"+monedaFrom;
        
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url_str))
                        .build();
            HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json = new JSONObject(response.body());
            return json.getJSONObject(Taxas.nombres(taxa));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
