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
public class Q10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice(1 or 2)");
        System.out.println("1>> Decimal to hexadecimal");
        System.out.println("2>> Hexadecimal to decimal");
        int c=sc.nextInt();
        sc.nextLine();
        switch(c){
            case 1:
                System.out.println("Enter the decimal number");
                int dec=sc.nextInt();
                String hex=Integer.toHexString(dec).toUpperCase();
                System.out.println(hex);
                break;
            case 2:
                System.out.println("Enter the hexadecimal number");
                 String hex2=sc.nextLine();
                 int dec2=Integer.parseInt(hex2,16);
                 System.out.println(dec2);
                 break;
            default:
                System.out.println("Enter a valid number");
               
        }
    }
}