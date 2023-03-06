package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(b.readLine());

        b.close();

        StringBuilder s = new StringBuilder();

        for(int i = 1; i <= 9; i++) {
            s.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
        }
        System.out.print(s);
    }
}