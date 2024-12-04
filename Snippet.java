import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Snippet {

    public static void main(String[] args) {
        // Replace these with your own inputs
        String MSISDN = "+94762555196";
        String SRC = "your-send-id"; // Removed leading space
        String MESSAGE = "bye";
        String AUTH = "youer-assess-token"; // Replace with your Access Token

        // Create the message payload
        String jsonPayload = String.format(
                "{\"recipient\":\"%s\", \"sender_id\":\"%s\", \"message\":\"%s\"}",
                MSISDN.trim(), SRC.trim(), MESSAGE.trim()
        );

        try {
            // Correct API URL
            URL url = new URL("https://sms.send.lk/api/v3/sms/send"); // Updated endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set headers
            conn.setRequestMethod("POST");
            conn.setRequestProperty("accept", "application/json");
            conn.setRequestProperty("authorization", "Bearer " + AUTH);
            conn.setRequestProperty("cache-control", "no-cache");
            conn.setRequestProperty("content-type", "application/json"); // JSON

            // Allow sending data
            conn.setDoOutput(true);

            // Write the JSON payload
            try (OutputStream os = conn.getOutputStream()) {
                os.write(jsonPayload.getBytes());
                os.flush();
            }

            // Get response
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (Scanner scanner = new Scanner(conn.getInputStream())) {
                    String response = scanner.useDelimiter("\\A").next();
                    System.out.println("Response: " + response);
                }
            } else {
                System.out.println("HTTP Error Code: " + responseCode);
            }

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
