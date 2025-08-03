import java.util.List;
import java.util.Optional;

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

public class UserSearchEmail {

    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Gnani", "gnani@gmail.com"),
            new User("Sai",  null),
            new User("Prasanth", "prasanth@gmail.com"),
            new User("Hemanth", "hemanth@gmail.com")
        );

        String searchName = "Sai";

        Optional<String> email = users.stream()
            .filter(user -> user.getName().equals(searchName))
            .findFirst()
            .flatMap(User::getEmail) 
            .map(String::toUpperCase);

        email.ifPresentOrElse(
            mail -> System.out.println("Uppercase email : " + mail),
            () -> System.out.println("User email missing.")
        );
    }
}