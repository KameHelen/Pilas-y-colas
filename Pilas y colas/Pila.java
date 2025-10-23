class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void push(String c) {
        Nodo nuevo = new Nodo(c);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public String pop() {
        if (cima == null) {
            throw new RuntimeException("Pila vacía");
        }
        String valor = cima.dato;
        cima = cima.siguiente;
        return valor;
    }

    public boolean isEmpty() {
        return cima == null;
    }
}