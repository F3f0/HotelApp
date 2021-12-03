public class Room {

    private String nameOfRoom ;
    private String typeOfRoom ;
    private int priceOfRoom ;
    private boolean availabilityOfRoom ;

    public Room(String nameOfRoom, String typeOfRoom, int priceOfRoom, boolean availabilityOfRoom) {
        this.nameOfRoom = nameOfRoom;
        this.typeOfRoom = typeOfRoom;
        this.priceOfRoom = priceOfRoom;
        this.availabilityOfRoom = availabilityOfRoom;
    }

    public String getNameOfRoom() {
        return nameOfRoom;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getPriceOfRoom() {
        return priceOfRoom;
    }

    public boolean isAvailabilityOfRoom() {
        return availabilityOfRoom;
    }

    public void setPriceOfRoom(int priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    public void setAvailabilityOfRoom(boolean availabilityOfRoom) {
        this.availabilityOfRoom = availabilityOfRoom;
    }

    @Override
    public String toString() {
        return "\nRooms: \n" +
                "Room: '" + nameOfRoom + '\'' +
                ", Type of the room: '" + typeOfRoom + '\'' +
                ", Price of the room: " + priceOfRoom +
                ", Availability: " + availabilityOfRoom +
                "\n";
    }
}
