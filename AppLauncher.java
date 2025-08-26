import java.util.Scanner;

public class AppLauncher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scanner.nextLine();
        System.out.print("Enter your age: ");
        int userage = scanner.nextInt();

        HelloWorld student = new HelloWorld(username, userage);
        HelloWorld teacher = new HelloWorld("Dr. Owen");
        student.introduce();
        student.greet();
        student.greet("Not Mitchel");
        teacher.greet();

        }
}