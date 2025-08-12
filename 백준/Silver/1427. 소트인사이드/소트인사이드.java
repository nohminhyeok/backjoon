import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine().trim();

        String[] str = N.split("");

        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String d : str) {
            sb.append(d);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}