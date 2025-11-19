package ie.atu.week9;

public class BankAccount {
    private String AccNo;
    private String Name;
    private double Balance;

    public BankAccount(String AccNo, String Name, double Balance)
    {
        if(Balance <= 0)
        {
            throw new IllegalArgumentException("Balance must be greater than 0.");
        }
        this.AccNo = AccNo;
        this.Name = Name;
        this.Balance = Balance;
    }

    public void Deposit(double DepositAmount)
    {
        Balance += DepositAmount;
    }

    public void NegDeposit(double DepositAmount)
    {
        Balance += DepositAmount;
    }

    public BankAccount() {}

    public String getAccNo() {
        return AccNo;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return Balance;
    }



}
