/*
 * IMPLEMENTE  UN ALGORITMO QUE ME PERMITA DESCRIBIR  LA CANTIDAD DE PIEZAS A 
SOLDAR QUE CONSTITUYA 2 CONTRUCTORES DEL TIPO  Soldadura_Pieza, 
incluyendo  2 atributos pieza y cantidad_pieza.
 */
package daniel.Soldadura_Fsw;

/**
 *
 * @author Almache Daniel
 */
 class Soldadura_Pieza {
    
     //ATRIBUTOS
    
    private String pieza;
    private int cantidad_pieza;
    
    //CONSTRUCTORES
    public Soldadura_Pieza(String pieza){
        this(pieza,0); //sobrecarga
    }
    public Soldadura_Pieza(String pieza, int cantidad_pieza){
        this.pieza=pieza; 
        //Si la cantidad_pieza es menor que cero, le ponemos cero.
        if(cantidad_pieza<0){
            this.cantidad_pieza=0;
      }else{
            this.cantidad_pieza=cantidad_pieza;
        }
    }
    
    //METODOS 
    public void setPieza(String pieza){
        this.pieza=pieza;
    }
    public String getPieza(){
        return pieza; 
    }
    public void setCantidad_Pieza(int cantidad_pieza){
        this.cantidad_pieza=cantidad_pieza;
      }
     public int getCantidad_Pieza(){
         return cantidad_pieza;
     }
      // Ingresa piezas a soldar 
     
     public void Ingresar_Pieza(int cantidad_pieza){
         if(cantidad_pieza>0){
             this.cantidad_pieza+=cantidad_pieza;
              }
     }
      public void Entregar_Pieza(int cantidad_pieza){
          if(cantidad_pieza<0){
              this.cantidad_pieza=cantidad_pieza;
          }else{
              this.cantidad_pieza-=cantidad_pieza;
          }
      }
      
      
      //Devolver el estado del objeto
      
      @Override
      public String toString(){
          return " En el proceso se encuentran "+cantidad_pieza+" piezas  de tipo: "+pieza+" para soldar.";
      }
       
}
//Clase ejecutable

class Soldadura{
    public static void main(String[] args){
        Soldadura_Pieza pieza1=new Soldadura_Pieza(" EJE DENTADO");
         Soldadura_Pieza pieza2=new Soldadura_Pieza(" VOLANTE DE INERSIA", 2);
         
         
         //INGRESO PIEZAS AL PROCESO
         pieza1.Ingresar_Pieza(3);
         pieza2.Ingresar_Pieza(2);
          //Entregar pieza
          pieza1.Entregar_Pieza(1);
          pieza2.Entregar_Pieza(1);
          //PRESENTACION DE INFORMACION DE SOLDADURAS
          System.out.println(pieza1);
          System.out.println(pieza2);
    }
}
