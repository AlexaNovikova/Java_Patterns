
import java.sql.*;

public class UserMapper {
    private final Connection connection;
    private PreparedStatement authPrepStm;

    public UserMapper(Connection connection) throws SQLException {
        this.connection = connection;
        authStatement();
    }

    public User findUserById (Long id) throws SQLException {
       authPrepStm.setLong(1, id);
       try(ResultSet resultSet = authPrepStm.executeQuery()){
           if (resultSet.next()){
               return new User(id, resultSet.getString(1),resultSet.getString(2), resultSet.getString(3));
           }
       }
       return null;
    }

    public void authStatement () throws SQLException {
        authPrepStm = connection.prepareStatement("SELECT login, password, nick FROM users WHERE id = ?;");
    }



}
