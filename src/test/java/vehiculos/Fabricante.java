package vehiculos;

import java.util.ArrayList;

public class Fabricante  {
	
	private String nombre;
	private Pais pais;
	
	private int cantidadVendidos;
	public static ArrayList <Fabricante> fabricantes = new ArrayList<>();
	
	
	
	// cosntructor 
	public Fabricante (String nombre , Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		
		fabricantes.add(this);
	
		}
		
		
	//fabrica mayor ventas
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricanteMasVendedor = null;
		int maxVendidos = 0;
		
		for (int i = 0; i < Fabricante.fabricantes.size(); i++) {
			
			Fabricante fabricante = fabricantes.get(i);
			int cantidadVendidos = fabricante.getCantidadVendidos();
			
			if (cantidadVendidos > maxVendidos) {
				
				maxVendidos = cantidadVendidos;
				fabricanteMasVendedor = fabricante;
				
			}
			
		}
		
		return fabricanteMasVendedor;
	}
	
	
	

	//getters n setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}


	public int getCantidadVendidos() {
		return cantidadVendidos;
	}


	public void setCantidadVendidos(int cantidadVendidos) {
		this.cantidadVendidos = cantidadVendidos;
	}

	
	
	
}
