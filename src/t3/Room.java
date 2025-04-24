package t3;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;

    // Room Number
    public int getRoomNumber() {
        return roomNumber; 
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber; 
    }
    
    // Room Type
    public String getRoomType() { 
        return roomType; 
    }

    public void setRoomType(String roomType) {
         this.roomType = roomType; 
    }
    
    // Availibility
    public boolean isAvailable() { 
        return isAvailable;
    }

    public void setAvailable(boolean available) { 
        isAvailable = available; 
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + roomType + ") - " + 
               (isAvailable ? "Available" : "Occupied");
    }
}
