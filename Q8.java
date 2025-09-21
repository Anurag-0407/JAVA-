/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_5;

import java.util.Scanner;

/**
 *
 * @author moham
 */
public class Q8 {
    public static void main(String[] args){
         Scanner sc =new Scanner(System .in);
        System.out.println("Enter the integer");
        int num=sc.nextInt();
        int rev=0;
     while(num>0){
         int r=num%10;
         rev=rev*10+r;
         num/=10;
          }   
      System.out.println("Reverse of the integer is "+rev);
    }
}
