package models;

import java.math.BigInteger;

public class UserAccountBalance {

    private BigInteger AccountBalance;
    private BigInteger DepositAmount;
    private BigInteger WithdrawAmount;

    public BigInteger getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(BigInteger accountBalance) {
        AccountBalance = accountBalance;
    }

    public BigInteger getDepositAmount() {
        return DepositAmount;
    }

    public void setDepositAmount(BigInteger depositAmount) {
        DepositAmount = depositAmount;
    }

    public BigInteger getWithdrawAmount() {
        return WithdrawAmount;
    }

    public void setWithdrawAmount(BigInteger withdrawAmount) {
        WithdrawAmount = withdrawAmount;
    }

}
