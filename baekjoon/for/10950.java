package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(b.readLine());

        StringBuilder s = new StringBuilder();

        for(int i = 0; i < c; i ++) {
            String str = b.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            s.append(A + B).append("\n");
        }
        System.out.print(s);
    }
}