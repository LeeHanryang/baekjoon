package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(max < num) {
                max = num; 
                cnt = i;
            }
        }

        sb.append(max).append('\n').append(cnt);

        System.out.print(sb);
    }
}