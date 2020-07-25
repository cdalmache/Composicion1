
package daniel.composicion1;

/**
 * @author ALMACHE CRISTIAN
 */
public class Pagina {
    
   
    
    //ATRIBUTOS  DE INSTANCIA
    private String contenido;
    private int numero;
    private int cont=0;
    
    //CONSTRUCTOR CON PARAMETROS
    public Pagina(String contenido, int numero){
        this.contenido=contenido;
        this.numero=numero;        
    }
    //METODO DE INSTANCIA
    public String getContenido(){
        return this.contenido;
    }
    public void setContenido(String nuevo_contenido){
        this.contenido=nuevo_contenido;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int nuevo_numero){
        this.numero=nuevo_numero;
    }
    public int getCont(){
        this.cont++;
        return cont;
        }
        @Override
        public String toString(){
               return "Pagina: "+numero + " Contenido: " + contenido + "" ;
    
    }
        
 }
