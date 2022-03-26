import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();

        task1.answerTask1();
        System.out.println("Write colours sequence:");
        task2.answerTask2(scanner.nextLine());
        task3.answerTask3();
        System.out.println("Write names sequence:");
        task4.answerTask4(scanner.nextLine());
        System.out.println("Write list of users and groups:");
        task5.answerTask5(scanner.nextLine(), scanner.nextLine());

        scanner.close();
    }
}
