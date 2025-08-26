public class AppLauncher {
    public static void main(String[] args) {

        HelloWorld student = new HelloWorld("Mitchel", 19);
        HelloWorld teacher = new HelloWorld("Dr. Owen");
        student.introduce();
        student.greet();
        student.greet("Not Mitchel");
        teacher.greet();

        }
}