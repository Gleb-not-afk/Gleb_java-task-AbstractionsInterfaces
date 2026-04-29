public abstract class Account {
    long moneyAmount;
    public abstract boolean pay(long amount);
    public abstract boolean add(long amount);
    public boolean transfer(Account account, long amount){
        if(this.pay(amount)){
            if(account.add(amount)){
                return true;
            }
            else {
                this.add(amount);
                return false;
            }
        }
        else {
            return false;
        }
    };
    public long getBalance(){
        return moneyAmount;
    }
}
