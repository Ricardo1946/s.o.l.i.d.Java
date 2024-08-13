package Liskov_Substitution.bad;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{
    @Override
    protected void deposit(BigDecimal amount) {
        //deposit into this account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount");
    }
}
