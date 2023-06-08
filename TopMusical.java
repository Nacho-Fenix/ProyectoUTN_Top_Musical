import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopMusical {

    // Mapa de bandas y sus canciones populares
    private static Map<String, String[]> topBandas = new HashMap<>();

    public static void main(String[] args) {
        // Agregar los tops de música predefinidos
        agregarTopsPredefinidos();

        // Solicitar al usuario el top que quiere ver
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a este Top 10 mejores bandas de Rock");
        System.out.print("Ingresa el top que quieres ver (1-10): ");
        int top = scanner.nextInt();
        scanner.close();

        // Verificar si el top ingresado es válido
        if (top < 1 || top > 10) {
            System.out.println("El top ingresado no es válido.");
            return;
        }

        // Obtener la lista de bandas y canciones del top
        String[] bandas = topBandas.keySet().toArray(new String[0]);
        String banda = bandas[top - 1];
        String[] canciones = topBandas.get(banda);

        // Mostrar las canciones del top
        System.out.println("Top " + top + " de música - Banda: " + banda);
        for (int i = 0; i < canciones.length; i++) {
            System.out.println((i + 1) + ". " + canciones[i]);
        }
    }

    // Agregar tops de musica predefinidos al mapa
    private static void agregarTopsPredefinidos() {
        //top1
        topBandas.put("Theory of Deadman", new String[] { "Canción 1:Point to prove", "Canción 2:The Last song", "Canción 3:By the Way", "Canción 4:Two of us", "Canción 5:Angel" });
        //top4
        topBandas.put("Foo Fighters", new String[] { "Canción 1:Best of you", "Canción 2:We run", "Canción 3:Walk", "Canción 4:The pretender", "Canción 5:Everlong" });
        //top5
        topBandas.put("Linking Park", new String[] { "Canción 1:In the end", "Canción 2:Numb", "Canción 3:Leave it out the rest", "Canción 4:Papercut", "Canción 5:Castle of glass" });
        //top3
        topBandas.put("Pearl Jam", new String[] { "Canción 1:EvenFlow", "Canción 2:Alive", "Canción 3:Black", "Canción 4:Soldier of Love", "Canción 5:Animal" });
        //top2
        topBandas.put("TOTO", new String[] { "Canción 1:Can you hear what im saying", "Canción 2:Love has the power", "Canción 3:Tale of a man", "Canción 4:The chains", "Canción 5:Dont chain my heart" });
        
        
        //no pregunten como pero cuando se ejecuta ese es el orden del top cuando el usuario ingresa del 1 al 5 de momento....
        // Agregar mas bandas y canciones aca...
       
        
    }
}