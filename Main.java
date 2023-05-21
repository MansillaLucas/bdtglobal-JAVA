import java.util.Arrays;

class Main {

    // Ejercicio 1
    static public int ocurrencias(int buscado, int[] arreglo){

        return (int) Arrays
        .stream(arreglo)
        .filter(e -> e == buscado)
        .count();

    }

    // Ejercicio 2
    static public void asteriscos(int[] arreglo){

        int i = 0;

        for(i=1;i<10;i++){
            
            int c = 0;

            for(int elem:arreglo){
                if(elem==i)
                    c++;
            }

            System.out.println(i + ": " + "*".repeat(c));

        }

    }

    public static void main(String[] args) {
        
        // Ejercicio 1
        int[] array = {1,2,3,2,4,2,3};
        int count = ocurrencias(3, array);
        System.out.println("El contador de elementos es: " + count);

        // Ejercicio 2
        int[] myArray = { 8,1,6,7,8,4,9,8,2 }; 
        asteriscos(myArray);

    }

}