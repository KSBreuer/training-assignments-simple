package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private int transferLimit = 100;

    @Override
    public Transfer makeTransfer(String counterAccount, Money amount)
            throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        // 2. Assuming result is 9-digit bank account number, validate 11-test:

        if (isValidAccount(counterAccount)) {
            // 3. Look up counter account and make transfer object:
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            return result;
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }

    @Override
    float getInterestPercentage() {
        return INTEREST_PERCENTAGE;
    }
}
// end::CheckingAccount[]
