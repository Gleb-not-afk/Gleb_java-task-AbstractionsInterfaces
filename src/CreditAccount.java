public class CreditAccount extends Account{
    private long creditLimitAmount;

    public CreditAccount(long creditLimitAmount) {
        this.creditLimitAmount = creditLimitAmount;
        this.moneyAmount = creditLimitAmount;
    }

    @Override
    public boolean pay(long amount) {
        if(amount <= 0 || (moneyAmount - amount < 0)){
            return false;
        }
        else{
            moneyAmount -= amount;
            return true;
        }
    }

    @Override
    public boolean add(long amount) {
        if(amount <= 0 || moneyAmount + amount > creditLimitAmount){
            return false;
        }
        else{
            moneyAmount += amount;
            return true;
        }
    }


}
