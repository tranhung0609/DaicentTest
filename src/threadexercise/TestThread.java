package threadexercise;

public class TestThread extends Thread{

    private String threadName;

    public TestThread(String threadName) {
        this.threadName = threadName;
    }

    public TestThread() {
    }


    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getThreadName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("a");
        TestThread t2 = new TestThread("b");

        t1.start();
        t2.start();
    }
}
