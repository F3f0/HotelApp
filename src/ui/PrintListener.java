package ui;

public interface PrintListener {

    void printRoomList(String roomID, String price, String roomType);

    /*void printItem(String name, String price);*/

    void printOptions();

    void printDone();

    void printError();

    void promptForName();

    void printGreetings();

}
