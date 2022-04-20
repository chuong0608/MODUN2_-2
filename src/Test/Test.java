package Test;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer > wStack= new Stack<Integer>();
        System.out.println("Nhập số phần tử mảng : ");
        int number = scanner.nextInt();
        int [] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i]=i;
        }
        System.out.println("mảng ban đầu");
        for (int i = 0; i <number ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            wStack.push(arr[i]);
        }
        for (int i = 0; i < number; i++) {
            arr[i]=wStack.pop();
        }
        System.out.println("Mảng sau khi đảo : ");
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i]+ "\t");
        }

    }
}
