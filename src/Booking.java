import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {

    public static List<Room> readCustomerFromFile (Path inPath) {
        String firstLine;
        List<Room> allRoomList = new ArrayList<>() ;
        String[] firstLineSplitted ;

        try (Scanner scan = new Scanner(inPath)) {
            while (scan.hasNext()) {
                firstLine = scan.nextLine() ;
                firstLineSplitted = firstLine.split(",") ;
                Room room = new Room(firstLineSplitted[0].trim(), firstLineSplitted[1].trim(),
                        Integer.parseInt(firstLineSplitted[2].trim()),
                        Boolean.parseBoolean(firstLineSplitted[3].trim())) ;
                allRoomList.add(room);
            }
        } catch (Exception e) {
            System.out.println("Could not read the file");
            e.printStackTrace();
        }
        return allRoomList ;
    }

    public static void main(String[] args) {
        Path animalPath = Paths.get("src/rooms.txt") ;
        System.out.println(readCustomerFromFile(animalPath));
    }

}
