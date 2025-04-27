package models;

public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    public void enfileirar(Elemento elemento) {
        Node novo = new Node(elemento);
        if (isEmpty()) {
            frente = novo;
            tras = novo;
        } else {
            tras.proximo = novo;
            tras = novo;
        }
    }

    public Elemento desenfileirar() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia");
        }
        Elemento elemento = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return elemento;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }
        Node atual = frente;
        while (atual != null) {
            System.out.println("Nome: " + atual.elemento.nomeCliente);
            System.out.println("ID: " + atual.elemento.id);
            System.out.println("Motivo: " + atual.elemento.motivo);
            System.out.println("---------------------------");
            atual = atual.proximo;
        }
    }
}