import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        for (int i = 0; i < 40; i++) {
            Random random = new Random();
            Dog dog = new Dog("Dog " + i, random.nextInt(20) + 10);
            myHashSet.add(dog + "");
            System.out.println(dog + "\n");
        }
    }
}