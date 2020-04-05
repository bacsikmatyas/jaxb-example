package legoset;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Weight {
    @XmlAttribute
    private String unit;

    @XmlValue
    private double value;

    public Weight() {
    }

    public Weight(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

