package edu.jhu.cs.oose.j2ee.example.vo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Guess {
    @Id @GeneratedValue
    private int id;
    @Basic
    private String name;
    @Basic
    private boolean correct;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}



