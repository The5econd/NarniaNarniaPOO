/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialnarniapoo1;

/**
 *
 * @author javie
 */
public class Reservacion {
    public String infoHuesped;
    public int numeroHabitacion;
    public int diasReservacion;
    public double costoNoche;
    public double costoTotal;

    public String getInfoHuesped() {
        return infoHuesped;
    }

    public void setInfoHuesped(String infoHuesped) {
        this.infoHuesped = infoHuesped;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getDiasReservacion() {
        return diasReservacion;
    }

    public void setDiasReservacion(int diasReservacion) {
        this.diasReservacion = diasReservacion;
    }

    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Reservacion() {
    }

    public Reservacion(String infoHuesped, int numeroHabitacion, int diasReservacion, double costoNoche, double costoTotal) {
        this.infoHuesped = infoHuesped;
        this.numeroHabitacion = numeroHabitacion;
        this.diasReservacion = diasReservacion;
        this.costoNoche = costoNoche;
        this.costoTotal = costoTotal;
    }

}
