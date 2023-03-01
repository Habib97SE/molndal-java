public class Person
{
    String firstName;
    String lastName;
    int age;

    public Person (String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public String[] splitString (String str, String regex)
    {
        return str.split(regex);
    }

    public String extrctFirstName(String fullName)
    {
        return  splitString(fullName, " ")[0];
    }

    public String extractLastName (String fullName)
    {
        return  splitString(fullName, " ")[1];
    }

    public String getFullName ()
    {
        return String.join("", this.getFirstName(), " ", this.getLastName());
    }

    @Override
    public String toString ()
    {
        return this.getFirstName() + " " + this.getLastName() + " " + Integer.toString(this.getAge());
    }
}
