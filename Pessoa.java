public class Pessoa {
    private String nome;
    private int anoNascimento;
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    @Override
    public String toString() {
        return "[nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
    }
    
    @Override
    public boolean equals(Object object){
        if (this == object) return true; // se o parametro que estamos passando e a referenciacao for igual
        if (object instanceof Pessoa){ //se o objetivo for uma instancia do tipo pessoa...
            Pessoa pessoa = (Pessoa) object; //casting(conversão) = pega o objeto e diz que é do tipo pessoa 
            if(this.nome == pessoa.nome) return true;
        }
        return false;
    }
    
}