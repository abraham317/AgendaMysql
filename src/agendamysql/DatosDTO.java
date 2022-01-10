/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;

/**
 *
 * @author Abraham
 */
public class DatosDTO {
    String nombre, ap, am, edad, correo;
    int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }
    
    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
