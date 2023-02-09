/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.smallestint;

/**
 *
 * @author ereni
 */
import java.util.Scanner;
public class SmallestInt {

    public static void main(String[] args) {
        Scanner userints = new Scanner(System.in);
        System.out.print("Enter number of ints you want to compare:");
        int d = userints.nextInt();
        System.out.print("Enter your first integer: ");
        int smalldigit = userints.nextInt();
        
       
        for(int i = 1; i < d; i++){
        System.out.println("Enter next digit: ");
        int nextdigit = userints.nextInt();
        if  (nextdigit < smalldigit){
            smalldigit= nextdigit;
        }
    }
 
System.out.println("The Smallest int of the 7 digits is" + " " + smalldigit);
    }
   
}
