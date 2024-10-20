import java.util.Scanner;

public class Day4 {

    // Date:- 18oct 2024. to 19oct 2024

    public static void main(String[] args) {

        // Topic 1:- while loop.

        // Question 1:- print sum of n number

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the n number for addition:- ");
        // int n = sc.nextInt();
        // int i = 0;
        // int j=0;

        // while (i <= n) {
        // j = i + j;
        // i++;
        // }
        // System.out.println("Addition is :-" + j);

        // Topic 2 :- for loop

        // Question 2:- print a Square pattern

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // Through while methood
        // int i = 0;
        // while (i < 4) {
        // int j = 0;
        // while (j < 4) {
        // System.out.print(" *");
        // j++;
        // }
        // System.out.println();
        // i++;
        // }

        // Question 3:- print a reverse of an number.
        // int number = 1234567;

        // while (number > 0) {
        // int lastDigit = number % 10;
        // System.out.print(lastDigit);
        // number = number / 10;
        // }

        // Question 4:- Reverse the given number.
        // int n = 1098775;
        // int rev = 0;

        // while (n > 0) {
        // int lastD = n % 10;
        // rev = (rev * 10) + lastD;
        // n /= 10; // n = n/10

        // }
        // System.out.println(rev);

        // Question 5:- Write a Number to check prime or not.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number:- ");
        // int n = sc.nextInt();

        // int count = 0;

        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println(n + " is a prime number.");
        // } else {
        // System.out.println(n + " is not prime number.");
        // }

        // Question 6:- Write a program that reads a set of integers, and then prints
        // the sum of the even and odd integers.

        // Scanner sc = new Scanner(System.in);
        // int addEven = 0;
        // int addOdd = 0;
        // System.out.println("Enter interger value(type char value to finish):- ");

        // // loop to read integers.
        // while (sc.hasNextInt()) {
        // int number = sc.nextInt();

        // //check if the number is even or odd and add it to the respective
        // value(addEven/addOdd).
        // if (number % 2 == 0) {
        // addEven += number;
        // } else {
        // addOdd += number;
        // }
        // }
        // sc.close();
        // //Print the results.
        // System.out.println("Sum of even Number:- " + addEven);
        // System.out.println("Sum of odd Number:- " + addOdd);

        // Question 7:- write a program to find factorial form user input.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number:- ");
        // int num = sc.nextInt();
        // int fact = 1;

        // for (int i = num; i >= 1; i--) {
        // fact *= i;
        // }
        // System.out.println(num + " Factorial is :- " + fact);
        // sc.close();

        // Question 8:- : Write a program to print the multiplication table of a number
        // N,
        // entered by the user.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(For get Table):- ");
        int num = sc.nextInt();

        System.out.println("Table of " + num + " :-");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);

        }

    }

}
