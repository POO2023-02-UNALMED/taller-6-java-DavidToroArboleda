package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private int cantidadVendidos;
	private static ArrayList <Pais> listado = new ArrayList <Pais>();
	private String nombre;
	
	//constructor 
	public Pais(String nombre) {
		this.nombre = nombre;
		
		Pais.listado.add(this);
		
		
	}
	
	
	//Pais con mas ventas
	
	public Pais paisMasVendedor() {
		
		Pais paisMasVendedor = null;
		int maxVendidos = 0;
		
		for (int i = 0;i < Pais.listado.size(); i++) {
			
			Pais pais = listado.get(i);
			int cantidadVendidos = pais.getCantidadVendidos();
			
			if ( cantidadVendidos > maxVendidos ) {
				maxVendidos = cantidadVendidos;
				paisMasVendedor = pais;
			}
		}
		
		return paisMasVendedor;
	
	}
	
	
	
	


	//getters n setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidadVendidos() {
		return cantidadVendidos;
	}


	public void setCantidadVendidos(int cantidadVendidos) {
		this.cantidadVendidos = cantidadVendidos;
	}


	public static ArrayList<Pais> getListado() {
		return listado;
	}


	public static void setListado(ArrayList<Pais> listado) {
		Pais.listado = listado;
	}


	
	

}
