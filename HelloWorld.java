/**
 * The HelloWorld class represents a person with a name and optionally an age,
 * and provides methods to introduce and greet them.
 */
public class HelloWorld {

    String name;
    private int age;

    /**
     * Constructs a HelloWorld object with the specified name.
     *
     * @param name the name of the person
     */
    public HelloWorld(String name) {
        this.name = name;
    }

    /**
     * Constructs a HelloWorld object with the specified name and age.
     *
     * @param name the name of the person
     * @param age the age of the person (optional)
     */
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Introduces the person by printing their name and age.
     */
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    /**
     * Greets the person using their name.
     */
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Greets another person by name.
     *
     * @param name the name of the person to greet
     */
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}