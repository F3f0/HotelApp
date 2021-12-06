package utils;

import data.model.Room;
import data.model.RoomLuxury;
import data.model.RoomNormalDouble;
import data.model.RoomSuite;

import java.util.List;
import java.util.stream.Collectors;

public class RoomManager {

    public List<RoomNormalDouble> getNormalRooms(List<Room> menu){
        return  menu.stream()
                .filter(item -> item instanceof RoomNormalDouble)
                .map(item -> (RoomNormalDouble) item)
                .collect(Collectors.toList());
    }

    public List<RoomLuxury> getLuxuryRooms(List<Room> menu){
        return  menu.stream()
                .filter(item -> item instanceof RoomLuxury)
                .map(item -> (RoomLuxury) item)
                .collect(Collectors.toList());
    }

    public List<RoomSuite> getSuiteRooms(List<Room> menu){
        return  menu.stream()
                .filter(item -> item instanceof RoomSuite)
                .map(item -> (RoomSuite) item)
                .collect(Collectors.toList());
    }

}
