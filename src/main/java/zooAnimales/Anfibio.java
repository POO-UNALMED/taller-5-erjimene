package zooAnimales;

import java.util.List;

public class Anfibio extends Animal{
	
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	
	public Anfibio() {
		
	}	

	public Anfibio(String nombre, int edad, String habitat, String genero, int ranas,
			int salamandras, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}



	public static int cantidadAnfibios() {
		return (ranas+salamandras);		
	}
	
	public void movimiento() {
		System.out.println("saltar");		
	}
	
	public void crearRana() {
		super.setTotalAnimales();
		Anfibio R = new Anfibio();
		ranas +=1;
		listado.add(R);
	}
	
	public void crearSalamandra() {
		super.setTotalAnimales();
		Anfibio Sm = new Anfibio();
		salamandras +=1;
		listado.add(Sm);
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
	
	

}
