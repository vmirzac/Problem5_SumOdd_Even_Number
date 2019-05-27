//Given an array of integers, determine the sum of odd numbers and the amount of even numbers	
import java.util.Scanner;

class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int n, sumE = 0, sumO = 0;;
        System.out.print("Enter the number of elements in array:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}
