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
public class Q7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System .in);
        System.out.println("Enter the size of the array");
        int a=sc.nextInt();
        int[]arr=new int[a];
        int max=0;
        System.out.println("Enter the elements of the array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element in the array is "+ max);
        
    }
}
