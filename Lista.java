public class Lista {
    private No primeiro;
    //construtor padrão
    
    public boolean estaVazia() {
        return primeiro==null;
    }
    public void insere(Pessoa i) {
        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazia()) {
            s += "";
        }
        else {
            No aux = primeiro;
            while (aux != null) {//varre a lista até o final
                s = s + aux;
                aux = aux.getProximo();
            }
            s = s + "\\\\";
        }
        return s;
    }
    public Pessoa remove() {
        Pessoa temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }
}
