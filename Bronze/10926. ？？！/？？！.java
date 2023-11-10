import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String id = br.readLine();

        if (id.length() < 50 && id.equals(id)) {
            bw.write(id + "??!");
        } else {
            bw.write(id + "??!");
        }

        bw.flush();
    }
}
