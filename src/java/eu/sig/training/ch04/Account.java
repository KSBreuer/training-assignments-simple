package eu.sig.training.ch04;

public abstract class Account {
    private Money balance = new Money();

    abstract float getInterestPercentage();

    public abstract Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException;

    protected boolean isValidAccount(String counterAccount) {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }

        return sum % 11 == 0;
    }

    public void addInterest() {
        Money interest = balance.multiply(getInterestPercentage());
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
