package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String read = br.readLine();

        StringTokenizer st = new StringTokenizer(read, " ");

        Long A = Long.parseLong(st.nextToken().trim());
        Long B = Long.parseLong(st.nextToken().trim());
        Long C = Long.parseLong(st.nextToken().trim());
        
        System.out.println(A + B + C);
    }
}