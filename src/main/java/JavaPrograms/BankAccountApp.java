package JavaPrograms;

public class BankAccountApp {

    public static void main(String args[]){
        BankAccount acc1=new BankAccount("75755767",1500.00);
        BankAccount acc2=new BankAccount("75755768",3478.56);
        acc1.setName("Hezekiah");
        System.out.println(acc1.getName());
        acc1.payBill(200);
        acc1.makeDeposit(300);
        acc1.accure();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest{

    private static int iD=1000;
    private String accountNumber; //id+random 2 digit number +First 2 digits SSN
    private static final String routingNumber="6472207769";


    private String name;
    private String SSN;
    private double balance;

    BankAccount(String SSN,double initbalance){
        //System.out.println("New Account Created");
        balance=initbalance;
        iD++;
        this.SSN=SSN;
        setAccountNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void setAccountNumber() {
        int random= (int) (Math.random()*100);
        accountNumber=iD+""+random+SSN.substring(0,2);
        System.out.println("The Account Number is " +accountNumber);

    }

    public void makeDeposit(double amount){
        balance=balance+amount;
        System.out.println("making deposit " +amount);
        showBalance();
    }

    public void payBill(double amount){
        balance=balance-amount;
        System.out.println("paying Bill" +amount);
        showBalance();
    }

    public void showBalance(){
        System.out.println("The Balance is :" +balance);
    }

    @Override
    public void accure() {
        balance=balance*(1+(rate/100));
        System.out.println("The New balance after interest");
        showBalance();

    }
    @Override
    public String toString(){
        return "The name is  "+name+"  interest after the balance is "+balance;
    }
}
