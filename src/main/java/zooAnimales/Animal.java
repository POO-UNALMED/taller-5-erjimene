package zooAnimales;
import gestion.Zona;

public class Animal {

    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){

    }
    public Animal(String nombre,int edad,String habitat,String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
    }

    public String movimiento(){
        return "desplazarse";

    }
    public static String totalPorTipo(){
        return "Mamiferos: "+Mamifero.getListado()+
                "\nAves: "+Ave.getListado()+
                "\nReptiles: "+Reptil.getListado()+
                "\nPeces: "+Pez.getListado()+
                "\nAnfibios: "+Anfibio.getListado();
    }
    public String toString(){
        if (this.zona == null){
            return "Mi nombre es " +nombre+", tengo una edad de "+edad+", habito en "
                    +habitat+" y mi genero es "+genero;
        }
        else
            return "Mi nombre es " +nombre+", tengo una edad de "+edad+", habito en"
                    +habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona+", en el zoo "+zona.getZoo();

    }

    public int getTotalAnimales(){
        return totalAnimales;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getHabitat(){
        return habitat;
    }
    public String getGenero(){
        return genero;
    }
    public Zona getZona(){
        return zona;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setHabitat(String habitad){
        this.habitat=habitad;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setZona(Zona zona){
        this.zona=zona;
    }
}
