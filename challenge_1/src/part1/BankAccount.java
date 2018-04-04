package part1;

public class BankAccount
{
    private String acc_number;
    private  double acc_balance;
    private String customer_name;
    private String email;
    private String phone_no;

    public static void main(String args[])
    {
        double deposit;
        BankAccount acc = new BankAccount();
        acc.deposit(deposit = 4.0);

    }

    public BankAccount()
    {
        this("1224", 1.00,"Deafult Name", "email@gmail.com", "+61 487 145755"); //calling the constructor below
        this.acc_balance = 0.0;
    }

    public BankAccount(String acc_number, double acc_balance, String customer_name, String email, String phone_no){

    }
    public void setAccountNumber(String account_number)
    {
        this.acc_number = account_number;
    }

    public String getAccountNumber()
    {
        return this.acc_number;
    }

    public void setAccountBaance(double account_balance)
    {
        this.acc_balance = account_balance;
    }

    public double getAccountBalance()
    {
        return this.acc_balance;
    }

    public void setCustomerName(String name)
    {
        this.customer_name = name;
    }

    public String getCustomerName()
    {
        return this.customer_name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setPhoneNumber(String ph_no)
    {
        this.phone_no = ph_no;
    }

    public String getPhoneNumber()
    {
        return this.phone_no;
    }

    public void deposit(double value)
    {
        this.acc_balance = this.acc_balance + value;
        System.out.println("Your Account Balance is $" + this.acc_balance);
    }

    public void withdraw(double value)
    {
        if(this.acc_balance - value < 0)
        {
            System.out.println("Sorry Insufficient Funds in Account");
        }
        else{
            this.acc_balance = this.acc_balance - value;
            System.out.println("Account Balance is $" + this.acc_balance);
        }

    }
}
