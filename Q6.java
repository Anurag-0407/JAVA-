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
public class Q6 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f= sc.nextInt();
        int fact=1;
        for(int i=f;i>1;i--){
            fact*=i;
        }
        System.out.println("Factorial of "+ f +" is "+ fact);
    }
}
