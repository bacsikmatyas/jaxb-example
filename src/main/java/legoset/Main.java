package legoset;

import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.time.Year;

public class Main {
    public static void main(String[] args) throws JAXBException {

        LegoSet legoset = new LegoSet("75211","Imperial TIE Fighter","Star Wars","Solo", Year.of(2018),519, new Weight("kg",0.89),"https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        legoset.getTags().add("Star Fighter");
        legoset.getTags().add("Storm Trooper");
        legoset.getTags().add("Star Wars");
        legoset.getTags().add("Solo");

        legoset.getMinifigs().add(new Minifig("Imperial Mudtrooper",2));
        legoset.getMinifigs().add(new Minifig("Imperial Pilot",1));
        legoset.getMinifigs().add(new Minifig("Mimban Stormtrooper",1));

        JAXBHelper.toXML(legoset,System.out);


    }
}
