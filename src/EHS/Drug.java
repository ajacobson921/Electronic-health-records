package EHS;

public class Drug {

	//The scientific/medical name. Ex: fluoxetine.
	private String name;
	//Dosage in mg
	private double dose;
	//Frequency of dosage. Ex: "Twice daily" "Once in the morning" etc 
	private String frequency;
	//Brand name of drug if applicable. Ex: Prozac for fluoxetine
	private String brand;
	
	public Drug(String name, double dosage, String freq)
	{
		this.name = name;
		dose = dosage;
		frequency = freq;
	}
	
	public Drug(String name, double dosage, String freq, String brandName)
	{
		this.name = name;
		dose = dosage;
		frequency = freq;
		brand = brandName;
	}
	
}
