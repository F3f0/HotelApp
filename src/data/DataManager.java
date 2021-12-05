package data;

import data.model.Room;
import utils.DataConverter;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static DataManager instance;
    private final DataConverter dataConverter = new DataConverter();
    private List<Room> rooms;

    public List<Room> getRooms() {
        if (rooms != null) {
            return rooms;
        }
        return new ArrayList<>();
    }

    public void setRooms(List<String> result){
        rooms = dataConverter.convertToRooms(result);
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

}
