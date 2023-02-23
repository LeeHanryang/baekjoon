package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer A = Integer.parseInt(br.readLine());
        Integer B = Integer.parseInt(br.readLine());

        String strB = String.valueOf(B);

        for(int i = strB.length(); i > 0; i--){
            Integer multi = A * Integer.parseInt(strB.substring(i - 1, i));
            
            System.out.println(multi);
        }
        
        System.out.println(A * B);
    }
}