import java.util.Scanner;

class RoomDetails {
    private int RoomNo;
    private String RoomType;
    private double RoomArea;
    private boolean AcMachine;

    public void setRoomDetails(int RoomNo, String RoomType, double RoomArea, boolean AcMachine) {
        this.RoomNo = RoomNo;
        this.RoomType = RoomType;
        this.RoomArea = RoomArea;
        this.AcMachine = AcMachine;
    }

    public void Display() {
        System.out.println("Room No: " + RoomNo);
        System.out.println("Room Type: " + RoomType);
        System.out.println("Room Area: " + RoomArea);
        System.out.println("AC Machine: " + (AcMachine ? "Yes" : "No"));
        System.out.println("-------------------------");
    }
}

public class Room {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        RoomDetails[] rooms = new RoomDetails[5];

        for (int i = 0; i < 5; i++) {
            rooms[i] = new RoomDetails();
            
            System.out.println("Enter details for Room " + (i + 1) + ":");
            
            System.out.print("Room No: ");
            int RoomNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            System.out.print("Room Type: ");
            String RoomType = sc.nextLine();
            
            System.out.print("Room Area: ");
            double RoomArea = sc.nextDouble();
            
            System.out.print("AC Machine (true/false): ");
            boolean AcMachine = sc.nextBoolean();
            
            rooms[i].setRoomDetails(RoomNo, RoomType, RoomArea, AcMachine);
        }
        
        System.out.println("\nRoom Details:");
        for (RoomDetails room : rooms) {
            room.Display();
        }
        
        sc.close();
    }
}