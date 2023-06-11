import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TopMusical {

    // Mapa de bandas y sus canciones populares
    private static Map<String, String[]> topBandas = new LinkedHashMap<>();

    public static void main(String[] args){
        
    // Solicita al usuario el top que quiere

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a este Top 10 de las mejores bandas de Rock internacional");
        System.out.print("Las bandas del top son:");
        System.out.print("\nTop 1:Theory of Deadman\nTop 2:Foo Fighters\nTop 3:Linking Park\nTop 4:Pearl Jam\nTop 5:TOTO\nTop 6:Green Day\nTop 7:Good Charlotte\nTop 8:System of a Down\nTop 9:Creed\nTop 10:Thirty Seconds To Mars\n\n");
        System.out.print("Ingresa el top que quieres (1-10):");
        int top = scanner.nextInt();
        scanner.close();

        // Analiza si el top ingresado es válido
        if (top < 1 || top > 10) {
            System.out.println("El top ingresado no es válido.");
            return;
        }
        // Se invoca a la lista de canciones
        agregarTopsPredefinidos();

        // Obtener la lista de bandas y canciones del top
        String[] bandas = topBandas.keySet().toArray(new String[0]);
        String banda = bandas[top - 1];
        String[] canciones = topBandas.get(banda);

        // Mostrar las canciones del top
        System.out.println("Top " + top + " Banda: " + banda);
        for (int i = 0; i < canciones.length; i++) {
            System.out.println((i + 1) + "º" + canciones[i]);
        }
    }

    // Agregar tops de musica predefinidos al mapa
    private static void agregarTopsPredefinidos() {
        // top1
        topBandas.put("Theory of Deadman", new String[] { "Canción:Point to prove", "Canción:The Last song",
                "Canción:By the Way", "Canción:Two of us", "Canción:Angel" });
        // top2
        topBandas.put("Foo Fighters", new String[] { "Canción:Best of you", "Canción:We run", "Canción:Walk",
                "Canción:The pretender", "Canción:long" });
        // top3
        topBandas.put("Linking Park", new String[] { "Canción:In the end", "Canción:Numb",
                "Canción:Leave it out the rest", "Canción:Papercut", "Canción:Castle of glass" });
        // top4
        topBandas.put("Pearl Jam", new String[] { "Canción:EvenFlow", "Canción:Alive", "Canción:Black",
                "Canción:Soldier of Love", "Canción:Animal" });
        // top5
        topBandas.put("TOTO", new String[] { "Canción:Can you hear what im saying", "Canción:Love has the power",
                "Canción:Tale of a man", "Canción:The chains", "Canción:Dont chain my heart" });
        // top6
        topBandas.put("Green Day", new String[] { "Canción:Basket Case", "Canción:American Idiot", "Canción:21 Guns", "Canción:Boulevard of Broken Dreams", "Canción:Holiday" });
        // top7
        topBandas.put("Good Charlotte", new String[] { "Canción:I Just Wanna Live", "Canción:We Believe", "Canción:The River", "Canción:The Chronicles of Life and Death", "Canción:Last December" });
        // top8
        topBandas.put("System of a Down", new String[] { "Canción:Chop Suey", "Canción:Aerials", "Canción:Question", "Canción:Genocidal Humanoidz", "Canción:Deer Dance" });
        // top9
        topBandas.put("Creed", new String[] { "Canción:My Sacrifice", "Canción:One Last Breath", "Canción:Dont's Top Dancing", "Canción:My Own Prison", "Canción:With Arms Wide Open" });
        // top10
        topBandas.put("Thirty Seconds To Mars", new String[] { "Canción:Edge Of The Earth", "Canción:Capricorn (A Brand New Name)", "Canción:Oblivion", "Canción:Echelon", "Canción:The Kill (Bury Me)" });

        // Agregar mas bandas y canciones aca...

    }
}
