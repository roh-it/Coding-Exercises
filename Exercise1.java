package exercise1;


import java.io.*;
import java.util.*;
class Exercise1
{
    public static void main(String args[])
    {
    int i,j,k,n;
    System.out.println("Enter a number:\t");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            System.out.println("*");
        }
            for(k=j;k<=n;k++)
            {
                System.out.println(i);
            }
    }
    
    
    
}
}