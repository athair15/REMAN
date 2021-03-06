package org.harley.reman.sistema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "libroActores")
@XmlType(propOrder = {
    "intro",
    "stakes",
    "teams"
})
public class LibroActor {
    Caratula intro;
    List<Stakeholder> stakes;
    List<ProyectTeam> teams;

    public Caratula getIntro() {
        return intro;
    }
    
    @XmlElement
    public void setIntro(Caratula intro) {
        this.intro = intro;
    }

    public List<Stakeholder> getStakes() {
        return stakes;
    }
    
    @XmlElementWrapper(name = "tablas")
    @XmlElement(name = "tabla")
    public void setStakes(List<Stakeholder> stakes) {
        this.stakes = stakes;
    }

    public void addStake(Stakeholder sth){
        if( this.stakes == null ){
            this.stakes = new ArrayList<>();
        }
            this.stakes.add(sth);
    }
    
    public List<ProyectTeam> getTeams() {
        return teams;
    }
    
    @XmlElementWrapper(name = "tablas")
    @XmlElement(name = "tabla")
    public void setTeams(List<ProyectTeam> teams) {
        this.teams = teams;
    }
    
    public void addTeam(ProyectTeam pyt){
        if( this.teams == null ){
            this.teams = new ArrayList<>();
        }
        this.teams.add(pyt);
    }
    
    public List<String> getFueCod(){
        List<String> fueNom = new ArrayList<>();
        for (Stakeholder stake : stakes) {
            fueNom.add(stake.getSthNombre().getCodigo());
        }
        return fueNom;
    }
    
    public List<String> getFueNom(){
        List<String> fueNom = new ArrayList<>();
        for (Stakeholder stake : stakes) {
            fueNom.add(stake.getSthNombre().getCodigo());
        }
        return fueNom;
    }

}
