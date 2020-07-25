package daniel.composicion1;

/**
 *
 * @author ALMACHE CRISTIAN
 */


public class Composicion1 {
     public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("COMPOSICION 1 ");
         System.out.println("_________________________________________________________________");
         System.out.println("_________________________________________________________________");
    }

       public static void main(String[] args) {
        //DECLARACION Y DEFICNICION DE OBJETOS
         Encabezado();
        Libro Controles_Instrumentos=new Libro("Arranque y apagado del motor", 12345296,"Chevrolet",2020);
         Pagina pagina1=new Pagina("Asegurese de que todos los interruptores estén en la posicion desactivada",4);
         Pagina pagina2=new Pagina("Gire interruptor de arranque a posicion ON verifique luces y combustible normal",5);
         //PASADO AL OBJETO Libro
         Controles_Instrumentos.AnadirPagina(pagina1);
         Controles_Instrumentos.AnadirPagina(pagina2);
         System.out.println(Controles_Instrumentos.toString());
         System.out.println("--------------------------------------------------------------------------");
         for(int i=1; i<=Controles_Instrumentos.getNumeroPaginas();i++){
            System.out.println(Controles_Instrumentos.getPaginaNumero(i));
             
         }
    }
    
}
