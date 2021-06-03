/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

package Exercise_4;
/*
Create a simple mad-lib program that prompts for a noun, a verb, an adverb,
and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.
 */
import java.util.Scanner;
public class ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter a noun");

        String noun = input.nextLine();

        System.out.println("\nEnter a verb");

        String verb = input.nextLine();

        System.out.println("\nEnter an adjective");

        String adj = input.nextLine();

        System.out.println("\nEnter an adverb");

        String adv = input.nextLine();

        System.out.printf("%s %s %s %s %s%s", "The", adj, noun, verb, adv, ". That's hilarious!");
    }
}
