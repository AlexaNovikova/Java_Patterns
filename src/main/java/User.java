public class User {
    private Long id;
    private String login;
    private String password;
    private String nick;

    public User(Long id, String login, String password, String nick) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "User login: "+ login + ", nick: "+ nick + ", password: "+ password + ".";
    }
}
