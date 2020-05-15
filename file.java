import java.util.Scanner;

public class ConB {

   

    public static void main(String[] args) {
    	int[] monedas = {1, 5, 10, 25, 50}; //En esta linea hacemos un array de los valores de las monedas que nos da el ejercicio
        long[] solucion = new long[7490];//En esta linea hacemos un array de todos los numeros entre 0 y 7489 que es un numero
        //fijo que nos da el ejercicio y dice que los casos no excederan este numero
        
        solucion[0] = 1; // en esta linea ponemos el valor de uno al caso 0 porque asi lo especifica el ejercicio

        for (int i = 0; i < monedas.length; i++) {//aqui hacemos un for para recorrer cada uno de los valores de las monedas
            for (int j = 1; j < solucion.length; j++) {// aqui hacemos un for que recorre todos los numeros del 1 al 7489
                if (j - monedas[i] >= 0) { //en este if verificamos que la resta del numero con el peso de la moneda sea mayor o igual a 0
                    solucion[j] += solucion[j - monedas[i]];// aqui restamos el peso de la moneda al numero y lo guardamos en la misma 
                    //posicion donde se encontraba el numero
                }
            }
        }
        
        Scanner sc = new Scanner(System.in); //Aqui instanciamos el objeto Scanner para poder leer los valores de la consola

        while (sc.hasNextInt()) {//Aqui hacemos un while para poder agarrar los valores de la consolola hasta que la consola no tena valores no leidos
        	int n = sc.nextInt(); //Aqui el valor n lee cada entero que encuentre en la consola
            System.out.println(solucion[n]);// aqui imprime el resultado que se recupera del arreglo donde estan todas
            //las soluciones para todos los numeros y agarra del numero pedido
        }

    }
}