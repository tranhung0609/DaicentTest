package deadblock;

public class User implements Runnable{

    BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        senNotify();
    }

    public synchronized void senNotify() {
        System.out.println(Thread.currentThread().getName() + " User ");

        System.out.println(Thread.currentThread().getName() + " Đợi ngân hàng bạn eeiii");

        bankAccount.deposit();
    }
}
