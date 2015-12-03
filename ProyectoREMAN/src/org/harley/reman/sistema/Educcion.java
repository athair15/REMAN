package org.harley.reman.sistema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

    @XmlRootElement
    @XmlType(propOrder = {
        "educcionNombre",
        "version",
        "educcionTipo",
        "educcionObj",
        "educcionFecha",
        "fuenteNombre",
        "fuenteCargo",
        "fuenteTipo",
        "especialNombre",
        "especialEspecial",
        "especialTipo",
        "especialExp",
        "descripcion",
        "observaciones"
    })
public class Educcion {
        private static int numero = 0;
        private static String codigo = "EDU0000";
        Nombre educcionNombre;
        String version;
        String educcionTipo;
        String educcionObj;
        String educcionFecha;
        String fuenteNombre;
        String fuenteCargo;
        String fuenteTipo;
        String especialNombre;
        String especialEspecial;
        String especialTipo;
        String especialExp;      
        String descripcion;
        String observaciones;

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Educcion.numero = numero;
    }

    public Educcion() {    }
    
    public Educcion(String cod, String name) { 
        educcionNombre = new Nombre(cod, name);
    }
    public Educcion(String cod, String name, String version, String fuenteNombre, String fuenteCargo, String fuenteTipo, String especialNombre, String especialEspecial, String especialTipo, String especialExp, String educcionTipo, String educcionObj, String educcionFecha, String descripcion, String observaciones) {
        educcionNombre = new Nombre(cod, name);
        this.version = version;
        this.fuenteNombre = fuenteNombre;
        this.fuenteCargo = fuenteCargo;
        this.fuenteTipo = fuenteTipo;
        this.especialNombre = especialNombre;
        this.especialEspecial = especialEspecial;
        this.especialTipo = especialTipo;
        this.especialExp = especialExp;
        this.educcionTipo = educcionTipo;
        this.educcionObj = educcionObj;
        this.educcionFecha = educcionFecha;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }
    
    public Educcion(String name, String version, String fuenteNombre, String fuenteCargo, String fuenteTipo, String especialNombre, String especialEspecial, String especialTipo, String especialExp, String educcionTipo, String educcionObj, String educcionFecha, String descripcion, String observaciones) {
        numero++;
        codigo = Utils.Incrementa(codigo);
        educcionNombre = new Nombre(codigo, name);
        this.version = version;
        this.fuenteNombre = fuenteNombre;
        this.fuenteCargo = fuenteCargo;
        this.fuenteTipo = fuenteTipo;
        this.especialNombre = especialNombre;
        this.especialEspecial = especialEspecial;
        this.especialTipo = especialTipo;
        this.especialExp = especialExp;
        this.educcionTipo = educcionTipo;
        this.educcionObj = educcionObj;
        this.educcionFecha = educcionFecha;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }

    public Nombre getEduccionNombre() {
        return educcionNombre;
    }
    
    @XmlElement
    public void setEduccionNombre(Nombre educcionNombre) {
        this.educcionNombre = educcionNombre;
    }

    public String getVersion() {
        return version;
    }
    
    @XmlElement
    public void setVersion(String version) {
        this.version = version;
    }

    public String getEduccionTipo() {
        return educcionTipo;
    }
    
    @XmlElement
    public void setEduccionTipo(String educcionTipo) {
        this.educcionTipo = educcionTipo;
    }

    public String getEduccionObj() {
        return educcionObj;
    }
    
    @XmlElement
    public void setEduccionObj(String educcionObj) {
        this.educcionObj = educcionObj;
    }

    public String getEduccionFecha() {
        return educcionFecha;
    }
    
    @XmlElement
    public void setEduccionFecha(String educcionFecha) {
        this.educcionFecha = educcionFecha;
    }
    
    public String getFuenteNombre() {
        return fuenteNombre;
    }
    
    @XmlElement
    public void setFuenteNombre(String fuenteNombre) {
        this.fuenteNombre = fuenteNombre;
    }

    public String getFuenteCargo() {
        return fuenteCargo;
    }
    
    @XmlElement
    public void setFuenteCargo(String fuenteCargo) {
        this.fuenteCargo = fuenteCargo;
    }

    public String getFuenteTipo() {
        return fuenteTipo;
    }
    
    @XmlElement
    public void setFuenteTipo(String fuenteTipo) {
        this.fuenteTipo = fuenteTipo;
    }

    public String getEspecialNombre() {
        return especialNombre;
    }
    
    @XmlElement
    public void setEspecialNombre(String especialNombre) {
        this.especialNombre = especialNombre;
    }

    public String getEspecialEspecial() {
        return especialEspecial;
    }
    
    @XmlElement
    public void setEspecialEspecial(String especialEspecial) {
        this.especialEspecial = especialEspecial;
    }

    public String getEspecialTipo() {
        return especialTipo;
    }
    
    @XmlElement
    public void setEspecialTipo(String especialTipo) {
        this.especialTipo = especialTipo;
    }

    public String getEspecialExp() {
        return especialExp;
    }
    
    @XmlElement
    public void setEspecialExp(String especialExp) {
        this.especialExp = especialExp;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    @XmlElement
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    @XmlElement
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
