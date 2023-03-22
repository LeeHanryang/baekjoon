package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");
        
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        
        int[] baguni = new int[n];
        
        for(int l = 0 ; l < m; l++) {
            String[] num2 = br.readLine().split(" ");
    
            int i = Integer.parseInt(num2[0]) - 1;
            int j = Integer.parseInt(num2[1]) - 1;
            int k = Integer.parseInt(num2[2]);

            for(; i <= j; i++) {
                baguni[i] = k;
            }
        }

        for (int i : baguni) {
            sb.append(i).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}