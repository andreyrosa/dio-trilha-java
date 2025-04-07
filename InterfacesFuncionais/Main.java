package InterfacesFuncionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Júlia", 24),
                new User("Andrey", 21));
        users.forEach(user -> System.out.println(user));
        printStringValue(User::name, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
