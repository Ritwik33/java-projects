//calculator program.....
package com.practice;

import java.util.Scanner;

class ConditionIf {

    Scanner sc;
    private int num1,num2;

    ConditionIf(){
        sc =  new Scanner(System.in);
        System.out.print("enter first integer: ");
        num1 = sc.nextInt();
        System.out.print("enter second integer: ");
        num2 = sc.nextInt();
    }

    public int mainMenu(){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(choice<1 || choice>6){
            System.out.println("----------MAIN MENU----------");
            System.out.println("-----------------------------");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. QUIT");
            System.out.println("-----------------------------");
            System.out.println("Please enter a choice: ");
            choice = sc.nextInt();
        }
        return choice;
    }

    public void addition(){
        int sum = num1+num2;
        System.out.println("The sum is: "+sum+"\n");
    }

    public void subtraction(){
        int diff = num1-num2;
        System.out.println("The difference is: "+diff+"\n");
    }

    public void multiplication(){
        int prod = num1*num2;
        System.out.println("The product is: "+prod+"\n");
    }

    public void division(){
        if(num2==0) System.out.println("Division by zero is illegal...");
        else {
            int quot = num1/num2;
            System.out.println("The quotient is: "+quot+"\n");
        }
    }

    public void modulus(){
        int mod = num1%num2;
        System.out.println("The modulus is: "+mod+"\n");
    }

    public void quit(){
        System.out.println("Thankyou and have a nice day ahead....");
    }

    public static void main(String[] args) {
        ConditionIf obj = new ConditionIf();
        int menu_choice;
        do{
            menu_choice = obj.mainMenu();

                if(menu_choice==1) obj.addition();

                else if(menu_choice==2) obj.subtraction();


                else if(menu_choice==3) obj.multiplication();


                else if(menu_choice==4) obj.division();


                else if(menu_choice==5) obj.modulus();

                else obj.quit();

        }while(menu_choice!=6);

        System.out.println("........END OF PROGRAM.....");

    }
}