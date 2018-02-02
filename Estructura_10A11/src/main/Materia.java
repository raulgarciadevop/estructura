package main;

public class Materia {

  private String clave;

  private String nombre;

  private int creditos;

  private int nunid;
  
  private int calif;
  
  private Unidad u[];
  
    public Materia() {
        this.clave = "AED-1026";
        nombre = "Estructura de datos";
        this.creditos = 5;
        this.nunid = 6;
        this.u=new Unidad[nunid];
        this.calif=100;
    }//Constructor por default

    public Materia(String clave, String n, int creditos, int nunid, int calif) {
        this.clave = clave;
        nombre = n;
        this.creditos = creditos;
        this.nunid = nunid;
        this.u=new Unidad[nunid];
        this.calif=calif;
    }//Constructor

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNunid() {
        return nunid;
    }

    public void setNunid(int nunid) {
        this.nunid = nunid;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }
    
    public void leer(String nombre, int calif, int unid){
        u=new Unidad[unid];
    }
    
    public int prom(){
        int sum=0;
        for(Unidad un:u){
            sum+=un.getCalif();
        }
        calif=sum/u.length;
        return calif;
    }
    
    

    @Override
    public String toString() {
        return "clave = " + clave + " - nombre = " + nombre + " - creditos = " + creditos + " - nunid = " + nunid+" - calif = "+calif;
    }
    
    /*
    Crear la clase Ventana que extiende a JFrame y conectarla con las clases
    - Datos Materia (titulo)
    
    Debera capturar:
    - Clave <- Captura
    - Nombre <- Captura
    - Numero Unidades <- Captura
    - Calif <- No captura, se promedia de la tabla
    
    Y mostrarlo en una jTable 
    Campos:
    NU(numero unidad) (llena en automatico)
    Nombre
    Calif <- Captura
    
    */
    
         
  

}