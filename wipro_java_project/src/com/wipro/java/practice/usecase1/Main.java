package com.wipro.java.practice.usecase1;
import java.util.*;

public class Main {
    public static int countPairs(int N, int[] A) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            // Maintain a decreasing stack
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                stack.pop();
            }
            
            // The number of valid pairs ending at `i`
            count += stack.size();
            
            // Push current index onto the stack
            stack.push(i);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] A = new int[N];
        String[] temp = scanner.nextLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(temp[i]);
        }
        
        System.out.println(countPairs(N, A));
    }
}
