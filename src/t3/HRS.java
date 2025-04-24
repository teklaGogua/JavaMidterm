package t3;

import java.util.ArrayList;
import java.util.List;

public class HRS {
  private List<Room> rooms = new ArrayList<>();
    
  // Adds rooms
  public void addRoom(Room room) {
    rooms.add(room);
  }
    
  // Removes rooms
  public boolean removeRoom(int roomNumber) {
    return rooms.removeIf(room -> room.getRoomNumber() == roomNumber);
  }
    
  // Prints all rooms
  public void printAllRooms() {
    if(rooms.isEmpty()) {
      System.out.println("No rooms in system");
      return;
    }
    for(Room room : rooms) {
      System.out.println(room);
    }
  }

  // NEW FEATURE: Check room availability
  public boolean isRoomAvailable(int roomNumber) {
    for(Room room : rooms) {
      if(room.getRoomNumber() == roomNumber) {
        return room.isAvailable();
      }
    }
    return false;
  }
}
