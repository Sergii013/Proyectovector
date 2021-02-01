
package misrc;


public class Main1 {
    
    public static void main(String[] args) {
        
        
        //ARRAY DINAMICO
        int[] edad;
        //INGRESE EL TAMAÑO DEL ARRAY
        System.out.print("Tamaño del array: ");
        int longitud = Entrada.readInt();
        edad = new int[longitud];
        
        
        for (int i = 0; i<longitud; i++) {
            System.out.println("Elemento " + (i+1));
            edad[i] = Entrada.readInt();
        }
        
        for (int i = 0; i<longitud; i++) {
            System.out.println("Elemento " + (i+1) + ": " + edad[i]);
        }
        
    }
    
}
