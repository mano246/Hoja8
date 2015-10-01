/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Desarrollado por :
*   Patrick Ordoñez: 131062
*   Manolo Ramirez: 14005
*/
package hojadetrabajo8;

import java.io.IOException;

/**
 *
 * @author Manolo
 */
public class HojaDeTrabajo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Controlador nu = new Controlador();
       nu.readFile("datos.txt");    //Llama al metodo que maneja al archivo de texto plano.
       nu.regresar();               //Llama al metodo que imprime los resultados.
    }
    
}
