package TEST;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete_user {
public static void std(Dto_user dt,Dto_girl g1) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	int a=dt.getBid();
	dt.setBid(a);
	int b=g1.getGid();
	g1.setGid(b);
	Query q=em.createQuery("delete from Dto_user where bid="+a);
	Query q1=em.createQuery("delete from Dto_girl where gid="+b);
	q.executeUpdate();
	q1.executeUpdate();
	et.commit();
}
}
