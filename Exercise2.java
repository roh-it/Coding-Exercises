/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Rrohi
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,r,n;
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Enter the number of Stars: ");
        n = sc.nextInt();
        for(i=0;i<=r;i++)
        {
            if((i%2)!=0)
        {
            for(j=1;j<=n;j++)
            {
                System.out.println("*");
            }
        }
            else
            {
                    for(j=1;j<=n-1;j++)
                    {
                    System.out.println("*");
                    }
                    }
            System.out.println("\n");
        }
    }
}
   
