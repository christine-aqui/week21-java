package console;

import java.util.Scanner;

/* ****************************************************************************
 *
 * BRIEF //
 *
 *   Your firm is implementing its student management prototype in Java.
 *   It's a command-line program, which the registrar's office will use to
 *   add students to the database upon enrollment.
 *
 *   The program should prompt the user for a student's first name; last name;
 *   middle initial; physical address; email address; and phone number.
 *
 *   After each prompt, the program should wait for the user's input.
 *
 *   Once the user has entered every piece of information, the program should
 *   print it all back to the console, and prompt the user to enter Y if the
 *   information is correct, or any other key otherwise.
 *
 *   For now, you should collect the user's response--i.e., y or otherwise--but
 *   don't worry about handling it. We'll get to that shortly.
 *
 *****************************************************************************/

public class ConsoleIO {

  public static void main(String[] args) {


    // You need to instantiate something to read user input. Do that here.
    Scanner input = new Scanner(System.in);

    /* Print a message to the screen prompting the user for a student's first
     *   name. Then, store their response in a String variable.
     *
     *   Repeat this for each of the student's attribute: first/last/middle
     *   name; address; email; and phone number (which you'll store as a
     *   String).
     */
    System.out.println("What is your name?");
    String name = input.nextLine();
//      System.out.println(name);
    System.out.println("What is your address?");
    String address = input.nextLine();
//
    System.out.println("What is your email address?");
    String email = input.nextLine();
//
    System.out.println("What is your phone number?");
    int phoneNum = input.nextInt();
    /* Once you've gotten all the information, print the value of each
     *   variable. Use String.format, and %s to indicate a string
     *   substitution. */
    System.out.println(String.format("%s lives at %s and has an email off %s and phone# of %d", name, address, email, phoneNum));

    /* Finally, print a message asking the user if this is correct information.
     *   Collect their response in a variable called confirmation. Don't do
     *   anything with it yet, though. */
    System.out.print("Hey is that correct? [Y/ N]");
    try {
      String confirm = input.next();
    } catch (Exception e) {
      System.out.println("You didn't give me a vaild command.");
    }
  }
}
