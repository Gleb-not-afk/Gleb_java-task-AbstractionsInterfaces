public class Main {
    public static void main(String[] args) {
        Account simple1 = new SimpleAccount();
        Account credit1 = new CreditAccount(5000);
        System.out.println(credit1.pay(1000));
        System.out.println(credit1.transfer(simple1, 3000));
    }


}
