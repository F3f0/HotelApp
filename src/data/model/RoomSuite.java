package data.model;

public class RoomSuite extends Room{
    private String roomType ;
    private int capacity;


    public RoomSuite (String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType;
        this.capacity = 2;
    }

    public String getRoomType() {
        return roomType;
    }
}
