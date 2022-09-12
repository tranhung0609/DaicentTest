package threadexercise;

public class Main {
    public static void main(String[] args) {
//        Luồng 1
        Thread1 thread1 = new Thread1();
        Thread t1 = new Thread(thread1);
//        Luồng 2
        Thread2 thread2 = new Thread2();

//        Chạy luồng
        t1.start();
        thread2.run();

    }
}
