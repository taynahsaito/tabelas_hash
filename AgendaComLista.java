public class AgendaComLista {
    public static final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    Lista[] tabela;
    public AgendaComLista() {
        tabela = new Lista[26];
        for(int i=0; i <26; i++){
            tabela[i] = new Lista();
        }
    }
    public void insere (Pessoa pessoa) {
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
        tabela[posicao].insere(pessoa);
    }
    // public boolean busca (Pessoa pessoa) {
    //     char primeiraLetra = pessoa.getNome().charAt(0);
    //     int posicao = mapa.indexOf(primeiraLetra);
    //     if (pessoa.equals(tabela[posicao])) return true;
    //     return false;
    // }
    @Override 
    public String toString () {
        String s = "";
        for (int i=0; i<26; i++) {
            s = s + mapa.charAt(i) + "\n";
            if (tabela[i].estaVazia())
                s = s + "----" + "\n";
            else 
                s = s + tabela[i] + "\n";
        }
        return s;
    }
}
