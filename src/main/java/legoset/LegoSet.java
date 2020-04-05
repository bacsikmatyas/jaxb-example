package legoset;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name","theme","subtheme","year","pieces","tags","minifigs","weight","url"})
public class LegoSet {

    @XmlAttribute
    private String number;
    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    private Weight weight;
    private String url;

    public LegoSet() {
    }

    public LegoSet(String number, String name, String theme, String subtheme, Year year, int pieces, Weight weight, String url) {
        this.number = number;
        this.name = name;
        this.theme = theme;
        this.subtheme = subtheme;
        this.year = year;
        this.pieces = pieces;
        this.tags = new HashSet<String>();
        this.minifigs = new ArrayList<Minifig>();
        this.weight = weight;
        this.url = url;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public String getSubtheme() {
        return subtheme;
    }

    public Year getYear() {
        return year;
    }

    public int getPieces() {
        return pieces;
    }

    public Set<String> getTags() {
        return tags;
    }

    public List<Minifig> getMinifigs() {
        return minifigs;
    }

    public Weight getWeight() {
        return weight;
    }

    public String getUrl() {
        return url;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setSubtheme(String subtheme) {
        this.subtheme = subtheme;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void setMinifigs(List<Minifig> minifigs) {
        this.minifigs = minifigs;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
