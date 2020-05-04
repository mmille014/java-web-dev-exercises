package exercises.technology;

public class Computer {
    private String name;
    private String speed;
    private Integer age;

    public  Computer(String name, String speed, Integer age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }
    public static void startUpTime() {
        System.out.println("The computer's startup time is 10 seconds.");
    }
    public static void seating() {
        System.out.println("A leather office chair is utilized for the computer.");
    }
}
