package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 
 * Clase Main donde se ejecuta el grafo
 * @author Ismael Fernandez Herreruela
 *
 */
public class Main {

	public static void main(String[] args) throws IOException, DeadlockException {

		//Creacion del grafo
		PRGraphImpl graph = new PRGraphImpl();
		int row = 0;
		
		if(args.length != 1) {
			System.out.println("Hola");
			System.exit(0);
		}
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String s =  br.readLine();
		
		while(s != null){
			
			row++;
				
			int iComment = s.indexOf('#');

			if (iComment != -1) {
				s = s.substring(0, iComment);
			}

			StringTokenizer st = new StringTokenizer(s);

			String t = st.nextToken();

			//switch para los diferentes tokens y llamar a la clase que se encarga de dicho proceso
			
			switch (t) {

			case "PROCESS":
				System.out.println("Crear un proceso");
				graph.addProcess(st.nextToken());
				break;
			case "RESOURCE":
				System.out.println("Crear un recurso");
				graph.addResource(st.nextToken());
				break;
			case "CLOSE":
				System.out.print("Liberar un recurso");
				graph.close(st.nextToken(), st.nextToken());
				break;
			case "OPEN":
				System.out.println("Solicitar un recurso");
				graph.open(st.nextToken(), st.nextToken());
				break;
			default:
				throw new IOException("Formato erroneo");
			}
		}

		System.out.println(graph);
	}
}

