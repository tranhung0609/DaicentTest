package synchroniztion;

public class SynchronitionTest implements Runnable {

    public int sum;

    public SynchronitionTest() {
        this.sum = 1000;
    }


    public synchronized void withdrawMoney() throws InterruptedException {
        if (sum > 0) {
            Thread.sleep(2000);
            sum = sum - 1000;
            System.out.println(sum);
        } else {
            System.out.println("No money");
        }
    }

    @Override
    public void run() {
        try {
            withdrawMoney();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SynchronitionTest synchronitionTest = new SynchronitionTest();

        Thread t1 = new Thread(synchronitionTest);
        Thread t2 = new Thread(synchronitionTest);

        t1.start();
        t2.start();
    }
}
