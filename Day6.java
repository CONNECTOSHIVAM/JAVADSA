import java.util.Scanner;

public class Day6 {

    // Date:- 21oct 2024. || TOPIC:- [FUNCTION & METHOODS] ||

    // public static int calculateSum(int num1, int num2){

    // int sum = num1+num2;
    // return sum;
    // }

    // public static void main(String[] args) {

    // //Question 1:- write a program sum of two number using functions.

    // //take input form user.
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the num1:- ");
    // int a = sc.nextInt();
    // System.out.print("Enter the num2:- ");
    // int b = sc.nextInt();

    // int sum = calculateSum(a,b);
    // System.out.println(sum);

    // // Question 2:- find the factorial.
    // public static int findFactorial(int a) {
    // int fac = 1;
    // for (int i = a; i >= 1; i--) {
    // fac *= i;
    // }
    // return fac;

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number:- ");
    // int a = sc.nextInt();
    // int fact = findFactorial(a);

    // System.out.println(a + " Factorial is :- " + fact);

    // }

    // Question 3:- Calculate the binomial coefficient. formula n!/r!(n-r) --->ncr

    // // function to calculate factorial.
    // public static int factorial(int n) {
    // int fact = 1;
    // for (int i = n; i >= 1; i--) {
    // fact *= i;
    // }
    // return fact;
    // }

    // // function to calculate binomial Coefficient.
    // public static int binomialCoefficient(int n, int r) {
    // int a = factorial(n);
    // int b = factorial(r);
    // int c = factorial(n - r);

    // int binoCoeff = a / (b * c);

    // return binoCoeff;
    // }

    // public static void main(String[] args) {
    // int s = binomialCoefficient(5, 2);
    // System.out.println("binomial Coefficient:- " + s);

    // }

    // Questions 4: - write a program to find the prime number.

    // // check number is prime or not using the function.

    // public static void findPrime(int n) {
    // int prime = 0;
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // prime++;
    // }
    // }
    // if (prime == 2) {
    // System.out.println(n + " is prime number.");
    // } else {
    // System.out.println(n + " is not prime number.");
    // }
    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number:- ");
    // int number = sc.nextInt();

    // findPrime(number);

    // }

    // // Methood 2

    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i < n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return isPrime;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number:- ");
    // int a = sc.nextInt();
    // System.out.println(isPrime(a));
    // }

    // Question 5:- write a program for range of prime till n number.

    // check prime or not
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return isPrime;

    }

    public static void primeInRange(int x) {
        // System.err.println("Range of Factorial:- " + n);
        for (int i = 2; i <= x; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int a = sc.nextInt();
        // System.out.println(isPrime(a));
        primeInRange(a);
    }

}
