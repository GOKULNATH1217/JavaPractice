import java.util.Scanner;

class BankAccount{
    private String AccountName;
    private int AccountNumber;
    protected int Balance=0;
    BankAccount(String AccountName,int AccountNumber)
    {
        this.AccountName=AccountName;
        this.AccountNumber=AccountNumber;
    }
    public String getAccountName()
    {
        return this.AccountName;
    }
    public int getAccountNumber()
    {
        return AccountNumber;
    }
    void credit(int amount)
    {
        if(amount>0)
        this.Balance+=amount;
    }
    void debit(int amount)
    {
        if(amount>0 && amount<=Balance)
        this.Balance-=amount;
    }
    void display()
    {
        System.out.println(Balance);
    }

}
class CurrentAccount extends BankAccount{
    CurrentAccount(String AccountName,int AccountNumber)
    {
        super(AccountName, AccountNumber);
    }
    private int overdraftamount=10000;
    void debitOverDraft(int amount)
    {
        if(amount<=Balance+overdraftamount)
        {
            Balance = Balance-amount;
        }
    }
    void overdraftDispaly()
    {
        System.out.println("YOUR BALANCE WITH OVERDRAFT AMOUNT : "+ (Balance+overdraftamount));
    }

}
class SavingsAccount1 extends BankAccount
{
    SavingsAccount1(String AccountName,int AccountNumber)
    {
        super(AccountName, AccountNumber);
    }
    int Interest(int percentage,int year)
    {
        return (int)(Balance * (percentage / 100.0) * year);
    }
    
}
public class SavingsAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Enter your id : ");
        int id=sc.nextInt();
        SavingsAccount1 b1 = new SavingsAccount1(name,id);
        CurrentAccount c1 = new CurrentAccount(name, id);
        int input;
        do{
            System.out.println("Press 1 to Credit from Saving Account");
            System.out.println("Press 2 to credit from Current Account");
            System.out.println("Press 3 to Debit");
            System.out.println("Press 4 to check your Balance");
            System.out.println("Press 5 to view Interest");
            System.out.println("Press 6 to exit");
            input=sc.nextInt();
            if(input==1)
            {
                System.out.println("Enter your amount : ");
                int amount=sc.nextInt();
                b1.credit(amount);
            }
            else if(input==2)
            {
                System.out.println("Enter the amount : ");
                int amount=sc.nextInt();
                c1.debitOverDraft(amount);
            }
            else if(input==3)
            {
                System.out.println("Enter your amount : ");
                int amount=sc.nextInt();
                b1.debit(amount);
            }
            else if(input==4)
            {
                System.out.println("Your Balance is : ");
                b1.display();;
            }
            else if(input==5)
            {
                System.out.println("ENTER THE NUMBER OF YEARS : ");
                int year=sc.nextInt();
                System.out.println("ENTER THE PERCENTAGE : ");
                int percentage=sc.nextInt();
                System.out.println(b1.Interest(percentage,year));
            }
            else if(input==6)
            {
                System.out.println("EXITED , THANK YOU..!!");
            }
        }while(input>0 && input<6);
        
    }
}
