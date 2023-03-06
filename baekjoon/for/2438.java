package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();
        
        int c = Integer.parseInt(b.readLine());
        
        for(int i = 1; i <= c; i ++) {
            s.append("*".repeat(i));
            s.append("\n");
        }
        b.close();
        System.out.print(s);
    }
}