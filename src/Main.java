// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // IntelliJ IDEA suggests fixing it.
        //Exercise 1
        /* String firstname ="Kamini";
        String lastname = "Singh";
        String name1;
        name1 = firstname+lastname;
        System.out.println(name1);

        // Exercise 2
        int num1 = 200;
        int num2=20;
        System.out.println(num2+num1);
        double result = num2/num1;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3); */

        //`exercise 3

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first_name = in.nextLine();
        System.out.print("Enter your last name: ");
        String last_name = in.nextLine();
        System.out.println("Your Name is: " + first_name + "" +last_name);

        System.out.print("Enter your first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter your second number: ");
        int number2 = in.nextInt();
        System.out.println("Your Sum is: " +(number1+number2));

        in.close();

    }
}