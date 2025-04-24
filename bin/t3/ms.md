# OBJECT ORIENTED PROGRAMMING                                   Tekla Gogua

## Hotel Reservation System

![Java Logo](https://www.oracle.com/a/tech/img/cb88-java-logo-001.jpg)

*Midterm in Java*

### Description

Create Hotel Reservation System (HRS) in Java. HRS is widely used software. My example has the following features:
1. storage for hotel rooms
2. ability to add rooms to the system
3. ability to remove rooms from the system
4. ability to print all room information on the console

### HRS structure

We will need the following classes for the software:
1. **Room** - the Room itself.
2. **HRS** - hotel reservation system.
3. **HRSTester** - the tester class. This class will be used to test our management system.

#### Class Room
| Field | Type |
|--------|-----|
| roomNumber | int |
| roomType | String |
| isAvailable | boolean |

#### Class HRS
| Field | Type |
|------|--------------|
| rooms | List\<Room\> |

| Method | Description |
|------|--------------|
| void addRoom(Room) | Adds a room to the system |
| boolean removeRoom(int) | Removes a room by room number |
| void printAllRooms() | Prints all rooms in the system |

#### NEW FEATURE: Availability Check
Added method to check if specific room is available:
```java
public boolean isRoomAvailable(int roomNumber) {
    // Implementation checks all rooms for matching number
    // Returns true if found and available
}