//Represent a hotel room
public class Room {
    private int roomNumber;
    private String category;
    private boolean isAvailable;

    public Room(int roomNumber, String category){
        this.roomNumber = roomNumber;
        this.category = category;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory(){
        return category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void book(){
        this.isAvailable = false;
    }

    public void unBook(){
        this.isAvailable = true;
    }
}
