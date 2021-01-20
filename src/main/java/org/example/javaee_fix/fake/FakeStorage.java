package org.example.javaee_fix.fake;

import org.example.javaee_fix.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;
    private List<User> users;

    static {
        storage = new FakeStorage();
    }

    private FakeStorage() {
        this.users = new ArrayList<>();
        users.add(new User("asd", "dsa", LocalDate.parse("1111-11-11")));
        users.add(new User("Alexey", "111", LocalDate.parse("1994-02-02")));
        users.add(new User("Michael", "222", LocalDate.parse("1993-01-05")));
        users.add(new User("Justin", "333", LocalDate.parse("1995-05-10")));
    }

    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
