package com.java.practice.Alian;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		AlianName an=new AlianName();
		an.setfName("Pooja");
		an.setlName("Somavanshi");
		an.setmName("Dileep");
		
		
		AlianClass ac=new AlianClass();
		ac.setaId(101);
		ac.setAcolor("Purple");
		ac.setaName(an);
		
		
        Configuration cfg=new Configuration().configure().addAnnotatedClass(AlianClass.class);
        ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        		
		SessionFactory sf=cfg.buildSessionFactory(sr);
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(ac);
		
		session.flush();
		tr.commit();

	}
}
