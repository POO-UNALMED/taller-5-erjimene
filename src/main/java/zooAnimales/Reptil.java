package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado=new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
        listado.add(this);
    }
    public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setHabitat(habitat);
        super.setGenero(genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        listado.add(this);
    }

    public static int cantidadReptiles(){
        return listado.size();
    }
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre,edad,"humedal",genero,"verde",3);

    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
    }

    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getLargoCola(){
        return largoCola;
    }
    public static int getListado(){
        return listado.size();
    }
}