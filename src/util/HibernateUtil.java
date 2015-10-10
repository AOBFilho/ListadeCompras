package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sf;

	//Inicia a sessionfactory automaticamente
	//de forma estatica para não ficar criando mais de uma vez
	static {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sf = cfg.buildSessionFactory(serviceRegistry);
	}
	public static Session getSession(){
		return sf.getCurrentSession();
	}
	public static void beginTransact(){
		Session session = getSession();
		session.beginTransaction();
	}
	public static void commitTransact(){
		Session session = getSession();
		session.getTransaction().commit();
	}
	public static void rollbackTransact(){
		Session session = getSession();
		session.getTransaction().rollback();
	}
}
