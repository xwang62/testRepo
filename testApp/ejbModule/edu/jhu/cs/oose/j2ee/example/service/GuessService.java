package edu.jhu.cs.oose.j2ee.example.service;

import java.util.List;

import edu.jhu.cs.oose.j2ee.example.vo.Guess;

public interface GuessService {
 public boolean guessName(String guess);
 public List<Guess> showNames();
}
