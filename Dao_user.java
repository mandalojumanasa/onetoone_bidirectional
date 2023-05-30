package TEST;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dao_user {
public static void std(Dto_user dt,Dto_girl g1) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			int bid=dt.getBid();
			String name=dt.getName();
			int age=dt.getAge();
			dt.setBid(bid);
			dt.setName(name);
			dt.setAge(age);
			dt.setG(g1);
			int gid=g1.getGid();
			String name1=g1.getName();
			int age1=g1.getAge();
			g1.setGid(gid);
			g1.setName(name1);
			g1.setAge(age1);
			g1.getB();
			et.begin();
			em.persist(dt);
			em.persist(g1);
			et.commit();
			
//			Query q=em.createNamedQuery("select s from Dto_user s");
//			List<Dto_user> d=q.getResultList();
//			for (Dto_user d1: d) {
//				System.out.println(d1.getBid()+"\t"+d1.getName()+"\t"+d1.getAge()+"\t"+d1.getG().getGid());
//			}
			}
		
}
