public class Persona{
    //atributos
    private float confiabilidad;
    private boolean galleta;
    private String nombre;



//métodos
public Persona() {
    confiabilidad = 0;
    galleta = true;
    nombre = "";
}

public float getConfiabilidad() {
    return this.confiabilidad;
}

public void setConfiabilidad(float confiabilidad) {
    this.confiabilidad = confiabilidad;
}

public boolean getGalleta() {
    return this.galleta;
}

public void setGalleta(boolean galleta) {
    this.galleta = galleta;
}

public String getNombre() {
    return this.nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String toString() {
    return "{" +
        " nombre='" + getNombre() + "'" +
        ", Confiabilidad='" + getConfiabilidad() + 
        "galleta = " + getGalleta();

}
}