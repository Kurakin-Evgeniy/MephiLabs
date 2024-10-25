package org.lab2;

import java.util.ArrayList;
import java.util.List;
import static org.lab2.UsersUtil.*;

public class Lab2Application {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        addSomeUsers(users);

        System.out.println("Users sorted by last name");
        showUsersSortedByLastName(users);
        System.out.println("Users sorted by age");
        showUsersSortedByAge(users);
        System.out.println("Are all users older than 7 years: "+isAllUsersOlderThan7Years(users));
        System.out.println("Average age: "+getAverageUsersAge(users));

        System.out.println("List of countries: "+getUniqueCountriesList(users));

    }
    
    public static void addSomeUsers(List<User> users) {
        users.add(new User(
                1,
                "Bob",
                "Builder",
                37,
                "Russia"
        ));
        users.add(new User(
                2,
                "Eugene",
                "Kurakin",
                20,
                "Russia"
        ));
        users.add(new User(
                3,
                "Richard",
                "Roland",
                5,
                "UK"
        ));
        users.add(new User(
                2,
                "Bruno",
                "Laritto",
                15,
                "Italia"
        ));
        users.add(new User(
                4,
                "Michael",
                "Jackson",
                6,
                "USA"
        ));
        users.add(new User(
                5,
                "Robin",
                "Bobin",
                9,
                "Canada"
        ));
        users.add(new User(
                6,
                "Steve",
                "WhyNot",
                50,
                "USA"
        ));
        users.add(new User(
                7,
                "Lancelot",
                "Rebile",
                19,
                "UK"
        ));
        users.add(new User(
                8,
                "Friedrich",
                "Iwage",
                24,
                "Germany"
        ));

    }

}
