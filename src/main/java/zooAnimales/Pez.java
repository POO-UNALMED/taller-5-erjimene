package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{

    private static ArrayList<Pez> listado=new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){
        listado.add(this);
    }
    public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas, int cantidadAletas){
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setHabitat(habitat);
        super.setGenero(genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        listado.add(this);
    }

    public int cantidadPeces(){
        return listado.size();
    }
    public String movimiento(){
        return "nadar";
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return new Pez(nombre,edad,"oceano",genero,"rojo",6);
    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        return new Pez(nombre,edad,"oceano",genero,"gris",6);
    }

    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getCantidadAletas(){
        return  cantidadAletas;
    }
    public static int getListado(){
        return listado.size();
    }
}