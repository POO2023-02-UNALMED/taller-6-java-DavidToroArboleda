package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	
	private static ArrayList <Camioneta> listado = new ArrayList <Camioneta>();
	private boolean volco;
	
	
	//constructor
	public Camioneta(String placa , int puertas,  String nombre, int precio, int peso,  Fabricante fabricante, boolean volco) {
		super( placa , puertas,  90,  nombre,  precio,  peso,  "4X4",  fabricante);
		this.volco = volco;
		
		listado.add(this);
	}

	
	//getters n setters
	public static ArrayList<Camioneta> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Camioneta> listado) {
		Camioneta.listado = listado;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	
	

}
