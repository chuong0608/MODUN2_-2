package Test;
import java.util.Scanner;
import java.util.Stack;
public class DaoChuoi {
        public static void main(String[] args) {
            Stack<String> stack = new Stack<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap chuoi: ");
            String chuoi = sc.next();
            String[] arr = chuoi.split("");
            for (String s : arr) {
                stack.push(s);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(stack.pop());
            }
        }
    }

