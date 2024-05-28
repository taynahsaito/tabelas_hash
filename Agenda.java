public class Agenda{
    public static final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Pessoa[] tabela;
    public Agenda(){
        tabela = new Pessoa[26];
    }
    public void insere (Pessoa pessoa){
        char primeiraLetra = pessoa.getNome().charAt(0);
        //descobrir a posicao do vetor que estamos inserindo o nome
        int posicao = mapa.indexOf(primeiraLetra);
        tabela[posicao] = pessoa;
    }
    public boolean busca (Pessoa pessoa){
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
        if (pessoa.equals(tabela[posicao])) return true;
        return false;
    }
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < 26; i++){
            s = s + mapa.charAt(i) + "\n";
            if (tabela[i] == null) // se nao tiver ninguem naquela posicao
                s = s + "--------";
            else
                s = s + tabela[i] + "\n";
        }
        return s;
    }
}