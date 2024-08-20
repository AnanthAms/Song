package com.example.song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

	@GetMapping(value="/song")
	public String getSong() {
		return "Female : Thanana naane nananana thanana thana thanana\r\n"
				+ "Thanana naane nananana thannana thanana thanana\r\n"
				+ "Nana nanana thana nanana thananana thaana naa\r\n"
				+ "\r\n"
				+ "Male : Rarara rarara rara rarara rarara rara\r\n"
				+ "\r\n"
				+ "Male : Ayayyo nenju alayudhadi aagaayam ippo valayudhadi\r\n"
				+ "En veetil minnal oliyudhadi en mela nila pozhiyudhadi\r\n"
				+ "Unna paartha andha nimisam marainji pochu nagaravae illa\r\n"
				+ "Thinna sorum serikavae illa kolamburen naanae\r\n"
				+ "\r\n"
				+ "Male : Un vaasam adikira kaathu en kooda nadakiradhae\r\n"
				+ "En seval koovura satham un pera kekuradhae Male : Oh ayayyo nenju alayudhadi aagaayam ippo valayudhadi\r\n"
				+ "\r\n"
				+ "Male : Unnai thodum anal kaathu kadakayilae poongaathu\r\n"
				+ "Kolambi thavikudhadi en manasu\r\n"
				+ "\r\n"
				+ "Female : Hoo thiruvizha kadaigala polae thenaruren naan thaanae\r\n"
				+ "Edhiril nee varumbodhu meraluren yenthaano\r\n"
				+ "\r\n"
				+ "Male : Kan simitum theeyae enna erichiputta neeyae\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Male : ……………………………………………..\r\n"
				+ "\r\n"
				+ "Female : Thanana naane nananana thanana thana thanana Thanana naane nananana thannana thanana thanana\r\n"
				+ "Nana nanana thana nanana thananana thaana naa\r\n"
				+ "\r\n"
				+ "Male : Mazhai chaaral vizhum vela mann vaasam manam veesa\r\n"
				+ "Un moochu thodavae naan midhandhen\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Female : Hoo kodaiyila adikira mazhaiyaa nee enna nanaichaayae\r\n"
				+ "Eerathila anaikira sugatha paarvaiyila koduthaayae\r\n"
				+ "\r\n"
				+ "Male : Paadhagathi enna oru paarvaiyaala konna\r\n"
				+ "Ooroda vaazhura podhum yaarodum serala naan\r\n"
				+ "\r\n"
				+ "Male : Hey ayayyo nenju alayudhadi aagaayam ippo valayudhadi\r\n"
				+ "En veetil minnal oliyudhadi en mela nila pozhiyudhadi";
	}

}
