/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialnarniapoo1;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Ricardo Villeda
 */
public class Cliente {
    
    ArrayList<Habitacion>habitaciones= new ArrayList<>();
    Scanner leer =  new Scanner(System.in);
    
    public Cliente() {
    }
    
    public Cliente(String Dui, String infoCliente, String nombre, String apellido, String tarjetaCredito, String telefono, int TotalHabitaciones) {
        this.Dui = Dui;
        this.infoCliente = infoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjetaCredito = tarjetaCredito;
        this.telefono = telefono;
        this.TotalHabitaciones = TotalHabitaciones;
    }
    

    
    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public String getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(String infoCliente) {
        this.infoCliente = infoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTotalHabitaciones() {
        return TotalHabitaciones;
    }

    public void setTotalHabitaciones(int TotalHabitaciones) {
        this.TotalHabitaciones = TotalHabitaciones;
    }
    
    String Dui, infoCliente, nombre, apellido, tarjetaCredito, telefono;
    int TotalHabitaciones;
    
    public int Buscar(String name) {
        int cont = 0;
        int indice = 0;
        
        for (Habitacion e : habitaciones) {
            String lista;
            lista = e.toString();
            if (lista.equals(name)) {
                indice = cont;
            }
            cont++;
        }
        return indice;
        
    }
    
    public void HacerReservacion(){
        System.out.println("Nombre: ");
        this.nombre=leer.nextLine();
        System.out.println("Apellido: ");
        this.apellido= leer.nextLine();
        System.out.println("Telefono: ");
        this.telefono=leer.nextLine();
        
        
    }
    
}