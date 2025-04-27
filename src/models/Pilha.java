package models;

public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(Elemento elemento) {
        Node novo = new Node(elemento);
        novo.proximo = topo;
        topo = novo;
    }

    public Elemento pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha vazia");
        }
        Elemento elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void mostrarHistorico() {
        if (isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }
        Node atual = topo;
        while (atual != null) {
            System.out.println("ID: " + atual.elemento.id);
            System.out.println("Descrição: " + atual.elemento.descricao);
            System.out.println("Data e Hora: " + atual.elemento.dataHora);
            System.out.println("---------------------------");
            atual = atual.proximo;
        }
    }
}
