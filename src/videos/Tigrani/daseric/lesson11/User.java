package videos.Tigrani.daseric.lesson11;

public class User extends Human {
    String name, email;
    int age;
    Address address;

    public User(String name, String email, int age, Address address){
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }
}
