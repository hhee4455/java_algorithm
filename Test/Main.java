package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] presum = new int[N+1];
        int[] A = new int[N];
        for (int k = 0; k < N; k++) {
            A[k] = sc.nextInt();
            presum[k] = A[k] + A[k+1];
        }
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();


        }


    }
}
