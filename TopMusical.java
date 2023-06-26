import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TopMusical {

	// Mapa de bandas y sus canciones populares
	private static Map<String, String[]> topBandas = new LinkedHashMap<>();

	public static void main(String[] args) {
		// Agregamos los tops de música predefinidos
		agregarTopsPredefinidos();

		// Solicitamos al usuario el top que quiere ver y a su vez con un loop para preguntarle si quiere ver otro top
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			int top;

			do {
				System.out.print("\nBienvenido a este Top 10 de las mejores bandas de Rock internacional\n");
				System.out.print("Las bandas del top son:\n");
				System.out.print("\nTop 1:Theory of Deadman\nTop 2:Foo Fighters\nTop 3:Linking Park\nTop 4:Pearl Jam\nTop 5:TOTO\nTop 6:Green Day\nTop 7:Good Charlotte\nTop 8:System of a Down\nTop 9:Creed\nTop 10:Thirty Seconds To Mars\n\n");
				System.out.print("Ingresa el top que quieres ver (1-10): ");
				top = scanner.nextInt();

				// Aca se verifica que el numero ingresado sea correcto (1-10)
				if (top < 1 || top > 10) {
					System.out.println("\n¡El número del top no es válido!");
					System.out.println("Ingrese nuevamente.");
				}
			} while (top < 1 || top > 10);

			// Obtenemos la lista de bandas y canciones del top
			String[] bandas = topBandas.keySet().toArray(new String[0]);
			String banda = bandas[top - 1];
			String[] canciones = topBandas.get(banda);

			// Mostrara las canciones del top luego que el usuario ingrese el numero correspondiente
			System.out.println("\nTop " + top + " Banda: " + banda + "\n" );
			for (int i = 0; i < canciones.length; i++) {
				System.out.println((i + 1) + "º" + canciones[i]);
			}
			

			while (true){
			// Aca le preguntamos al usuario si quiere ingresar otro top
			System.out.print("\n¿Deseas ingresar otro top? (s/n): ");
			String opcion = scanner.next();
			continuar = opcion.equalsIgnoreCase("s");// Lo usamos para ignorar la diferencia ente mayuscula y minuscula al ingresar (s/n)
			if (opcion.charAt (0) == 's' || opcion.charAt (0) == 'n' )
			{break;
			}else {
				System.out.print("Opccion no valida");
			}
		}
	}


		scanner.close();

		// Mensaje final de despedida
		System.out.println("\n!Gracias por su tiempo, esperamos le sea de ayuda esta informacion!");
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
		topBandas.put("TOTO",
				new String[] { "Canción:Can you hear what im saying", "Canción:Love has the power",
						"Canción:Tale of a man", "Canción:The chains","Canción:Dont chain my heart" });
		// top6
		topBandas.put("Green Day", new String[] { "Canción:Basket Case", "Canción:American Idiot", "Canción:21 Guns",
						"Canción:Boulevard of Broken Dreams", "Canción:Holiday" });
		// top7
		topBandas.put("Good Charlotte", new String[] { "Canción:I Just Wanna Live", "Canción:We Believe",
				"Canción:The River", "Canción:The Chronicles of Life and Death", "Canción:Last December" });
		// top8
		topBandas.put("System of a Down",
				new String[] { "Canción:Chop Suey", "Canción:Aerials", "Canción:Question",
						"Canción:Genocidal Humanoidz", "Canción:Deer Dance" });
		// top9
		topBandas.put("Creed", new String[] { "Canción:My Sacrifice", "Canción:One Last Breath",
				"Canción:Dont's Top Dancing", "Canción:My Own Prison", "Canción:With Arms Wide Open" });
		// top10
		topBandas.put("Thirty Seconds To Mars",
				new String[] { "Canción:Edge Of The Earth", "Canción:Capricorn (A Brand New Name)", "Canción:Oblivion",
						"Canción:Echelon", "Canción:The Kill (Bury Me)" });

		// Agregar mas bandas y canciones aca...
		//topBandas.put("Nombre de la banda", new String[] { "Canción:Nombre de la cancion", "Canción:", "Canción:", "Canción:", "Canción:" });
		/* AGREGAR MAS INTERACCIONES CON EL USUARIO */
		/**
		 * @author Cifuentes Ignacio Hernan
		 * @author Abreau Lorenzo
		 * @author Elizagoyen Juan Manuel
		 * @author Nieto Matias
		 * @author Genovesy Airton
		 * @version 1.3
		 */
	}
}
