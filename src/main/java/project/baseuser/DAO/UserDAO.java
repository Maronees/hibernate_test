package project.baseuser.DAO;
import java.sql.SQLException;
import java.util.Collection;

import project.baseuser.table.User;

public interface UserDAO {
	public void addUser(User user) throws SQLException;
	public void changeUser (User user) throws SQLException;
	public void deleteUser (User user) throws SQLException;
	public Collection getUsers () throws SQLException;
}
