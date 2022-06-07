import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Stack<Integer> stk = new Stack<>(5);
        stk.push(scanner.nextInt());
        stk.push(scanner.nextInt());
        stk.push(scanner.nextInt());
        stk.traverse();


    }
}