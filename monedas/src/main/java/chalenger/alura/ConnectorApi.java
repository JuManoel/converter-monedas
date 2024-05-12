package chalenger.alura;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class ConnectorApi {
    public static Moneda connect(String monedaFrom, String MonedaTo){
        String url_str="https://v6.exchangerate-api.com/v6/df50fed224faf8c5af5f6bbe/latest/"+monedaFrom;
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        Gson gson = new Gson();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accessing object
        String req_result = jsonobj.get("result").getAsString();
    }
}
