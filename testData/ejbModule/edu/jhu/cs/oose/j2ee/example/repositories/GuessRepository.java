package edu.jhu.cs.oose.j2ee.example.repositories;

import java.util.List;

import edu.jhu.cs.oose.j2ee.example.vo.Guess;

public interface GuessRepository {
	public void save(Guess guess);
	public List<Guess> getAll();
}
