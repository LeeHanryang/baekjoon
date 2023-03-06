package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = Integer.parseInt(b.readLine());
        int cnt = Integer.parseInt(b.readLine());
        int total = 0;
        
        for(int i = 0; i < cnt; i ++) {
            StringTokenizer st = new StringTokenizer(b.readLine());
            total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        System.out.print(total == sum ? "Yes" : "No");
    }
}