package ru.geekbrains.templateMethod;

public class Facebook extends Network {

    public Facebook(String username, String password) {
        super(username, password);
    }

    @Override
    boolean login(String username, String password) {
        System.out.println("Login");
        return true;
    }

    @Override
    boolean sendData(String message) {
        System.out.println("Send " + message);
        return true;
    }

    @Override
    void logout() {
        System.out.println("Logout");
    }
}
