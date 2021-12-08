package Questions;

import java.util.Scanner;

public class IncreaseDecrease
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first = sc.nextInt();

        System.out.print("Enter the second number:");
        int second = sc.nextInt();

        System.out.print("Enter the third number:");
        int third = sc.nextInt();

        if (first < second && second < third){
            System.out.println("It's in increasing order");
        }
        else if (first > second && second > third){
            System.out.println("It's in decreasing order.");
        }
        else {
            System.out.println("neither increasing or decreasing.");
        }

    }
}