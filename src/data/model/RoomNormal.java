package data.model;

public class RoomNormal extends Room{

    private String roomType ;

    public RoomNormal(String roomID, int price, String roomType) {
        super(roomID, price);
        this.roomType = roomType ;
    }

    public String getRoomType() {
        return roomType;
    }
}
