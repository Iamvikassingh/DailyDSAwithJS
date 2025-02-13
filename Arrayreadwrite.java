import java.util.Scanner;
class Arrayreadwrite {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value for arr["+i+"]");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
            
    }}

    