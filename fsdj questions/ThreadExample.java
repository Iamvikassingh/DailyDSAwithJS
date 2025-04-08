class Thread1 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName() + " running");
    }

    public Thread1(String message){
        super(message);
    }
}



public class ThreadExample {
    public static void main(String... arg){
        Thread1 t1 = new Thread1("This is thread1");
        Thread1 t2 = new Thread1("This is thread2");
//        t1.setName("hello vikas singh");
//        t2.setName("hello Tushar kumar");
        t1.start();
        t2.start();
    }
}
