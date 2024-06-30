import java.util.*;
import java.util.Scanner;

class ATM{
    float Bal;
    int pin=8674;
    public void checkpin(){
        System.out.println("Enter pin:");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        } 
        else{
            System.out.println("Enter valid pin");
           
        }

    }
    public void menu(){
    System.out.println("Enter your choice");
    System.out.println("1.checkBalance");
    System.out.println("2.withdraw Money");
    System.out.println("3.Deposit amount");
    System.out.println("4.Exit");
    Scanner sc=new Scanner(System.in);
    int opt=sc.nextInt();
    if(opt==1){
    checkBalance();
    }
    else if(opt==2){
        withdrawMoney();
    }
    else if(opt==3){
        depositMoney();
    }
    else if(opt==4){
        return;
    }
    else{
        System.out.println("Enter valid choice");
    }
    }
    public void checkBalance(){
        System.out.println("Balance:"+ Bal);
        menu();

    }
    public void withdrawMoney(){
        System.out.println("Enter Amount: ");
        Scanner sc=new Scanner(System.in);
        float amt=sc.nextFloat();
        if(amt>Bal){
            System.out.println("Insufficient Balance");
        }
        else{
            Bal=Bal-amt;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter Amount: ");
        Scanner sc=new Scanner(System.in);
        float amt=sc.nextFloat();
        Bal=Bal+amt;
        System.out.println("Money Deposited");
         menu();
    }


    
}
public class atmmachine{
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();
    }
}