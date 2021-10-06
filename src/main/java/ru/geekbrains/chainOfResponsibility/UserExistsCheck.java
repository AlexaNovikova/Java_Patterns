package ru.geekbrains.chainOfResponsibility;

public class UserExistsCheck extends UserCheck{

    public boolean check(String email, String password) {
        if(!exists(email)){
            return false;
        }
        return checkNext(email, password);
    }

    private boolean exists(String email){
        return true;
    }
}
