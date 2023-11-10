import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((a+b)%c + "\n");
        bw.write(((a%c)+(b%c))%c + "\n");
        bw.write( (a*b)%c + "\n");
        bw.write( ((a%c)*(b%c))%c + "\n");

        bw.flush();
        bw.close();
    }
}
