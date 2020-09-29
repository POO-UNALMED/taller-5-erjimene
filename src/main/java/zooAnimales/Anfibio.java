package zooAnimales;

import java.util.*;

public class Anfibio extends Animal{
	
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	
	public Anfibio() {
		listado.add(this);		
	}	

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);	
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}



	public static int cantidadAnfibios() {
		return listado.size();		
	}
	
	public String movimiento() {
		return "saltar";		
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas ++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras ++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}	

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static List<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	

}
