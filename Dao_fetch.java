package TEST;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao_fetch {
public static void rad(Dto_user dt,Dto_girl g1) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	int a=dt.getBid();
	dt.setBid(a);
	Dto_user d1=em.find(Dto_user.class, a);
	int b=g1.getGid();
	g1.setGid(b);
	Dto_girl g2=em.find(Dto_girl.class, b);
	System.out.println(d1.getBid()+"\t"+d1.getName()+"\t"+d1.getAge());
	System.out.println(g2.getGid()+"\t"+g2.getName()+"\t"+g2.getAge());
	et.begin();
	et.commit();
}
}
