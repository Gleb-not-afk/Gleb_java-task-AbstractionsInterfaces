public class SimpleAccount extends Account{

    public SimpleAccount() {
        this.moneyAmount = 0;
    }

    public SimpleAccount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
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
        if(amount <= 0){
            return false;
        }
        else{
            moneyAmount += amount;
            return true;
        }
    }


}
