package ru.geekbrains.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        String email = "email@mail.ru";
        String password = "password";
        UserCheck userExistsCheck = new UserExistsCheck();
        UserCheck passwordIsCorrectCheck = new PasswordIsCorrectCheck();

        userExistsCheck.link(passwordIsCorrectCheck);
        boolean result = userExistsCheck.check(email, password);
        System.out.println(result);
    }
}
