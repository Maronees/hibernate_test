package project.baseuser;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

import project.baseuser.factory.*;
import project.baseuser.table.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException 
    {
        Collection users = Factory.getInstance().getUserDAO().getUsers();
        Iterator iterator = users.iterator();
        System.out.println("sadasd");
        while (iterator.hasNext()) {
        	User user = (User) iterator.next();
        	System.out.println("Full Name:  " + user.getFull_name() + "         User ID" + user.getUser_id());
        }
    }
}
