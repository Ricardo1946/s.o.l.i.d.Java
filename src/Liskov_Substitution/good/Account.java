package Liskov_Substitution.bad;

import java.math.BigDecimal;

/**
 * The LPS states that object of a superclass
 * should be replaceable with objects of its subclass without affecting the
 * correctness of the program.
 */

public abstract class Account {
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw (BigDecimal amount);

}
