import java.io.*;
import java.util.*;

public class RandomNum {
  public static void main(String args[]) {

    // Challenge 1

    Scanner askNum = new Scanner(System.in);

    System.out.println("Enter a negative number");
    int negative = askNum.nextInt();
    System.out.println("Number entered: " + negative);

    System.out.println("Enter a positive number greater than " + Math.abs(negative));
    int positive = askNum.nextInt();
    System.out.println("Number entered: " + positive);

    int random1 = (int) (Math.random() * positive) + negative;
    int random2 = (int) (Math.random() * positive) + negative;
    System.out.println("Your random numbers are " + random1 + " and " + random2);

    // Challenge 2

    Scanner story = new Scanner(System.in);

    System.out.println("Enter your name.");
    String name = story.nextLine();
    System.out.println("Enter any fruit or vegetable");
    String fruit = story.nextLine();
    System.out.println("Enter any positive number");
    int quantity = story.nextInt();
    System.out.println("Enter a positive number containing a decimal");
    double price = story.nextDouble();
    double total = price * quantity;



    System.out.println(name + " goes to the store to buy " + quantity + " " + fruit + "s. One " + fruit + " costs $" + price + ". " + name + " buys a total of " + quantity + " " + fruit + "s, which costs a total of $" + total );


  }
}