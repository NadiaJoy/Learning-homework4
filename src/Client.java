public class Client {
    String name;
    double balance;
    long personalCode;

    //p2, ex.2
    public Client(String name, double balance, long personalCode) {
        this.name = name;
        this.balance = balance;
        this.personalCode = personalCode;
    }
    //p.2, ex.4
    public String greetings () {
        return "Tere";
    }
    //p2, ex.
    public double balanceDifference (double firstClientBalance, double secondClientBalance) {
        return  firstClientBalance - secondClientBalance;
    }

}
