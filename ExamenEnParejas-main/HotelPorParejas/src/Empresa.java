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
    
    public Vehiculo buscarVehiculo(String matricula){
        for (int i = 0; i < listaVehiculos.size(); i++){
            if (this.listaVehiculos.get(i).getMatricula().compareTo(matricula)==0){
                return listaVehiculos.get(i);
            }
        }
        return null;
    }

    public boolean crearCliente(Cliente c){
        if (c != null && !mapaClientes.containsValue(c)){
            mapaClientes.put(c.getDni(), c);
            return true;
        }
        return false;
    }

    public boolean crearReserva(String dni, String matricula, String fechaInicio,int diasAlquilado){
    	Vehiculo v = buscarVehiculo(matricula);
    	if(v != null) {
	        if (mapaClientes.containsKey(dni)){
	        	v.setAlquilado(true);
	            listaReservas.add(new Reserva(mapaClientes.get(dni),v,fechaInicio,diasAlquilado));
	            return true;
	        }
    	}
        return false;
    }

    public ArrayList<Vehiculo> listarCoches(int plazasMax, String tipoMotor){
        ArrayList<Vehiculo> listaCoches = new ArrayList<>();

        for (Vehiculo v: listaVehiculos){
            if (v instanceof Coche && v.isAlquilado() != true){
                if (plazasMax < ((Coche) v).getPlazasMax() && tipoMotor.compareTo(v.getTipoMotor())==0){
                    listaCoches.add(v);
                }
            }
        }
        return listaCoches;
    }

    public ArrayList<Vehiculo> listarFurgon(int cargaMax,int plazas){
        ArrayList<Vehiculo> listaFurgon = new ArrayList<>();

        for (Vehiculo v: listaVehiculos){
            if (v instanceof Furgon && v.isAlquilado() != true){
                if (cargaMax < ((Furgon) v).getCargaMax() && plazas < ((Furgon) v).getPlazas()){
                    listaFurgon.add(v);
                }
            }
        }
        return listaFurgon;
    }

    public ArrayList<Vehiculo> listaCamion(float cargaMax, float longitud){
        ArrayList<Vehiculo> listaCamion = new ArrayList<>();

        for (Vehiculo v: listaVehiculos){
            if (v instanceof Camion && v.isAlquilado() != true){
                if (cargaMax < ((Camion) v).getCargaMax() && longitud > ((Camion) v).getLongitud()){
                    listaCamion.add(v);
                }
            }
        }
        return listaCamion;
    }

    public float devolverVehiculo(String matricula, double kmsRecorridosAlquilados){
        float precioApagar = 0;

        for (int i = 0; i < listaReservas.size(); i++){
        if (listaReservas.get(i).getVehiculo().getMatricula().compareTo(matricula) == 0){
            listaReservas.get(i).getVehiculo().setAlquilado(false);
            float kmsTotales = (float) kmsRecorridosAlquilados / listaReservas.get(i).getDiasAlquilado();
            if (kmsTotales > 500){
                precioApagar = listaReservas.get(i).getVehiculo().getPrecioDia() + listaReservas.get(i).getVehiculo().getPrecioDia() * 20 / 100;
            }else {
                precioApagar = listaReservas.get(i).getVehiculo().getPrecioDia();
            }
        listaReservas.remove(listaReservas.get(i));
        }
    }
    return precioApagar;
    }

}
