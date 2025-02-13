class Mobile{
    String brand; //instance variable
    int price;
    static String name;
    public void show(){
        System.out.println(" Brand :" + brand + " price :" + price + " model name :" + name);
    }
    static void show1(Mobile obj1){
        System.out.println(" Brand :" + obj1.brand + " price :" + obj1.price + " model name :" + name);
    }

}

public class Demo{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();


        obj1.brand = "Samsung";
        obj1.price = 10000;
        Mobile.name= "s2";
        obj1.show();

        obj2.brand = "nokia";
        obj2.price = 10000;
        Mobile.name= "luma 630";
        obj2.show();
        Mobile.show1(obj1);

        System.out.println(obj1);
        System.out.println(obj2);

    }
}
