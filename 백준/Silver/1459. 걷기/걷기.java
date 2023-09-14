import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());

        long dist1, dist2, dist3;

        dist1 = (x+y) * w;

        if((x+y)%2 == 0) dist2 = Math.max(x, y)*s;
        else dist2 = (Math.max(x,y)-1)*s+w;

        dist3 = (Math.min(x,y)*s + (Math.abs(x-y)*w));

        long ans = Math.min(dist1, Math.min(dist2, dist3));

        System.out.println(ans);


    }
}
