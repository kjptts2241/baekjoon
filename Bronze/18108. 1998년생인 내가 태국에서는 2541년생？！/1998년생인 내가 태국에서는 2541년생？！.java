import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String yearS = br.readLine();

        int yearI = Integer.parseInt(yearS);
        bw.write(yearI - 543 + "\n");

        bw.flush();
    }
}
