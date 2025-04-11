class PizzaShop {
    private String customerName;
    private boolean isPizzaPrepared = false;
    private boolean isPizzaReady = false;

    public PizzaShop(String name) {
        this.customerName = name;
    }

    public synchronized void customerArrived() {
        try {
            System.out.println(customerName + " arrived at the pizza shop.");
            notifyAll();
        } catch (Exception e) {
            System.out.println("Error in customerArrived: " + e.getMessage());
        }
    }


    public synchronized void preparePizza() {
        try {
            while (!isPizzaPrepared) {
                System.out.println("Pizza is preparing...");
                Thread.sleep(4000);
                isPizzaPrepared = true;
                notifyAll();
            }
        } catch (Exception e) {
            System.out.println("Error in preparePizza: " + e.getMessage());
        }
    }

    public synchronized void pizzaReady() {
        try {
            while (!isPizzaPrepared) {
                wait();
            }
            if (!isPizzaReady) {
                System.out.println("Pizza is ready!");
                isPizzaReady = true;
                notifyAll();
            }
        } catch (Exception e) {
            System.out.println("Error in pizzaReady: " + e.getMessage());
        }
    }


    public synchronized void eatPizza() {
        try {
            while (!isPizzaReady) {
                wait();
            }
            System.out.println("Pizza is yummy!");
        } catch (Exception e) {
            System.out.println("Error in eatPizza: " + e.getMessage());
        }
    }
}


class CustomerThread extends Thread {
    PizzaShop shop;
    public CustomerThread(PizzaShop shop) {
        this.shop = shop;
    }

    public void run() {
        shop.customerArrived();
    }
}

class PrepareThread extends Thread {
    PizzaShop shop;
    public PrepareThread(PizzaShop shop) {
        this.shop = shop;
    }

    public void run() {
        shop.preparePizza();
    }
}

class ReadyThread extends Thread {
    PizzaShop shop;
    public ReadyThread(PizzaShop shop) {
        this.shop = shop;
    }

    public void run() {
        shop.pizzaReady();
    }
}

class EatThread extends Thread {
    PizzaShop shop;
    public EatThread(PizzaShop shop) {
        this.shop = shop;
    }

    public void run() {
        shop.eatPizza();
    }
}


public class PizzaProcess {
    public static void main(String[] args) throws Exception {

        for(int i =1 ; i <= 5 ; i++) {
            PizzaShop shop = new PizzaShop("Customer " + i);

            CustomerThread customer = new CustomerThread(shop);
            PrepareThread prepare = new PrepareThread(shop);
            ReadyThread ready = new ReadyThread(shop);
            EatThread eat = new EatThread(shop);

            customer.start();
            prepare.start();
            ready.start();
            eat.start();

            try {
                customer.join();
                prepare.join();
                ready.join();
                eat.join();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
