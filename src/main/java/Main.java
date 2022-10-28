import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        // declare name variable
        String name;

        // initializing scanner
        Scanner input = new Scanner(System.in);

        // prompting user to tell their name
        System.out.println("Please enter your name:");

        //once code runs telling user to input name and stores in to the name variable
        name = input.nextLine();

        //test scanner
        //System.out.println(name);

        //designating value "Bob" into String bob
        String bob = "Bob";

        //designating value "Alice" into String alice
        String alice = "Alice";

        // saying if name = Bob then print out Hello
        if (name.equals(bob)) {
            System.out.println("Hello Bob!");
        }

        //saying if name = Alice then print out Hello
        else if (name.equals(alice)) {
            System.out.println("Hello Alice!");
        }

        //Saying if Bob or Alice is not the input then output should bw Try Again
        else {
            System.out.println("Try Again");
        }


    }
}
