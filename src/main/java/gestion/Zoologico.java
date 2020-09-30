package gestion;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona = new ArrayList<>();

    public Zoologico(){
    }
    public Zoologico(String nombre,String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }

    public void agregarZonas(Zona zona){
        this.zona.add(zona);
    }
    public int cantidadTotalAnimales(){
        int numero=0;
        for(int i=0;i<zona.size();i++){
            numero+=zona.get(i).cantidadAnimales();
        }
        return numero;
    }
    public String getNombre(){
        return nombre;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public ArrayList<Zona> getZona(){
        return zona;
    }
}