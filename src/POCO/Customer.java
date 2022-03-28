package POCO;

public class Customer implements POCO{
    public long id;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNo;
    public String creditCardNo;
    public long userId;

    public Customer(long id, String firstName, String lastName, String address, String phoneNo, String creditCardNo, long userId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.creditCardNo = creditCardNo;
        this.userId = userId;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", creditCardNo='" + creditCardNo + '\'' +
                ", userId=" + userId +
                '}';
    }
}

