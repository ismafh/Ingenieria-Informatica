package p2;

public interface PRGraph {
	// Añade un proceso al grafo.
	 void addProcess(String name);
	 // Añade un recurso al grafo.
	 void addResource(String name);
	 // Solicita un recurso.
	 void open(String process, String resource)
	 throws DeadlockException;
	 // Libera un recurso.
	 void close(String process, String resource);

}
