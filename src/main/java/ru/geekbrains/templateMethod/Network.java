package ru.geekbrains.templateMethod;

public abstract class Network {
    String username;
    String password;

    public Network(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean post(String message){
        if (login(this.username, this.password)) {
            boolean result = sendData(message);
            logout();
            return result;
        }
        return false;
    }

    abstract boolean login(String username, String password);
    abstract boolean sendData(String message);
    abstract void logout();
}
