package ui;

public class PrintHandler implements PrintListener{

    @Override
    public void printRoomList(String roomID, String price, String roomType) {
        System.out.println(roomID + " is a " + roomType + " room - " + price + " kr.");
    }

    @Override
    public void printOptions() {
        System.out.println("""
                choose an option:
                (0) exit
                (1) print all rooms
                (2) print normal rooms
                (3) print luxury rooms
                (4) print suite rooms
                (5) delete item (by name)
                (6) save""");
    }

    @Override
    public void printDone() {
        System.out.println("Done!");
    }

    @Override
    public void printError() {
        System.out.println("Something went wrong!");
    }

    @Override
    public void promptForName() {
        System.out.println("Please enter room name: ");
    }

    @Override
    public void printGreetings() {
        System.out.println("Hello!");
    }
}
