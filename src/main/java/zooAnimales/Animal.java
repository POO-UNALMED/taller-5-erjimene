package zooAnimales;

import gestion.*;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	
	public Animal() {
		
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero) {		
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}



	public void movimiento() {
		System.out.println("desplazarse");		
	}
	
	public void totalPorTipo() {
		System.out.println("Mamiferos: "+ Mamifero.cantidadMamiferos());
		System.out.println("Aves: "+ Ave.cantidadAves());
		System.out.println("Reptiles: "+ Reptil.cantidadReptiles());
		System.out.println("Peces: "+ Pez.cantidadPeces());
		System.out.println("Anfibios: "+ Anfibio.cantidadAnfibios());				
	}
	
	public String toString() {
		System.out.println("Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+Zona.getNombre());		
	}

	
}
