package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] iArr = new int[cnt];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < cnt; i++) {
            iArr[i] = Integer.parseInt(st.nextToken());

            min = Math.min(min, iArr[i]);
            max = Math.max(max, iArr[i]);
        }

        System.out.printf("%d %d", min, max);
    }
}