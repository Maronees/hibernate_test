package project.baseuser.factory;

import project.baseuser.DAO.UserDAO;
import project.baseuser.DAO.UserDAOImpl;

/*
 * Класс фабрики, к которой обращаемся за реализациями DAO, от которой и будем вызывать методы.
 */

public class Factory {
	private static Factory instance = null;
	private static UserDAO userDAO = null;
	
	public static synchronized Factory getInstance(){
	    if (instance == null){
	      instance = new Factory();
	    }
	    return instance;
	}
	
	public UserDAO getUserDAO() {
		if (userDAO == null){
		      userDAO = new UserDAOImpl();
		    }
		    return userDAO;
	}
}
