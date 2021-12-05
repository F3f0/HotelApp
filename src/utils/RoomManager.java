package utils;

import data.model.Room;
import data.model.RoomLuxury;
import data.model.RoomNormal;
import data.model.RoomSuite;

import java.util.List;
import java.util.stream.Collectors;

public class RoomManager {

    public List<RoomNormal> getNormalRooms(List<Room> menu){
        return  menu.stream()
                .filter(item -> item instanceof RoomNormal)
                .map(item -> (RoomNormal) item)
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
