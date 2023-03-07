package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();

        String inputLine;
        StringTokenizer st;
        int sum;

        while ((inputLine = b.readLine()) != null) {
            st = new StringTokenizer(inputLine);

            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            
            s.append(sum).append("\n");

        }

        System.out.print(s);
    }
}