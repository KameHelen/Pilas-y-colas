class Cola {
    private Nodo frente;
    private Nodo finalCola;

    public Cola() {
        this.frente = null;
        this.finalCola = null;
    }

    public void enqueue(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (finalCola != null) {
            finalCola.siguiente = nuevo;
        }
        finalCola = nuevo;
        if (frente == null) {
            frente = finalCola;
        }
    }

    public String dequeue() {
        if (frente == null) {
            throw new RuntimeException("Cola vacía");
        }
        String valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;
        }
        return valor;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void mostrar() {
        Nodo actual = frente;
        System.out.print("Cola: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}