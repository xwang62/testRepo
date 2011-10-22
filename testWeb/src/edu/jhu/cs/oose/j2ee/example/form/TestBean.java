package edu.jhu.cs.oose.j2ee.example.form;

public class TestBean {
	private String name;
    public boolean wrong;
	public TestBean(){
		this.name="bob";
		this.wrong=false;
	}
	
	public String getName(){
		return name;		
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public boolean getWrong(){
		return this.wrong;
	}
	public void setWrong(boolean bool)
	{
		this.wrong=bool;
	}

}

