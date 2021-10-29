package office_management_java;

import java.util.ArrayList;

public class Office {

  ArrayList<Room> roomList;
  Room room;

  public Office() {
    this.roomList = new ArrayList<Room>();
    room = new Room(null);
  }

  public void addRoom(Room room) {
    this.roomList.add(room);
  }

  public ArrayList<Room> allRooms() {
    return roomList;
  }

  public ArrayList<Room> availability() {
    ArrayList<Room> availableRooms = new ArrayList<Room>();

    for (int i = 0; i < roomList.size(); i++) {
      if (roomList.get(i).available) {
        availableRooms.add(roomList.get(i));
      }
    }

    return availableRooms;
  }

}