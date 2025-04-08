class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running");
    }

}


public class RunnableExample {
    public static void main(String... arg){
        Thread2 t1 = new Thread2();
        Thread thr1 = new Thread(t1,"myThread 1");
        Thread thr2 = new Thread(t1,"myThread 2");
        thr1.start();
        thr2.start();
    }
}
