package vehiculos;
import java.util.ArrayList;



public class Automovil extends Vehiculo {
	
	private static ArrayList <Automovil> listado = new ArrayList <Automovil>();
	private int puestos;
	
	
	//constructor
	public Automovil(String placa , String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super( placa , 4,  100,  nombre,  precio,  peso,  "FWD",  fabricante);
		this.puestos = puestos;
		
		listado.add(this);
	}

	
	//getters n setters
	public static ArrayList<Automovil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Automovil> listado) {
		Automovil.listado = listado;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	
	

}
