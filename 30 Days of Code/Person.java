
import java.io.*;
import java.util.*;

public class Person {

    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        String message = "You are ";
        if (age < 13) {
            message += "young.";
        } else if (age >= 13 && age < 18) {
            message += "a teenager.";
        } else {
            message += "old.";
        }
        System.out.println(message);
    }

    public void yearPasses() {
        age ++;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int age = scan.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        scan.close();
    }
}
