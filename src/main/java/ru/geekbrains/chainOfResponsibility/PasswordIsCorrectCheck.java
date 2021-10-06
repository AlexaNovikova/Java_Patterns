package ru.geekbrains.chainOfResponsibility;

public class PasswordIsCorrectCheck extends UserCheck{

    public boolean check(String email, String password) {
         if(!passwordIsCorrect(password)){
             return false;
         }
         return checkNext(email, password);
    }

    private boolean passwordIsCorrect(String password){
        return true;
    }
}
