package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tot = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int[] iArr = new int[tot];
        String[] sArr = br.readLine().split(" ");

        for(int i = 0; i < tot; i ++){
            iArr[i] = Integer.parseInt(sArr[i]);

            if(iArr[i] < num) {
                sb.append(iArr[i]).append(" ");
            }
        }

        System.out.print(sb.toString().trim());
    }
}