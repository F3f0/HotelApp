package data.model;

public class RoomLuxury extends Room{

    private String roomType;
    private int capacity;

    public RoomLuxury(String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType;
        this.capacity = 4;
    }

    public String getRoomType() {
        return roomType;
    }
}
