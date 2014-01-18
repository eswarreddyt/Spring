package org.eswar.training.repository;


import java.sql.SQLException;
import java.util.List;

import org.eswar.training.jbo.Notes;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HibernateNotesRepository implements NotesRepository{
	
	private SessionFactory sessionFactory;

	@Transactional
	public Notes returnNotesObj(String masterId)
	{
		
		
		//Get Spring managed session
		Session session= getCurrentSession();
		
		return (Notes)session.get(Notes.class, masterId);
	}
	
	
	public Notes returnNotesObjbyQuery(String masterId)
	{
		
		//String sql = "select NOTES from NOTEX where MASTER_ID = ?"; //old code
		
		Query query = getCurrentSession().createQuery(
				"select NOTES from NOTEX where MASTER_ID = ?");
		query.setString(0, masterId);
		return (Notes) query.uniqueResult();
		
	}
	

	public List<Notes> getAllNotes() {
		return getCurrentSession().createQuery("from NOTEX").list();
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public void update(Notes notes) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(notes);
	}



}
