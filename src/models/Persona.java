package models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion dirección;

    public Persona(String nombre, int edad, Direccion dirección) {
        this.nombre = nombre;
        this.edad = edad;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDirección() {
        return dirección;
    }

    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }

    public int getCodigoDrireccion(){
        return dirección.getCodigo();
    }

    public boolean equalsByCodigoDireccion(Persona otraPersona){
        boolean resp = this.getCodigoDrireccion() > otraPersona.getCodigoDrireccion();
        return resp;
    }

    public boolean equalsByCodigoDireccion(int codigoDirección) {
        return getCodigoDrireccion() == codigoDirección;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dirección=" + dirección + "]";
    }
    
}
    

