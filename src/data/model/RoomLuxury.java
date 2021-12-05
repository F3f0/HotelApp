package data.model;

public class RoomLuxury extends Room{

    private String roomType ;

    public RoomLuxury(String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }
}
