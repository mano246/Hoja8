/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Manolo
 */
public class Controlador {
    public Set set;
    
    // Constructor de la clase
    public Controlador() {
        this.set = new TreeSet<Paciente>();
    }
    
    //Lee un archivo de texto plano, el cual lee linea por linea y en esta linea al encontrar una coma, separa los datos, para luego crear un objeto con esos datos.
    public void readFile(String archivo) throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine())!= null){
            String[] parts = cadena.split(",");
            String nombre = parts[0];
            String enfermedad = parts[1];
            String prioridad = parts[2];
            Paciente paciente = new Paciente(nombre, enfermedad, prioridad);
            set.add(paciente);
        }
        b.close();
    }
    
    //Crea un ciclo para poder mostrar los los valores de los objetos, ya ordenados por prioridad.
    public void regresar(){
        for(Iterator<Paciente> r = set.iterator();r.hasNext();){
            Paciente cero = r.next();
            String pac = cero.getNombre() + "   " + cero.getEnfermedad() + "  " + cero.getPrioridad();
            System.out.println(pac);
        }
    }
    
    
}
