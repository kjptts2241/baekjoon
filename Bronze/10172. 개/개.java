import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|" + "\n");
        bw.write("|q p|   /}" + "\n");
        bw.write("( 0 )\"\"\"\\" + "\n");
        bw.write("|\"^\"`    |" + "\n");
        bw.write("||_/=\\\\__|" + "\n");

        bw.flush();
        bw.close();
    }
}
