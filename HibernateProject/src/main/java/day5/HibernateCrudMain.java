package day5;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import day5.Restaurant;


public class HibernateCrudMain {
     
	private static void showOneRes() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		
		Class<Restaurant>entityClassType = Restaurant.class; // specifying the entity specific class is to be 
	    Serializable entityId = 102;
	   Restaurant found =   session.load(entityClassType, entityId);
	   System.out.println(found);
	   session.close();
	   factory.close();
	}
	
	public static void main(String[] args) {
		showOneRes();
		
	}

}
