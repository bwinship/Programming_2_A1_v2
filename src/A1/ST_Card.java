package A1;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Card {
	private String fileName;//			<string>Slide01.jpg</string>
	private String imageName;//			<string>Slide01</string>
	private String card_type;// <key>play</key>
	private String title;//			<string>Quartz</string>
	private String chemistry; //		<string>SiO_2</string>
	private String classification;//			<string>tectosilicate</string>
	private String crystal_system;// <string>hexagonal</string>
	private String[] occurrence;//			<array><string>igneous</string><string>metamorphic</string><string>sedimentary</string></array>
	private String hardness;//			<string>7</string>
	private String specific_gravity;//			<string>2.65</string>
	private String clevage;// <string>poor/none</string>
	private String crustal_abundance;//			<string>high</string>
	private String economic_value;//			<string>moderate</string>

	public ST_Card(){
	}

	public String toString() {
		return "Title: '" + this.title + "', Card Type: '" + this.card_type + "', Chemistry: '" + this.chemistry + "'" + "', Classification: '" + this.classification + "";
	}


    public void set_var(String name, String value){
        if (name == null) { return; }
			switch(name){
				case "imageName": this.imageName = value; break;//			<string>Slide01</string>

				case "card_type": this.card_type = value; break; // <key>play</key>

				case "title": this.title = value; break;//			<string>Quartz</string>

				case "chemistry": this.chemistry = value; break;//		<string>SiO_2</string>

				case "classification": this.classification = value; break;//			<string>tectosilicate</string>

				case "crystal_system": this.crystal_system = value; break;// <string>hexagonal</string>

					//fix for array
				case "occurrence": 	this.occurrence = value.split("," , -1); break;//			<array><string>igneous</string><string>metamorphic</string><string>sedimentary</string></array>

				case "hardness": this.hardness = value; break;//			<string>7</string>

				case "specific_gravity": this.specific_gravity = value; break;//			<string>2.65</string>

				case "clevage": this.clevage = value; break;// <string>poor/none</string>

				case "crustal_abundance": this.crustal_abundance = value; break;//			<string>high</string>

				case "economic_value": this.economic_value = value; break;//			<string>moderate</string>

			}

		}

	public Object get_var(String name){
		switch(name){
			case "imageName": return this.imageName; //			<string>Slide01</string>

			case "card_type": return this.card_type; // <key>play</key>

			case "title": return this.title; //			<string>Quartz</string>

			case "chemistry": return this.chemistry; //		<string>SiO_2</string>

			case "classification": return this.classification; //			<string>tectosilicate</string>

			case "crystal_system": return this.crystal_system; // <string>hexagonal</string>

			case "occurrence": return this.occurrence; //			<array><string>igneous</string><string>metamorphic</string><string>sedimentary</string></array>

			case "hardness": return this.hardness; //			<string>7</string>

			case "specific_gravity": return this.specific_gravity; //			<string>2.65</string>

			case "clevage": return this.clevage; // <string>poor/none</string>

			case "crustal_abundance": return this.crustal_abundance; //			<string>high</string>

			case "economic_value": return this.economic_value; //			<string>moderate</string>

		}return null;
	}


}
