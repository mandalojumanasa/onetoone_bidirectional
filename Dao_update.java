package TEST;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dao_update {
public static void upt(Dto_user dt,Dto_girl g1) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	int a=dt.getBid();
	dt.setBid(a);
	Dto_user d1=em.find(Dto_user.class, a);
	int b=dt.getAge();
	dt.setAge(b);
	int c=g1.getGid();
	g1.setGid(c);
	Dto_girl g2=em.find(Dto_girl.class, c);
	int d=g1.getAge();
	g1.setAge(d);
	et.begin();
	em.merge(dt);
	em.merge(g1);
	et.commit();
}
}
