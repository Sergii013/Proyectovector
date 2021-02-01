

package misrc;
public class Main2 {
    public static void main(String[] args) {
        
        //ARRAY BIDIMENSIONAL O MATRIZ
        
        String [][] nombre = {
            {"Luis", "Gerardo"},
            {"Carlos", "Juan"},
            {"Mario", "Alejandro"}
        };
        //RECORRER LA MATRIZ
        for (int i = 0; i<nombre.length; i++) { //FILAS
            for (int j = 0; j<nombre[0].length; j++) { //COLUMNAS
                System.out.print(nombre[i][j] + "\t");
            }
            System.out.println();
        }
       
    }
    
}
