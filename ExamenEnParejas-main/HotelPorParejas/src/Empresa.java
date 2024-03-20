import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa {

    //Atributos
    private HashMap<String,Cliente> mapaClientes;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Reserva> listaReservas;

    //Metodos
    //Constructor

    public Empresa() {

        this.mapaClientes = new HashMap<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }
    //Getters and Setters

    //Otros metodos

    public boolean crearVehiculo(Vehiculo v){
        if (v != null && comprobarVehiculoLista(v) == false){
            listaVehiculos.add(v);
            return true;
        }
        return false;
    }

    public boolean comprobarVehiculoLista(Vehiculo v){
        for (int i = 0; i < listaVehiculos.size(); i++){
            if (this.listaVehiculos.get(i) == v){
                return true;
            }
        }
        return false;
    }

    public boolean crearCliente(Cliente c){
        if (c != null && !mapaClientes.containsValue(c)){
            mapaClientes.put(c.dni, c);
            return true;
        }
        return false;
    }

    public boolean crearReserva(Cliente c, Vehiculo v,String fechaInicio,int diasAlquilado){
        if (comprobarVehiculoLista(v) && mapaClientes.containsValue(c)){
            listaReservas.add(new Reserva(c,v,fechaInicio,diasAlquilado));
            return true;
        }
        return false;
    }

    public ArrayList<Vehiculo> listarCoches(int plazasMax, String tipoMotor){
        ArrayList<Vehiculo> listaCoches = new ArrayList<>();

        for (Vehiculo v: listaVehiculos){
            if (v instanceof Coche && isAlquilado != true){
                if (plazasMax > ((Coche) v).getPlazasMax() && tipoMotor == v.tipoMotor){
                    listaCoches.add(v);
                }
            }
        }
        return listaCoches;
    }

    public ArrayList<Vehiculo> listarFurgon(int cargaMax,int plazas){
        ArrayList<Vehiculo> listaFurgon = new ArrayList<>();

        for (Vehiculo v: listaVehiculos){
            if (v instanceof Furgon && isAlquilado != true){
                if (cargaMax > ((Furgon) v).cargaMax && plazas > ((Furgon) v).plazas){
                    listaFurgon.add(v);
                }
            }
        }
        return listaFurgon;
    }

    public ArrayList<Vehiculo> listaCamion(float cargaMax, float longitud){
        ArrayList<Vehiculo> listaCamion = new ArrayList<>();

        for (Vehiculo v: listaVehiculos){
            if (v instanceof Camion && isAlquilado != true){
                if (cargaMax > ((Camion) v).getCargaMax() && longitud < ((Camion) v).getLongitud()){
                    listaCamion.add(v);
                }
            }
        }
        return listaCamion;
    }

    public Vehiculo devolverVehiculo(float kmRecorridos, float precioDia){
        

    }

}
