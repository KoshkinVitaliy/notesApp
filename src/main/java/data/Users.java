package data;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static List<User> users = new ArrayList<>();

    {
        User vitaliy = new User("Vitaliy", "88005553535");

        users.add(vitaliy);
    }
}
