public class HelloWorld {

    String name;
    private int age;

    public HelloWorld(String name) {

        this.name = name;

    }

    public HelloWorld(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void introduce() {

        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");

    }

    public void greet() {

        System.out.println("Hello, " + name + "!");

    }

    public void greet(String name) {

        System.out.println("Hello, " + name + "!");

    }
    
    public static void main(String[] args) {

    HelloWorld student = new HelloWorld("Mitchel", 19);
    student.introduce();
    student.greet();
    student.greet("Not Mitchel");

    }

}
