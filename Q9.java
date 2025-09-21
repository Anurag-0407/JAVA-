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
public class Q9 {
    public static void main(String[] args){
         Scanner sc =new Scanner(System .in);
        System.out.println("Enter the integer");
        int a=sc.nextInt();
        int p=a;
        int rev=0;
     while(a>0){
         int r=a%10;
         rev=rev*10+r;
         a/=10;
          }   
     if(rev==p){
         System.out.println("Palindrome ");
     }
     else {
         System.out.println("Not Palindrome");
     }
    }
}
