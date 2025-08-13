import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] xy = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xy, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]); // y 기준
            return Integer.compare(a[0], b[0]);                   // y 같으면 x
        });
        
        for(int i=0; i<n; i++) {
        	System.out.println(xy[i][0]+" "+xy[i][1]);
        }
        
    }
}
