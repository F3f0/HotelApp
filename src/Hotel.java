import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {

    private List<Customer> listOfCustomers = new ArrayList<>();
    private Customer customer = new Customer() ;
    private Path path = Paths.get("src/rooms.txt") ;

    public Hotel() {

        System.out.println("Welcome to \"Pappas Hotel\"!\nWe have " +
                "the following rooms available at the moment: " +
                Booking.readCustomerFromFile(path)) ;


        Scanner scan = new Scanner(System.in) ;
        System.out.println("Please enter your name: ") ;
        String temp ;
        temp = scan.nextLine().trim() ;
        customer.setNameOfCustomer(temp) ;

        System.out.println("Please enter your id number: ");
        temp = scan.nextLine().trim();
        customer.setId(temp) ;

        System.out.println("Please enter your telephone number: ");
        temp = scan.nextLine().trim();
        customer.setTelephoneNumber(temp);

        System.out.println("Please enter your email address: ");
        temp = scan.nextLine().trim();
        customer.setEmailAddress(temp) ;
        listOfCustomers.add(customer) ;

    }

    public static void main(String[] args) {
        System.out.println(new Hotel());
    }
}
