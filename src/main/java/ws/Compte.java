package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
@XmlRootElement(name = "compte") //Annotation JAXB
@XmlAccessorType(XmlAccessType.FIELD) //Annotation JAXB
public class Compte {
    private int code;
    private double solde;

    //XMLTRIANSIENT c'est pour ignorer l'attribut 'date_creation' pendant la conversion en fichier Xml
    //XMLTRIANSIENT is to ignore 'date_creation' attribute during the conversion to Xml file
    @XmlTransient   //Annotation JAXB
    private Date date_creation;

    public Compte(int code, double solde, Date date_creation) {
        this.code = code;
        this.solde = solde;
        this.date_creation = date_creation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
}
