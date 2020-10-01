package service.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
@XmlRootElement
public class User {
    //fields
    private int id;
    private String firstName; // user's first name
    private String lastName; // user's last name
    private UserType type; // type of the user
    private String email; // user's email
    private String password; // user's password
    private String phoneNumbar; // user's phone number
    private int addressId; // user's address
    private int locationId; // user's location
    private int departmentId; // user's department
    private String userNumber; // user's number
    private String img; // user's image /* I will add this to the constracture later*/

    //constractures
    public User(int id, String firstName, String lastName, String dateOfBirth, UserType type, String email, String password,
                 String phoneNumbar, int addressId, int locationId, int departmentId, String userNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.email = email;
        this.password = password;
        this.phoneNumbar = phoneNumbar;
        this.addressId = addressId;
        this.departmentId = departmentId;
        this.locationId = locationId;
        this.userNumber = userNumber;
    }

    public User() {
    }

    //geteers and setters
    public int getUserID() {
        return id;
    }

    public void setUserID(int id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return firstName;
    }

    public void setUserFirstName(String name) {
        this.firstName = name;
    }

    public String getUserLastName() {
        return lastName;
    }

    public void setUserLastName(String name) {
        this.lastName = name;
    }

    public UserType getUserType() {
        return type;
    }

    public void setUserType(UserType type) {
        this.type = type;
    }

    public String getUserEmail() {
        return email;
    }

    public void setUserEmail(String mail) {
        this.email = mail;
    }

    public String getUserPassword() {
        return password;
    }

    public void setUserPassword(String pass) {
        this.password = pass;
    }

    public String getUserPhoneNumber() {
        return phoneNumbar;
    }

    public void setUserPhoneNumber(String phone) {
        this.phoneNumbar = phone;
    }

    public int getUserAddress() {
        return addressId;
    }
    public void setUserAddress(int addressId) { this.addressId = addressId; }

    public int getUserLocation() {
        return locationId;
    }
    public void setUserLocation(int locationId) { this.locationId = locationId; }

    public int getUserDepartment() { return departmentId; }
    public void setUserDepartment(int departmentId) { this.departmentId = departmentId; }

    public String getUserNumber() { return userNumber; }
    public void setUserNumber(String userNumber) { this.userNumber = userNumber; }

    public String getUserImage() { return img; }
    public void setUserImage(String img) { this.img = img; }

    //methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User u = (User) o;
        return id == u.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "User ID: " + id +
                ", First Name: '" + firstName + '\'' +
                ", Last Name: '" + lastName + '\'' +
                ", Email: '" + email + '\'' +
                ", Password: '" + password + '\'' +
                ", Phone Number: " + phoneNumbar + '\'' +
                ", User Type: " + type + '\'' +
                ", Address: " + addressId + '\'' +
                ", Location: " + locationId + '\'' +
                ", Department: " + departmentId + '\'' +
                ", User Number: " + userNumber + '\'' +
                '}';
    }
}