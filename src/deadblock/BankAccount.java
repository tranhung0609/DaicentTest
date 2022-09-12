package deadblock;

public class BankAccount implements Runnable {

    User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public void run() {
        deposit();
    }

    public synchronized void deposit() {
        System.out.println(Thread.currentThread().getName() + " Bank");
        System.out.println(Thread.currentThread().getName() + "Chờ thằng kia cái bạn eiii");
        owner.senNotify();
    }
}
