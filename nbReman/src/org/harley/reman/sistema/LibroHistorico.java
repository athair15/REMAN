package org.harley.reman.sistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "libroHistorico")
@XmlType(propOrder = {
    "titulo",
    "intro",
    "historicos"
})

public class LibroHistorico {
    String titulo;
    String intro;
    List<Historico> historicos;

    public String getTitulo() {
        return titulo;
    }
    
    @XmlElement
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntro() {
        return intro;
    }
    
    @XmlElement
    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }
    
    @XmlElementWrapper(name = "historicos")
    @XmlElement(name = "historico")
    public void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;
    }
    
    public void addHistorico(Historico hist){
        if( this.historicos == null ){
            this.historicos = new ArrayList<>();
        }
        this.historicos.add(hist);
    }
    
    public void createHistorico(String version, String razon, String autor) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        String fecha = dateFormat.format(cal.getTime());
        Historico his = new Historico(version, fecha, razon, autor);
        addHistorico(his);
    }
    
}