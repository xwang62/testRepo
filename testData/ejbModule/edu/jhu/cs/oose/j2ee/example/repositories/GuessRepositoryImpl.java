package edu.jhu.cs.oose.j2ee.example.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jhu.cs.oose.j2ee.example.vo.Guess;
@Repository
public class GuessRepositoryImpl implements GuessRepository{
	   @Autowired
	    private SessionFactory sessionFactory;
	    
	    @Override
	    public void save(Guess guess) {
	        this.sessionFactory.getCurrentSession().saveOrUpdate(guess);
	    }
	    
	    @SuppressWarnings("unchecked")
	    public List<Guess> getAll() {
	        List<Guess> allGuesses = this.sessionFactory.getCurrentSession().createQuery("from Guess").list();
	        return allGuesses;
	    }
}
