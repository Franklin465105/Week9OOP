package ie.atu;

import ie.atu.week9.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void constructorInitialisation()
    {
        account = new BankAccount("ACC12345", "Paul", 100);
        assertEquals("ACC12345", account.getAccNo());
        assertEquals("Paul", account.getName());
        assertEquals(100, account.getBalance());
    }

    @Test
    void constructorNegativeInitialisation()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new BankAccount("ACC12345", "Paul", -100));
        assertEquals("Balance must be greater than 0.", ex.getMessage());
    }

    @Test
    void depositPositiveAmountIncreaseBalance()
    {
        account = new BankAccount("ACC12345", "Paul", 100);
        double initialBalance = account.getBalance();
        double DepositAmount = 100;
        account.Deposit(DepositAmount);
        assertEquals(initialBalance + DepositAmount, account.getBalance());
    }

    @Test
    void depositNegativeAmountDecreaseBalance()
    {
        account = new BankAccount("ACC12345", "Paul", 100);
        double initialBalance = account.getBalance();
        double DepositAmount = -50;
        account.NegDeposit(DepositAmount);
        assertEquals(initialBalance + DepositAmount, account.getBalance(), "Balance must be greater than 0.");
    }

}
