import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Empresa miEmpresa = new Empresa();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String resp;
    	
    	boolean salirMenu = false;
    	
    	//Menú
    	
    	do {
    		System.out.println("\n------------ MENÚ ------------");
    		System.out.println("1) Dar de alta un vehículo");
    		System.out.println("2) Dar de alta un cliente");
    		System.out.println("3) Alquilar a un cliente un vehículo");
    		System.out.println("4) Listar vehículos");
    		System.out.println("5) Devolver vehículo");
    		System.out.println("Elija una opción");
    		
    		resp = sc.nextLine();
    		
    		if(resp.compareTo("1")==0) {
        		darAltaVehiculo(miEmpresa);
        	}else if(resp.compareTo("2")==0) {
        		darAltaCliente(miEmpresa);
        	}else if(resp.compareTo("3")==0) {
        		realizarAlquiler(miEmpresa);
        	}else if(resp.compareTo("4")==0) {
        		listarVehiculos(miEmpresa);
        	}else if(resp.compareTo("5")==0) {
        		devolverVehiculo(miEmpresa);
        	}else {
        		salirMenu = true;
        	}
        	
    		
    	}while(!salirMenu);
    	
    }
    
    private static void darAltaVehiculo(Empresa miEmpresa) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Elija un opción:");
    	System.out.println("1) Coche");
    	System.out.println("2) Furgón");
    	System.out.println("3) Camión");
    	
    	String resp = sc.nextLine();
    	
    	if(resp.compareTo("1")==0) {
    		darAltaCoche(miEmpresa);
    	}else if(resp.compareTo("2")==0) {
    		darAltaFurgon(miEmpresa);
    	}else if(resp.compareTo("3")==0) {
    		darAltaCamion(miEmpresa);
    	}else {
    		System.out.println("Opción incorrecta");
    	}
    	
    }
    
    private static void darAltaCoche(Empresa miEmpresa) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduce los datos del coche:");
    	System.out.println("Matricula");
    	String matricula = sc.nextLine();
    	System.out.println("Modelo");
    	String modelo = sc.nextLine();
    	System.out.println("Marca");
    	String marca = sc.nextLine();
    	System.out.println("Tipo de motor (eléctrico, híbrido, enchufable, híbrido, gasolina o diesel)");
    	String tipoMotor = sc.nextLine();
    	System.out.println("Km reocrridos");
    	float kmRecorridos = Float.valueOf(sc.nextLine());
    	System.out.println("Precio por día");
    	float precioDia = Float.valueOf(sc.nextLine());
    	System.out.println("Plazas máximas");
    	int plazasMax = Integer.valueOf(sc.nextLine());
    	System.out.println("Número de puertas");
    	int numPuertas = Integer.valueOf(sc.nextLine());
    	System.out.println("Volumen de maletero");
    	float volMaletero = Float.valueOf(sc.nextLine());
    	System.out.println("Tipo de coche (utilitario, berlina, monovolumen o suv).");
    	String tipoCoche = sc.nextLine();
    	
    	if(miEmpresa.crearVehiculo(new Coche(matricula, modelo, marca, tipoMotor, kmRecorridos,precioDia, plazasMax, numPuertas, volMaletero, tipoCoche))) {
    		System.out.println("Coche introducido correctamente");
    	}
    	
    }
    
    private static void darAltaFurgon(Empresa miEmpresa) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduce los datos del furgón:");
    	System.out.println("Matricula");
    	String matricula = sc.nextLine();
    	System.out.println("Modelo");
    	String modelo = sc.nextLine();
    	System.out.println("Marca");
    	String marca = sc.nextLine();
    	System.out.println("Tipo de motor (eléctrico, híbrido, enchufable, híbrido, gasolina o diesel)");
    	String tipoMotor = sc.nextLine();
    	System.out.println("Km reocrridos");
    	float kmRecorridos = Float.valueOf(sc.nextLine());
    	System.out.println("Precio por día");
    	float precioDia = Float.valueOf(sc.nextLine());
    	System.out.println("Carga máxima");
    	int cargaMax = Integer.valueOf(sc.nextLine());
    	System.out.println("Plazas máximas");
    	int plazasMax = Integer.valueOf(sc.nextLine());
    	
    	if(miEmpresa.crearVehiculo(new Furgon(matricula, modelo, marca, tipoMotor, kmRecorridos,precioDia,cargaMax, plazasMax))) {
    		System.out.println("Furgon introducido correctamente");
    	}
    }
    
    private static void darAltaCamion(Empresa miEmpresa) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduce los datos del camión:");
    	System.out.println("Matricula");
    	String matricula = sc.nextLine();
    	System.out.println("Modelo");
    	String modelo = sc.nextLine();
    	System.out.println("Marca");
    	String marca = sc.nextLine();
    	System.out.println("Tipo de motor (eléctrico, híbrido, enchufable, híbrido, gasolina o diesel)");
    	String tipoMotor = sc.nextLine();
    	System.out.println("Km reocrridos");
    	float kmRecorridos = Float.valueOf(sc.nextLine());
    	System.out.println("Precio por día");
    	float precioDia = Float.valueOf(sc.nextLine());
    	System.out.println("Carga máxima");
    	Float cargaMax = Float.valueOf(sc.nextLine());
    	System.out.println("Longitud");
    	float longitud = Float.valueOf(sc.nextLine());
    	
    	
    	if(miEmpresa.crearVehiculo(new Camion(matricula, modelo, marca, tipoMotor, kmRecorridos,precioDia,cargaMax, longitud))) {
    		System.out.println("Camión introducido correctamente");
    	}
    }
    
    private static void darAltaCliente(Empresa miEmpresa) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduce los datos del cliente:");
    	System.out.println("Nombre");
    	String nombre = sc.nextLine();
    	System.out.println("Apellidos");
    	String apellidos = sc.nextLine();
    	System.out.println("Email");
    	String email = sc.nextLine();
    	System.out.println("Teléfono");
    	String tfno = sc.nextLine();
    	System.out.println("DNI");
    	String dni = sc.nextLine();
    	System.out.println("Número de tarjeta de crédito");
    	String numTarjeta = sc.nextLine();
    	
    	
    	if(miEmpresa.crearCliente(new Cliente(nombre, apellidos, email, tfno, dni, numTarjeta))) {
    		System.out.println("Cliente introducido correctamente");
    	}
    }
    
    private static void realizarAlquiler(Empresa miEmpresa) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduce el dni del cliente");
    	String dni = sc.nextLine();
    	System.out.println("Introduce la matrícula del coche");
    	String matricula = sc.nextLine();
    	System.out.println("Introduce el número de días alquilado");
    	int numDias = Integer.valueOf(sc.nextLine());
    	System.out.println("Introduce la fecha de inicio");
    	String fecha = sc.nextLine();
    	
    	
    	if(miEmpresa.crearReserva(dni, matricula, fecha, numDias)) {
    		System.out.println("Reserva realizada correctamente");
    	}
    }
    
    private static void listarVehiculos(Empresa miEmpresa) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Elija un opción:");
    	System.out.println("1) Coche");
    	System.out.println("2) Furgón");
    	System.out.println("3) Camión");
    	
    	String resp = sc.nextLine();
    	
    	if(resp.compareTo("1")==0) {
    		listarCoches(miEmpresa);
    	}else if(resp.compareTo("2")==0) {
    		listarFurgones(miEmpresa);
    	}else if(resp.compareTo("3")==0) {
    		listarCamiones(miEmpresa);
    	}else {
    		System.out.println("Opción incorrecta");
    	}
    	
    }
    
    private static void listarCoches(Empresa miEmpresa) {
    	Scanner sc= new Scanner(System.in);
		
		System.out.println("Plazas mayor a:");
		int plazas = Integer.valueOf(sc.nextLine());
		System.out.println("Tipo de motor (eléctrico, híbrido enchufable, híbrido, gasolina o diesel)");
		String tipoMotor = sc.nextLine();
		
		ArrayList<Vehiculo> cochesDisponibles = miEmpresa.listarCoches(plazas, tipoMotor);
		
		for(Vehiculo uno:cochesDisponibles) {
			System.out.println("\n Matricula: " + ((Coche) uno).getMatricula() + 
					"\n Marca: " + ((Coche) uno).getMarca() + 
					"\n Modelo: " + ((Coche) uno).getModelo() +
					"\n Tipo de motor: " + ((Coche) uno).getTipoMotor() + 
					"\n Km recorridos: " + ((Coche) uno).getKmRecorridos() +
					"\n Precio por día: " + ((Coche) uno).getPrecioDia() +
					"\n Número de plazas:" + ((Coche) uno).getPlazasMax() + 
					"\n Número de puertas:" + ((Coche) uno).getPuertas() +
					"\n Volumen del maletero:" + ((Coche) uno).getVolMaletero() +
					"\n Tipo de coche:" + ((Coche) uno).getTipoCoche());
		}
    }
    
    private static void listarFurgones(Empresa miEmpresa) {
    	Scanner sc= new Scanner(System.in);
		
		System.out.println("Carga mayor a:");
		int carga = Integer.valueOf(sc.nextLine());
		System.out.println("Plazas mayor a:");
		int plazas = Integer.valueOf(sc.nextLine());
		
		ArrayList<Vehiculo> furgonesDisponibles = miEmpresa.listarFurgon(carga, plazas);
		
		for(Vehiculo uno:furgonesDisponibles) {
			System.out.println("\n Matricula: " + ((Furgon) uno).getMatricula() + 
					"\n Marca: " + ((Furgon) uno).getMarca() + 
					"\n Modelo: " + ((Furgon) uno).getModelo() +
					"\n Tipo de motor: " + ((Furgon) uno).getTipoMotor() + 
					"\n Km recorridos: " + ((Furgon) uno).getKmRecorridos() +
					"\n Precio por día: " + ((Furgon) uno).getPrecioDia() +
					"\n Carga máxima: " + ((Furgon) uno).getCargaMax() +
					"\n Plazas:" + ((Furgon) uno).getPlazas());
		}
    }
    
    private static void listarCamiones(Empresa miEmpresa) {
    	Scanner sc= new Scanner(System.in);
		
		System.out.println("Carga mayor a:");
		int carga = Integer.valueOf(sc.nextLine());
		System.out.println("Longuitud máxima:");
		int longuitud = Integer.valueOf(sc.nextLine());
		
		ArrayList<Vehiculo> camionesDisponibles = miEmpresa.listaCamion(carga, longuitud);
		
		for(Vehiculo uno:camionesDisponibles) {
			System.out.println("\n Matricula: " + ((Furgon) uno).getMatricula() + 
					"\n Marca: " + ((Furgon) uno).getMarca() + 
					"\n Modelo: " + ((Furgon) uno).getModelo() +
					"\n Tipo de motor: " + ((Furgon) uno).getTipoMotor() + 
					"\n Km recorridos: " + ((Furgon) uno).getKmRecorridos() +
					"\n Precio por día: " + ((Furgon) uno).getPrecioDia() +
					"\n Carga máxima: " + ((Furgon) uno).getCargaMax() +
					"\n Longuitud: " + ((Camion) uno).getLongitud());
		}
    }
    
    private static void devolverVehiculo(Empresa miEmpresa) {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("Introduce la matrícula del coche");
    	String matricula = sc.nextLine();
    	System.out.println("Introduce el número de kilómetros");
    	float numKm = Float.valueOf(sc.nextLine());
    	
    	System.out.println("El precio a pagar es: " + miEmpresa.devolverVehiculo(matricula, numKm));
    }
}