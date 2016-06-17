package project.baseuser.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import project.baseuser.table.User;
import project.baseuser.util.HibernateUtil;

public class UserDAOImpl implements UserDAO{

	public void addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void changeUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Collection getUsers() throws SQLException {    
		
		    Session session = HibernateUtil.getSession().openSession();
		    List users = new ArrayList<User>();
		    
		    try {
		    	users = session.createCriteria(User.class).list();
		    } catch (Exception error) {
		    	JOptionPane.showMessageDialog(null, error.getMessage(), "ERROR! ERROR! ERROR!", JOptionPane.OK_OPTION);
		    } finally {
		    	if (session != null && session.isOpen()) {
		    		session.close();
		    	}
		    }
		    
		    return users;
	}

}
