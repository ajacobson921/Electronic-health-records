package EHS;

import java.util.ArrayList;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private String sex;
	
	private String orientation;
	
	public Person(String first, String last)
	{
		firstName = first;
		lastName = last;
	}

	public Person(String first, String last, String gender, String sex, String ori)
	{
		firstName = first;
		lastName = last;
		this.gender = gender;
		this.sex = sex;
		orientation = ori;
	}
	


}