import data.DataManager;
import data.EventHandler;
import data.FileManager;
import data.model.*;
import ui.PrintHandler;
import ui.PrintListener;
import utils.DataConverter;
import utils.RoomManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements EventHandler {

    private final PrintListener printListener = new PrintHandler() ;
    private final RoomManager roomManager = new RoomManager();
    private final FileManager fileManager = new FileManager(this);
    private final DataConverter dataConverter = new DataConverter();

    private List<Room> rooms = new ArrayList<>();

    public void start(){
        printListener.printGreetings();
        fileManager.readFile();
    }

    private void chooseOption() {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        while (option != 0) {
            onOptionSelected(option);
            option = input.nextInt();
        }
    }

    private void onOptionSelected(int option) {
        switch (option) {
            case 1 -> printAllRooms();
            case 2 -> printNormalSingleRooms();
            case 3 -> printNormalDoubleRooms();
            case 4 -> printLuxuryRooms();
            case 5 -> printSuiteRooms();
            case 6 -> deleteBooking();
            case 7 -> saveRooms();
            default -> handleError();
        }
    }

    // need to change from room to booking
    private void deleteBooking() {
        printListener.promptForName();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Room room = rooms.stream()
                .filter(item -> item.getRoomID().equals(name))
                .findFirst().orElse(null);
        if(room != null){
            rooms.remove(room);
            printListener.printDone();
        } else {
            printListener.printError();
        }
    }

    private void handleError() {
        printListener.printError();
    }

    private void printAllRooms() {
        printNormalSingleRooms();
        printNormalDoubleRooms();
        printLuxuryRooms();
        printSuiteRooms();
    }

    private void printNormalSingleRooms() {
        List<RoomNormalSingle> normalSingleRooms = roomManager.getNormalRoomsSingle(rooms);
        for (RoomNormalSingle item :
                normalSingleRooms) {
            printListener.printRoomList(
                    item.getRoomID(),
                    String.valueOf(item.getPrice()),
                    item.getRoomType()
            );
        }
    }

    private void printNormalDoubleRooms() {
        List<RoomNormalDouble> normalDoubleRooms = roomManager.getNormalRoomsDouble(rooms);
        for (RoomNormalDouble item :
                normalDoubleRooms) {
            printListener.printRoomList(
                    item.getRoomID(),
                    String.valueOf(item.getPrice()),
                    item.getRoomType()
            );
        }
    }

    private void printLuxuryRooms() {
        List<RoomLuxury> luxuryRooms = roomManager.getLuxuryRooms(rooms);
        for (RoomLuxury item :
                luxuryRooms) {
            printListener.printRoomList(
                    item.getRoomID(),
                    String.valueOf(item.getPrice()),
                    item.getRoomType()
            );
        }
    }


    private void printSuiteRooms() {
        List<RoomSuite> suiteRooms = roomManager.getSuiteRooms(rooms);
        for (RoomSuite item :
                suiteRooms) {
            printListener.printRoomList(
                    item.getRoomID(),
                    String.valueOf(item.getPrice()),
                    item.getRoomType()
            );
        }
    }

    private void saveRooms() {
        if (DataManager.getInstance().getRooms() != null) {
            fileManager.writeFile(dataConverter.convertToString(
                    DataManager.getInstance().getRooms()
            ));
        }
    }


    @Override
    public void readDataFromFile(List<String> result) {
        DataManager.getInstance().setRooms(result);
        printListener.printOptions();
        rooms = DataManager.getInstance().getRooms();
        chooseOption();
    }

    @Override
    public void writeDataToFile() {
        printListener.printDone();
    }
}
