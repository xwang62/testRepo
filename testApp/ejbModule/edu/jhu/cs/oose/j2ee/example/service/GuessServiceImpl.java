package edu.jhu.cs.oose.j2ee.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.jhu.cs.oose.j2ee.example.repositories.GuessRepository;
import edu.jhu.cs.oose.j2ee.example.vo.Guess;

@Service
public class GuessServiceImpl implements GuessService {
    private static final String ANSWER = "Rumplestiltskin";
    
    @Autowired
    private GuessRepository guessRepository;

    @Transactional
    public boolean guessName(String guess) {
        boolean correct = guess.equalsIgnoreCase(ANSWER);
        
        Guess guessObj = new Guess();
        guessObj.setCorrect(correct);
        guessObj.setName(guess);
        
        this.guessRepository.save(guessObj);
        
       // this.guessRepository.getAll();
        
        return correct;
    }
    @Transactional
    public List<Guess> showNames()
    {
    	return this.guessRepository.getAll();
    }
}

