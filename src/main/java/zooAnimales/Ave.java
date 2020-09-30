package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{

    private static ArrayList<Ave> listado=new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){
        listado.add(this);
    }
    public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas){
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setHabitat(habitat);
        super.setGenero(genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }

    public int cantidadAves(){
        return listado.size();
    }
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave(nombre,edad,"montañas",genero,"cafeglorioso");
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
    }

    public String getColorPlumas(){
        return colorPlumas;
    }
    public static int getListado(){
        return listado.size();
    }

}
