package p2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Clase donde se ejecuta el codigo de la practica
 * @author Ismael Fernandez Herreruela
 *
 */
public class PRGraphImpl implements PRGraph {
	@Override
	public String toString() {
		return "PRGraphImpl [graph=" + graph + "]";
	}


	private Map<String,Node> graph = new HashMap<>();
	
	/**
	 * 
	 * Creacion de clase nodo
	 * @author Pablo Ferri Molina
	 *
	 */
	private static class Node{
		protected String name;
		protected HashSet<Node> ady = new HashSet<>();
	
		protected Node(String name) {
			this.name = name;
		}
	}
	

	/**
	 * 
	 * En esta clase creamos los procesos
	 * @author Ismael Fernandez Herreruela
	 *
	 */
	private static class Process extends Node{
		protected Process(String name) {
			super(name);
		}
	}
	/**
	 * 
	 * En esta clase creamos los recursos
	 * @author Ismael Fernandez Herreruela
	 *
	 */
	private static class Resource extends Node{
		protected Set<Process> queue = new LinkedHashSet<>();
		
		protected Resource(String name) {
			super(name);
		}
	}

	/**
	 * 
	 * Clase para abrir ficheros y recursos
	 * @author Ismael Fernandez Herreruela
	 *
	 */
	@Override
	public void open(String process, String resource) throws DeadlockException {
		
	}
	
	/**
	 * 
	 * Clase donde añadimos un recurso
	 * @author Ismael Fernandez Herreruela
	 *
	 */
	@Override
	public void addResource(String name) {
		if(graph.containsKey(name))
			throw new IllegalArgumentException("Ya existe el nodo "+ name);
		
		graph.put(name, new Resource(name));
	}

	/**
	 * 
	 * En esta clase añadimos un proceso
	 * @author Ismael Fernandez Herreruela
	 *
	 */
	@Override
	public void addProcess(String name) {
		if(graph.containsKey(name))
			throw new IllegalArgumentException("Ya existe el nodo "+ name);
		
		graph.put(name, new Process(name));
	}

	/**
	 * 
	 * Clase para cerrar ficheros y recursos
	 * @author Ismael Fernandez Herreruela
	 *
	 */
	@Override
	public void close(String process, String resource) {
		// TODO Auto-generated method stub
		
	}
}