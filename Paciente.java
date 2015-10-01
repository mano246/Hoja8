/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo8;

/**
 *
 * @author Manolo
 */
public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String enfermedad;
    private String prioridad;

    Paciente(){
        nombre = "";
        enfermedad = "";
        prioridad = "";
    }
    
    Paciente(String Nombre, String Enfermedad, String Prioridad){
        this.nombre = Nombre;
        this.enfermedad = Enfermedad;
        this.prioridad = Prioridad;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enfermedad
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * @param enfermedad the enfermedad to set
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente paciente) {
       if(this.prioridad == paciente.prioridad && this.nombre == paciente.nombre){
       return 0;
       }
       if(prioridad.compareTo(paciente.prioridad) > 0){
           return 1;
       }
       return -1;
       
    }

}
