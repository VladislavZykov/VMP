import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Druppy");

        System.out.println("Cat:");
        System.out.println("Run: " + cat.run(180));// 200
        System.out.println("Swim: " + cat.swim(-10)); // 0
        System.out.println("Jump:" + cat.jump(2.5)); //2

        System.out.println("Dog:");
        System.out.println("Run: " + dog.run(470));//500
        System.out.println("Swim: " + dog.swim(5));//10
        System.out.println("Jump:" + dog.jump(0.3));//0.5

    }
}
