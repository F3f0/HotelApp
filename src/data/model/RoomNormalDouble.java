package data.model;

public class RoomNormalDouble extends Room{

    private String roomType;
    private int capacity;

    public RoomNormalDouble(String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType;
        this.capacity = 2;
    }

    public String getRoomType() {
        return roomType;
    }
}
