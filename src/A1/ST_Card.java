package A1;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Card {
	private String fileName;
	private String imageName;
	private String card_type;
	private String title;
	private String chemistry;
	private String classification;
	private String crystal_system;
	private String[] occurrence;
	private String hardness;
	private String specific_gravity;
	private String clevage;
	private String crustal_abundance;
	private String economic_value;

	public ST_Card(){
	}
	public String toString() {
		return "Title: '" + this.title + "', \nCard Type: '" + this.card_type + "', \nChemistry: '" + this.chemistry + "'" + "', \nClassification: '" + this.classification + ""
				+ "', \nCrystal System: '" + this.crystal_system + "" + "', \nHardness: '" + this.hardness + "" + "', \nSpecific Gravity: '" + this.specific_gravity + ""
                + "', \nClevage: '" + this.clevage + "" + "', \nCrystal Abundance: '" + this.crustal_abundance + "" + "', \nEconomic Value: '" + this.economic_value + "\n";
	}
    public void set_var(String name, String value){
        if (name == null) { return; }
			switch(name){
				case "imageName": this.imageName = value; break;
				case "card_type": this.card_type = value; break;
				case "title": this.title = value; break;
				case "chemistry": this.chemistry = value; break;
				case "classification": this.classification = value; break;
				case "crystal_system": this.crystal_system = value; break;
				case "occurrence": 	this.occurrence = value.split("," , -1); break;
				case "hardness": this.hardness = value; break;
				case "specific_gravity": this.specific_gravity = value; break;
				case "clevage": this.clevage = value; break;
				case "crustal_abundance": this.crustal_abundance = value; break;
				case "economic_value": this.economic_value = value; break;
			}
		}
	public Object get_var(String name){
		switch(name){
			case "imageName": return this.imageName;
			case "card_type": return this.card_type;
			case "title": return this.title;
			case "chemistry": return this.chemistry;
			case "classification": return this.classification;
			case "crystal_system": return this.crystal_system;
			case "occurrence": return this.occurrence;
			case "hardness": return this.hardness;
			case "specific_gravity": return this.specific_gravity;
			case "clevage": return this.clevage;
			case "crustal_abundance": return this.crustal_abundance;
			case "economic_value": return this.economic_value;
		}return null;
	}
}
