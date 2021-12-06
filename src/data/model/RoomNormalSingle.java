package data.model;

public class RoomNormalSingle extends Room{

    private String roomType;
    private int capacity;

    public RoomNormalSingle(String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType;
        this.capacity = 1;
    }

    public String getRoomType() {
        return roomType;
    }
}