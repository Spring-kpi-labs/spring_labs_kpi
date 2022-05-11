package rest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="students")
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="last_name")
    private String lastName;

    @Column(name="first_name")
    private String firstName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="number_of_record_book")
    private String numberOfRecordBook;

    @Column(name="phone_number")
    private String phoneNumber;

    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH})
    @JoinColumn(name="group_id")
    @JsonManagedReference // will be serialized normally
    private Group universityGroup;

    public Student() {
    }

    public Student(String lastName, String firstName, String middleName, String numberOfRecordBook, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.numberOfRecordBook = numberOfRecordBook;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNumberOfRecordBook() {
        return numberOfRecordBook;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setNumberOfRecordBook(String numberOfRecordBook) {
        this.numberOfRecordBook = numberOfRecordBook;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUniversityGroup(Group universityGroup) {
        this.universityGroup = universityGroup;
    }

    public Group getUniversityGroup() {
        return universityGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", numberOfRecordBook='" + numberOfRecordBook + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityGroup=" + universityGroup +
                '}';
    }
}
