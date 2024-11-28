package org.Examples.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Account class.
 * Includes tests for getters, setters, constructor behavior, and deposit functionality.
 */
class AccountTest {

    private Account account;

    /**
     * Sets up an Account object with an initial balance of 100.0 for testing.
     */
    @BeforeEach
    void setUp() {
        account = new Account("Test Account", 100.0);
    }

    /**
     * Tests the getName method, makes sure it returns the correct account name.
     */
    @Test
    void getName() {
        assertEquals("Test Account", account.getName(), "The account name should be 'Test Account'.");
    }

    /**
     * Tests the setName method, makes sure the account name can be updated correctly.
     */
    @Test
    void setName() {
        account.setName("Updated Account");
        assertEquals("Updated Account", account.getName(), "The account name should be updated to 'Updated Account'.");
    }

    /**
     * Tests the getBalance method, returns the correct balance.
     */
    @Test
    void getBalance() {
        assertEquals(100.0, account.getBalance(), "The initial balance should be 100.0.");
    }

    /**
     * Tests the deposit method to ensure:
     * Positive amounts are added to the balance correctly.
     * Negative amounts do not affect the balance.
     */
    @Test
    void credit() {
        // Test credit positive amount (works)
        account.credit(50.0);
        assertEquals(150.0, account.getBalance(), "The balance should be updated to 150.0 after depositing 50.0.");

        // Test credit negative amount (ignored)
        account.credit(-50.0);
        assertEquals(150.0, account.getBalance(), "The balance should remain 150.0 when depositing a negative amount.");
    }

    /**
     * Tests the debit method to ensure:
     * - Negative amounts do not affect the balance.
     * - Amounts larger than the balance are ignored.
     * - Positive amounts less than the balance are deducted correctly.
     */
    @Test
    void debit() {
        account.debit(-50.0);
        assertEquals(100.0, account.getBalance(), "The balance should remain 100.0 when debiting a negative amount.");

        account.debit(150.0);
        assertEquals(100.0, account.getBalance(), "The balance should remain 100.0 when debiting an amount larger than the balance.");

        account.debit(50.0);
        assertEquals(50.0, account.getBalance(), "The balance should be updated to 50.0 after debiting 50.0.");
    }


    /**
     * Tests the Account constructor and makes sure the balances are 0.
     */
    @Test
    void testNegativeBalanceInConstructor() {
        Account negativeBalanceAccount = new Account("Negative Balance", -50.0);
        assertEquals(0.0, negativeBalanceAccount.getBalance(), "The balance should default to 0 for negative initial values.");
    }

    /**
     * Tests the execution procedure, verifying:
     * - Correct account creation with an initial balance.
     * - Positive deposits update the balance correctly.
     * - Negative deposits are ignored.
     * - Debit negative amount (ignored).
     * - Debit amount larger than balance (ignored).
     * - Debit amount less than balance (works).
     * - Correct final balance matches expected results.
     */
    @Test
    void testingFinalBalance() {

        account.credit(100.0);
        assertEquals(200.0, account.getBalance(), "The balance should be updated to 300.0 after depositing 100.0.");

        account.credit(-50.0);
        assertEquals(200.0, account.getBalance(), "The balance should remain 300.0 when depositing a negative amount.");

        account.debit(-50.0);
        assertEquals(200.0, account.getBalance(), "The balance should remain 300.0 when debiting a negative amount.");

        account.debit(400.0);
        assertEquals(200.0, account.getBalance(), "The balance should remain 300.0 when debiting an amount larger than the balance.");

        account.debit(50);
        assertEquals(150, account.getBalance(), "The balance should be updated to 200.0 after debiting 100.0.");

        assertEquals(150, account.getBalance(), "The final balance should be 150.");
    }
}