import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year;
        year = Integer.parseInt(br.readLine());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (year%4 == 0) {
            if (year%400 == 0) bw.write("1" + "\n");
            else if (year%100 == 0) bw.write("0" + "\n");
            else bw.write("1" + "\n");
        } else bw.write("0" + "\n");

        bw.flush();
        bw.close();
    }
}
