package com.avenger;
import java.util.Scanner;
public class avenger 
{
    Scanner sc=new Scanner(System.in);
    string name,power,weapon,planet;
    int age,;
    public void getDetails()
    {
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();
        String[] name = new String[10];
        String[] power = new String[10];
        String[] weapon = new String[10];
        String[] planet = new String[10];
        int[] age = new int[10];
        for(int i=0; i<10; i++)  
        {  
            age[i]=sc.nextInt();
            name[i]=sc.next();
            power[i]=sc.next();
            weapon[i]=sc.next();
            planet[i]=sc.next();
        }
    }
    public void displayDetails()
    {
        public static void main(String[] args)
        {
            for(int i=0;i<10;i++)
            {
                name[i]=new name();
                name[i].getDetails();
                age[i]=new age();
                age[i].getDetails();
                power[i]=new power();
                power[i].getDetails();
                weapon[i]=new weapon();
                weapon[i].getDetails();
                planet[i]=new planet();
                planet[i].getDetails();
            }
            for(int i=0;i<10;i++)
            {
                name[i].displayDetails();
                age[i].displayDetails();
                power[i].displayDetails();
                weapon[i].displayDetails();
                planet[i].displayDetails();
            }
    }
}