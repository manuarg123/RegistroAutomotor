/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Crear una aplicacion con interfaz grafica para un registro automotor
Del vehiculo se registra: marca (ej: renault), modelo (ej: duster), patente,
año de patentamiento, si es nacional (booleano), titular y precio

crear los metodos que permitan calcular la antiguedad, otro metodo que indique si se debe o no
realizar verificacion policial (la verificacion policial la hacen autos de 2 a 14 años) y un metodo
que calcule el costo de transferencia que para autos de menos de 10 años
sera el 6% del precio mas $5000, para autos de 10 a 25 años sera el 4% del precio
mas $2400 y para autos de mas de 25 años sera de 2000 pesos. Ademas si el auto es importado
* paga una tasa adicional de 10000

En la pantalla la marca debera ser seleecionado de un listado, para indicar si es nacional
* o importado se utilizaran botones de opcion. La antiguedad y el costo
de transferencia debera verse en un label y el indicar si verifica o no en un 
mensaje flotante
*/

package registro.automotor;

/**
 *
 * @author Administrator
 */
public class RegistroAutomotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VentanaRegistro ventana;
        ventana= new VentanaRegistro();
        ventana.setVisible(true); // TODO code application logic here
    }
    
}
