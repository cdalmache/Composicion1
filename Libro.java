
package daniel.composicion1;

/**
  * @author ALMACHE CRISTIAN
 */
public class Libro {
    //ATRIBUTOS
     private String titulo;
     private long isbn;
     private String autor; 
     private  int anioPublicacion;
     int aux=0;
     int cont=0;
     int cont2=0;
     
     
     //ATRIBUTOS REPRESENTANDO LA RELACION DE COMPOSICION
     private Pagina[]paginas;
     private int numeroPaginas;
     private Pagina paginaAux;
     //CONSTRUCTOR
     public Libro(String titulo,long isbn,String autor, int anioPublicacion){
         this.titulo=titulo;
         this.isbn=isbn;
         this.autor=autor;
         this.anioPublicacion=anioPublicacion;
         paginas = new Pagina[2];
        this.numeroPaginas=0;
     }
              //METODOS DE INSTANCIA
      public String getTitulo(){
          return this.titulo;
      }
      public void setTitulo(String titulo){
          this.titulo=titulo;
      }
      public long getIsbn(){
          return this.isbn;
      }
      public void setIsbn(long nuevo_Isbn){
          this.isbn=nuevo_Isbn;
      }
      public String getAutor(){
          return this.autor;
      }
      public void setAutor(String nuevo_autor){
          this.autor=nuevo_autor;
      }
      public int getAnioPublicacion(){
          return this.anioPublicacion;
      }
      public void setAnioPublicacion(int nuevo_anioPublicacion){
          this.anioPublicacion=nuevo_anioPublicacion;
      }
      //METODOS PARA TRABAJAR CON LA CLASE DE COMPOSICION 
      public int getNumeroPaginas(){
          return this.numeroPaginas;
      }
      public void AnadirPagina(Pagina nueva_Pagina){
          if(this.numeroPaginas<2){
              this.paginas[this.numeroPaginas]=nueva_Pagina;
          }
          
              this.numeroPaginas++;
          }
      
      public Pagina getPaginaNumero(int numero_Pagina){
         if(this.paginas[aux].getCont()==numero_Pagina){
             if(this.cont==0){
                 paginaAux=paginas[cont2];
                 cont2++;
                 return paginaAux;
             }
             cont2++;
             return paginas[cont2];
          }
          return null;
      }     
    @Override public String toString(){
        return "TITULO : "+titulo+" CODIGO: " +isbn+ " AUTOR: "+autor+" AÑO PUBLICACION: "+anioPublicacion+"";
        
    } 
        
}
