
class ThreadWorker implements Runnable{
    int Balance = 2000;
    public void run(){
        WithDraw(600);
    }

    public synchronized void  WithDraw(int Amount){
        synchronized (this) {

            if (Balance >= Amount) {
                Balance -= Amount;
                System.out.println("Withdrawal is completed for: " + Thread.currentThread().getName() + " = " + Amount);
                System.out.println("Balance After Deduction the Amount " + Balance);
            } else {
                System.out.println("Insufficient funds cannot withdraw");
            }
        }
    }

    public int getRemainingBalance(){
       return Balance;
    }
}

public class ThreadWidthdrawalExample {
    public static void main(String... arg){
        ThreadWorker thr = new ThreadWorker();
        Thread t1 = new Thread(thr, "Person 1");
        Thread t2 = new Thread(thr , "Person 2");

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();

        }catch (InterruptedException e){
            e.fillInStackTrace();
        }

        System.out.println("Remaining Balance  :" + thr.getRemainingBalance());
    }
}
