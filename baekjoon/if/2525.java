package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String read1 = br.readLine();
        int cookTime = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(read1, " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int endHour = ((h * 60) + (m + cookTime)) / 60;
        int endMin = ((h * 60) + (m + cookTime)) % 60;

        System.out.printf("%d %d", endHour > 23 ? endHour - 24 : endHour, endMin > 59 ? endMin - 60 : endMin);

    }
}