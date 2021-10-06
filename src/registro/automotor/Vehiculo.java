package registro.automotor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
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

import java.util.Calendar;
public class Vehiculo {
    
    private boolean nacional;
    private String marca;
    private String modelo;
    private String patente;
    private int año_patentamiento;
    private String titular;
    private float precio;
    
    
    public Vehiculo(){
        nacional=false;
        marca="";
        modelo="";
        patente="";
        año_patentamiento=0;
        titular="";
        precio=0.0f;          
                
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAño_patentamiento() {
        return año_patentamiento;
    }

    public void setAño_patentamiento(int año_patentamiento) {
        this.año_patentamiento = año_patentamiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int calcularAntiguedad(){
        Calendar calendario;
        int antiguedad;
        calendario = Calendar.getInstance();
        
        antiguedad= calendario.get(Calendar.YEAR)- año_patentamiento;
        return antiguedad;
    
    }
    public String determinarVerificacion(){
        String verificacion;
        if (calcularAntiguedad()>=2 && calcularAntiguedad()<=14){
            verificacion="Verificación policial: Si";
        }else {
            verificacion="Verifiación policial: No";
        }
        return verificacion;
    }
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
    public float calcularTransferencia(){
        float transferencia;
        float costo;
        if (calcularAntiguedad()<10){
            costo=precio*0.06f;
            transferencia=costo + 5000;
        }else if(calcularAntiguedad()>=10 && calcularAntiguedad()<=25){
            costo=precio*0.04f;
            transferencia=costo + 2400;
        }else{
            transferencia=2000;
        }
        if (nacional==false){
            transferencia=transferencia+10000;
        }
        return transferencia;
    }
}
