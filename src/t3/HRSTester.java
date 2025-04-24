package t3;

public class HRSTester {
    public static void main(String[] args) {
        HRS hrs = new HRS();
        
        // Create and add rooms
        Room r101 = new Room();
        r101.setRoomNumber(101);
        r101.setRoomType("Standard");
        r101.setAvailable(true);
        hrs.addRoom(r101);

        Room r201 = new Room();
        r201.setRoomNumber(201);
        r201.setRoomType("Deluxe");
        r201.setAvailable(false);
        hrs.addRoom(r201);

        // Test new feature
        System.out.println("Room 101 available: " + hrs.isRoomAvailable(101));
        System.out.println("Room 201 available: " + hrs.isRoomAvailable(201));

        // Print all rooms
        System.out.println("\nAll rooms:");
        hrs.printAllRooms();
    }
}
