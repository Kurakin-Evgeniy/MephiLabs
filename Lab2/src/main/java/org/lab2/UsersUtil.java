package org.lab2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersUtil {

    public static void showUsersSortedByLastName(List<User> users) {
        users.stream().sorted(Comparator.comparing(User::getLastName)).forEach(System.out::println);
        System.out.println();
    }

    public static void showUsersSortedByAge(List<User> users) {
        users.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);
        System.out.println();
    }

    public static boolean isAllUsersOlderThan7Years(List<User> users) {
        return users.stream().noneMatch(user -> user.getAge() <= 7);
    }

    public static double getAverageUsersAge(List<User> users) {
        return users.stream().collect(Collectors.averagingInt(User::getAge));
    }

    public static List<String> getUniqueCountriesList(List<User> users) {
        return users.stream().map(User::getCountry).distinct().collect(Collectors.toList());
    }

}
