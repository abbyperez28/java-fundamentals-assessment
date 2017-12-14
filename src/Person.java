public class Person implements Greeter {

    protected String firstName;
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    @Override
    public String sayHello() {
        return "Hello, " + this.firstName + " " + this.lastName + ".";
    }


    public Person(String firstName, String lastName) {
        try {
            if (firstName == null || lastName == null) {
                throw new IllegalArgumentException("Name has no content");
            }

            this.firstName = firstName;
            this.lastName = lastName;

        } catch (IllegalArgumentException e) {

            System.out.println("Name has no content");
        }


    }
}
