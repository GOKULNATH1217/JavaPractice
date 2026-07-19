import java.util.*;
class BankAccount {
    String Name;
    int id;
    int balance=0;
    BankAccount()
    {
        this.Name="unknown";
        this.id=0;
    }
    BankAccount(String name)
    {
        this.Name=name;
        this.id=0;
    }
    BankAccount(String name,int id)
    {
        this.Name=name;
        this.id=id;
    }
    void fetchBalance()
    {
        System.out.println("YOUR ACCOUNT NAME : " + Name );
        System.out.println("BALANCE = "+ this.balance);
    }
    void addBalance(int amount)
    {
        if(amount>0)
        {
            this.balance+=amount;
        }
        fetchBalance();
    }
    void debit(int amount)
    {
        if(amount<=this.balance && amount>=0)
        {
            this.balance-=amount;
        }
        else
        {
            System.out.println("BALANCE NOT AVALIABLE");
        }
        fetchBalance();
    }
    
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Enter your id : ");
        int id=sc.nextInt();
        BankAccount b1=new BankAccount(name,id);
        int input;
        do{
            System.out.println("Press 1 to Credit");
            System.out.println("Press 2 to Debit");
            System.out.println("Press 3 to check your Balance");
            System.out.println("Press 4 to exit");
            input=sc.nextInt();
            if(input==1)
            {
                System.out.println("Enter your amount : ");
                int amount=sc.nextInt();
                b1.addBalance(amount);
            }
            else if(input==2)
            {
                System.out.println("Enter your amount : ");
                int amount=sc.nextInt();
                b1.debit(amount);
            }
            else if(input==3)
            {
                System.out.println("Your Balance is : ");
                b1.fetchBalance();
            }
            else if(input==4)
            {
                System.out.println("Exited , Thank you");
            }
        }while(input>0 && input<4);

    }
}
