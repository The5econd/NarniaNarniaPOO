/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialnarniapoo1;

/**
 *
 * @author thesecond
 */
public class Habitacion {
    private String piso;
    private int numero;
    private double precioHabitacion;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    boolean estado;
    
    public Habitacion(){}
    
    public Habitacion(String Piso, int Numero, double PrecioHab){
    this.piso=Piso;
    this.numero=Numero;
    this.precioHabitacion=PrecioHab;
    }
    
    //GETTERS
    public String getPiso(){
        return piso;
    }
    public int getNumHab(){
        return numero;
    }
    public double getPrecioHab(){
        return precioHabitacion;
    }
    //SETTERS
    public void setPiso(String Piso){
        this.piso=Piso;
    }
    public void setNumHab(int Numero){
        this.numero=Numero;
    }
    public void setPrecioHab(double PrecioHab){
        this.precioHabitacion=PrecioHab;
    }
}

