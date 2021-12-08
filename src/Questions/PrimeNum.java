package Questions;
//Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
import java.util.Scanner;


public class PrimeNum {




        public static void main(String[] args)

        {

            int num;

            int prime;

            Scanner var=new Scanner(System.in);

            System.out.println("Enter a number: ");

            num=var.nextInt();

            for(int i=2;i<num;i++)

            {

                prime=0;

                for(int j=2;j<i;j++)

                {

                    if(i%j==0)

                        prime=1;

                }

                if(prime==0)

                    System.out.println(i+"is a prime number");

            }

        }


}
