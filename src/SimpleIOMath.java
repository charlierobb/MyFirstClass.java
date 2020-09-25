import java.sql.SQLOutput;
import java.util.Scanner;
/**
* SimpleIOMath is a class that asks the user a few questions,
 * takes the input from the user, stores the information in the class variables,
 * and then provides some output back to the user giving them some information
 * based on their inputs.
 * @version 09-24-2020
 * @author charlie robb
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;


    /**
     * Ask the user for some info.
     */

    public void promptUser()    {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        Scanner s = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = s.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = s.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = s.nextInt();


    }

    /**
     * Print the info that the user inputs.
     */
    public void printInfo()    {
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        System.out.println("At your next birthday, you will turn " + (age + 1) + ".");
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (Math.pow(favNumber,2)));
        System.out.println("* end of program *");
    }

    private int smallestPrimeFactor(int age){
      int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,43, 47,53,59,61};
      for(int factor : primes)  {
          if(age % factor == 0) {
              return factor;
          }
      }
      return age;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args Command line arguments, if needed
     */
    public static void main(String[] args)   {
        SimpleIOMath dart = new SimpleIOMath();
        dart.promptUser();
        dart.printInfo();

    }
}
