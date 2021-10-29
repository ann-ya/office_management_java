package office_management_java;

public class Room {
  
  String roomName;
  boolean available;

  public Room(String roomName) {
    this.roomName = roomName;
    roomName = " ";
    available = true;
  }
  
  public boolean isAvailable() {
    return available;
  }

  public void enter() throws Exception {
    
    if (available) {
      available = false;
    } else {
      throw new Exception("This room is not available!");
    }
  }

  public void leave() {
    available = true;
  }

}
