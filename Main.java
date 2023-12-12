package QuadraticEquation;


import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scanner.nextInt();
        System.out.print("Enter b:");
        int b = scanner.nextInt();
        System.out.print("Enter c:");
        int c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println( quadraticEquation.display());
        System.out.println( quadraticEquation.getDiscriminant());
        System.out.println( quadraticEquation.getRoot1());
        System.out.println( quadraticEquation.getRoot2());
    }
}
