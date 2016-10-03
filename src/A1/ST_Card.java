package A1;

/**
 * Created by jc314116 on 30/09/16.
 */
public class ST_Card {
	public void setEconomic_value(String economic_value) {
		this.economic_value = economic_value;
	}
		public void set_var(String name, String value){
			switch(name){
				case "imageName": imageName = value; break;//			<string>Slide01</string>

				case "card_type": card_type = value; break; // <key>play</key>

				case "title": title = value; break;//			<string>Quartz</string>

				case "chemistry": chemistry = value; break;//		<string>SiO_2</string>

				case "classification": classification = value; break;//			<string>tectosilicate</string>

				case "crystal_system": crystal_system = value; break;// <string>hexagonal</string>

					//fix for array
				case "occurrence": 	occurrence = value.split("," , -1); break;//			<array><string>igneous</string><string>metamorphic</string><string>sedimentary</string></array>

				case "hardness": hardness = value; break;//			<string>7</string>

				case "specific_gravity": specific_gravity = value; break;//			<string>2.65</string>

				case "clevage": clevage = value; break;// <string>poor/none</string>

				case "crustal_abundance": crustal_abundance = value; break;//			<string>high</string>

				case "economic_value": economic_value = value; break;//			<string>moderate</string>

			}
			System.out.println("Name =" + name + " Value =" + value);
		}

	public Object get_var(String name){
		switch(name){
			case "imageName": return imageName; //			<string>Slide01</string>

			case "card_type": return card_type; // <key>play</key>

			case "title": return title; //			<string>Quartz</string>

			case "chemistry": return chemistry; //		<string>SiO_2</string>

			case "classification": return classification; //			<string>tectosilicate</string>

			case "crystal_system": return crystal_system; // <string>hexagonal</string>

			case "occurrence": return occurrence; //			<array><string>igneous</string><string>metamorphic</string><string>sedimentary</string></array>

			case "hardness": return hardness; //			<string>7</string>

			case "specific_gravity": return specific_gravity; //			<string>2.65</string>

			case "clevage": return clevage; // <string>poor/none</string>

			case "crustal_abundance": return crustal_abundance; //			<string>high</string>

			case "economic_value": return economic_value; //			<string>moderate</string>

		}return null;
	}
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


}
