package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(b.readLine());
        StringTokenizer st = new StringTokenizer(b.readLine());
        int v = Integer.parseInt(b.readLine());
        int sum = 0;

        int[] iArr = new int[cnt];

        for(int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(st.nextToken());

            if(iArr[i] == v) sum++;
        }

        System.out.println(sum);
    }
}