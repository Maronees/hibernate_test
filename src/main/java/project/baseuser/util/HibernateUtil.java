package project.baseuser.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/*
 * Юзает наш конфиг и возвращает объект типа SessionFactory,
 * который ответчает за hibernate-сессию.
 */
public class HibernateUtil {
	private static SessionFactory session;
	
	private HibernateUtil() {}
	
	/*
	 *  Статический инициализатор
	 */
	
	static {
		try {
			session = new Configuration().configure().buildSessionFactory();
		} catch(Throwable error) {
			throw new ExceptionInInitializerError("sad");
		}
	}
	
	public static SessionFactory getSession() {
		return session;
	}
}
