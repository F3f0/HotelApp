package data.model;

public class RoomSuite extends Room{
    private String roomType ;

    public RoomSuite (String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }
}
