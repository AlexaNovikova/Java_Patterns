package ru.geekbrains.chainOfResponsibility;

public abstract class UserCheck {
    private UserCheck next;

    public UserCheck link (UserCheck userCheck){
        this.next = userCheck;
        return next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        if(next ==null){
            return true;
        }
        return next.check(email, password);
    }

}
