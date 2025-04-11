import java.lang.InterruptedException;

class Thread2 implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.fillInStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " running");
        System.out.println("hii");
    }

}


public class RunnableExample {
    public static void main(String... arg){
        Thread2 t1 = new Thread2();
        Thread thr1 = new Thread(t1,"myThread 1");
        Thread thr2 = new Thread(t1,"myThread 2");
        thr1.setPriority(2);
        thr2.setPriority(10);
        System.out.println("main");
        try{
        thr1.join();
        thr2.join();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
        thr1.start();
        thr2.start();
    }
}
