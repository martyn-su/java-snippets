//This snippet asks the user for their favorite movie line.
//It takes the line and splits it into an array
//It also reports the length of the array, and each item in it

import java.util.Scanner;

public class string_methods {
    public static void main(String[] args) {

        System.out.println("Enter your favorite movie catch phrase: \n");

        try (Scanner sc = new Scanner(System.in)) {
            String favLine = sc.nextLine();

            String favArr[] = favLine.split(" ");
            System.out.println("The length of the array is: " + favArr.length);
            System.out.println("Here are the array items: ");

            for (String w : favArr) {
                System.out.println(w);

            }
        }
    }
}
