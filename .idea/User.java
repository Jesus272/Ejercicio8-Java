public class User {
    private String first_name;
    private String last_name;

    public  User(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
public class Example{

    public static void main(String[]args){


        User user1 = new User("Hernan", "Doe");
        User user2 = new User("Foor" "Bar");

        System.out.println(user2.equals(user1));
        System.out.println(user1.toString());

    }
}