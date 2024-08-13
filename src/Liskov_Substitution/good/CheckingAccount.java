package Liskov_Substitution.bad;

import java.math.BigDecimal;

public class CheckingAccount extends Account{
    @Override
    protected void deposit(BigDecimal amount) {

    }

    @Override
    protected void withdraw(BigDecimal amount) {

    }
}
