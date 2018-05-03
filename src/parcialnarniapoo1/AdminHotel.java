
package parcialnarniapoo1;
import java.util.ArrayList;
/**
 *
 * @author FerAnstirman
 */
public class AdminHotel {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Habitacion> habitaciones;
    private int numeroPisos=6;
    private int numeroHabitaciones=10;
    private double precioHabitacion=500;
    
    public AdminHotel(){
        clientes= new ArrayList<Cliente>();
        habitaciones= new ArrayList<Habitacion>();
        CrearHabitaciones();
    }

    //GETTERS Y SETTERS
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
    
    //FUNCIONES
    
    /**
     * Crea todas las habitaciones del hotel y la guarda en el ArrayList habitaciones
     */
    public void CrearHabitaciones(){
        for(int i=1;i<=numeroPisos;i+=1){
            for(int j=1;i<=numeroHabitaciones;j+=1){
                Habitacion nuevaHabitacion= new Habitacion();
                nuevaHabitacion.setNumHab(j);
                nuevaHabitacion.setPrecioHab(500);
                switch(i){
                    case 1:
                        nuevaHabitacion.setPiso("A");
                        break;
                    case 2:
                        nuevaHabitacion.setPiso("B");
                        break;
                    case 3:
                        nuevaHabitacion.setPiso("C");
                        break;
                    case 4:
                        nuevaHabitacion.setPiso("D");
                        break;
                    case 5:
                        nuevaHabitacion.setPiso("E");
                        break;
                    case 6:
                        nuevaHabitacion.setPiso("F");
                        break;
                    default:
                        System.out.println("Ha habido un error creando las habitaciones");
                }
                habitaciones.add(nuevaHabitacion);
            }
        }
        System.out.println("Se han creado todas las habitaciones con exito!");
    }
    
    void ModificarHabitacion(){
        
    }
}
