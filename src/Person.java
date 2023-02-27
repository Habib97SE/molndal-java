import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String socialSecurityNumber;

    public Person (String firstName, String lastName, int age, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public String getSocialSecurityNumber ()
    {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber (String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }



    /**
     * This method compare two persons
     *
     * @param person > the person to compare with the curren object.
     * @return : returns true if it is same otherwise false
     */
    public boolean toCompare (Person person)
    {
        return this.socialSecurityNumber.equals(person.socialSecurityNumber);
    }

    @Override
    public String toString ()
    {
        return this.firstName + " " + this.lastName + " " + this.age + " " + this.socialSecurityNumber;
    }
}
