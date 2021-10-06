package ru.geekbrains.templateMethod;

public class Main {
    public static void main(String[] args) {
        String username = "Bob";
        String password = "password";
        Facebook facebook = new Facebook(username, password);
        Twitter twitter = new Twitter(username, password);
        facebook.post("hello facebook");
        twitter.post("hello twitter");
    }


}
