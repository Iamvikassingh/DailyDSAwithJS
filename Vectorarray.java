
import java.util.Scanner;
import java.util.Vector;

class Vectorarray{
    public static void main(String[] args) {
        @SuppressWarnings("Convert2Diamond")
        Vector<Integer> v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number of elements");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            v.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            System.out.print(v.get(i));
        }
    }
}