import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Rest {

    private String url;
    private String method;

    public Rest(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public String connectToEndpoint(String body) throws IOException {
        URL obj = new URL(this.url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod(this.method);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setRequestProperty("Content-Type","application/json");
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(body);
        wr.flush();
        wr.close();
        int responseCode = con.getResponseCode();

        if(responseCode != 200) {
            throw  new Error("Código de error" + responseCode);
        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String output;
        StringBuilder response1 = new StringBuilder();

        while ((output = in.readLine()) != null) {
            response1.append(output);
        }
        in.close();

        return response1.toString();
    }

}
