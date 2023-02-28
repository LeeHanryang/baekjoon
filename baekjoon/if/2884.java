package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken()) * 60;
        int m = Integer.parseInt(st.nextToken());

        int sumMin = (h + m) - 45 < 0 ? (h + m) + (60 * 24) - 45 : (h + m) - 45;

        System.out.printf("%d %d", sumMin/60, sumMin%60);   

    }
}