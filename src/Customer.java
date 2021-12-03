public class Customer {

    private String nameOfCustomer ;
    private String id ;
    private String telephoneNumber ;
    private String emailAddress ;

    public Customer() {
    }

    public Customer(String nameOfCustomer, String id, String telephoneNumber, String emailAddress) {
        this.nameOfCustomer = nameOfCustomer;
        this.id = id;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
