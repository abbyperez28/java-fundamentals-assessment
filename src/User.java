public class User extends Person {

    protected boolean admin;

    public boolean isAdmin() {
        return admin;
    }


    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }


    public static void main(String[] args) {
        User userOne = new User("Abby", "Perez", true);

        System.out.println(userOne.isAdmin());

        System.out.println(userOne.sayHello());
    }
}