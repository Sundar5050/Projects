package com.org.cb.dao;

import org.hibernate.Session;

/*public class AbstractDao {
	
	 @Autowired
	    private SessionFactory sessionFactory;
	 
	 protected Session getSession() {
		 return sessionFactory.getCurrentSession();
	 }
	 
	 public void persists (Object entity) {
		 getSession().persist(entity);
	 }

}
*/

public interface AbstractDao{
	//@Autowired 
	//SessionFactory sessionFactory = null;
	
	public Session getSession();
	
	public void persists (Object entity);
	
    public void delete(Object entity);
}