import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        queue<String> list = new queue<>(15);
        System.out.println("input 1 :");
        list.enqueue(scanner.nextLine()); // First added
        System.out.println("input 2 :");
        list.enqueue(scanner.nextLine()); // Second
        System.out.println("input 3 :");
        list.enqueue(scanner.nextLine()); // Third
        System.out.println("input 4 :");
        list.enqueue(scanner.nextLine()); //Fourth
        System.out.println("input 5 :");
        list.enqueue(scanner.nextLine());//Fifth
        System.out.println("input 6 :");
        list.enqueue(scanner.nextLine());//Sixth
        System.out.println(list.dequeue());
        System.out.println(list.size());
        System.out.println(list.dequeue());
    }
}