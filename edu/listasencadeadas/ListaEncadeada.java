package edu.listasencadeadas;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true) {
            if(referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    
                }
            }else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

}
