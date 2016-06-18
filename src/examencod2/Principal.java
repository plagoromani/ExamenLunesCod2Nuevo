package examencod2;

import javax.swing.JOptionPane;

/**
 * Clase en la cual se va a crear un contador, y nos muestre por pantalla los números seleccionados.
 * @author Pablite5
 */


public class Principal {

    public static boolean nprimo = false;
    
    public static void main(String arg[]){
        /**
         * Aqui pedimos por pantalla que ingresemos el numero de digitos que queremos que se nos muestre.
         * @param ndig es igual a 0 para que no tome otro valor.
         */
        
        int digito= Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        int numerodigito;
        
        
     /**
      * Si el dígito es mayor que 0 se procede a funcionar el bucle, si se pone cero no iniciará el bucle.
      */
        
        if(digito<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        
        /**
         * Se crea un for para recorrer el bucle.
         * @param x es un parámetro que tenemos que crear, ya que si fuese numeroComprobar el resultado sería distinto
         */
        for(int numeroComprobar = 1; numeroComprobar <= 99999; numeroComprobar++ )
        {
            //renombramos la variable aux a x, para que sepamos que x va a ser un número cualquiera, que vamos a comprobar si es primo o no.
            int x = numeroComprobar;
 
            int contador=0;
 
            while (x != 0){
            x = x / 10;
            contador++;
        }
        /**
         * Se procede a realizar las operaciones del bucle.
         * Aquí el bucle decirirá si mostrarlo luego o no.
         * Si es igual a true se mostrará.
         * Si es igual a false no se mostrará nada.
         * Realizá las cuentas y finalmente las muestra
         * Creamos el segundo contador
         * Renombramos las variables para dar más sentido al programa.
         */
            numerodigito=contador;
            
            
            if(numerodigito==digito){
                   if (numeroComprobar < 4) nprimo = true;
            else
            {
            if (numeroComprobar % 2 == 0) nprimo = false; 
                else
                {
                    int contador2 = 0;  
                    int numerop = 1; 
                    int numeronuevo = (numeroComprobar - 1) / 2; 
                    if  (numeronuevo % 2 == 0) numeronuevo--;  
             
                    while(numerop <= numeronuevo)
                    {
                        if (numeroComprobar % numerop == 0) contador2++;
                            numerop += 2;
                            if (contador2 == 2) numerop = numeronuevo + 1;
                    }

        if (contador2 == 1)nprimo = true;
            } 
        } 
     /**
      * Aquí se mostrará si el resultado es igual a true.
      */
                if (nprimo == true) 
                    System.out.println(numeroComprobar);    
            }
        }
        }
 
       
 
    
}
