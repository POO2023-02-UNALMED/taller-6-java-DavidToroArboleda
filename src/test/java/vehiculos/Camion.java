package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	
	private static ArrayList <Camion> listado = new ArrayList <Camion>();
	private int ejes;
	
	
	//constructor
	public Camion(String placa , String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super( placa , 2, 80,  nombre,  precio,  peso,  "4X2",  fabricante);
		this.ejes = ejes;
		
		listado.add(this);
	}

	//getters n setters
	public static ArrayList<Camion> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Camion> listado) {
		Camion.listado = listado;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	
	
}
