public class TesteAgendaComLista {
    public static void main(String[] args) {
        AgendaComLista agenda = new AgendaComLista();
        Pessoa p1 = new Pessoa("Ana", 2000);
        agenda.insere(p1);
        System.out.println(agenda);
        Pessoa p2 = new Pessoa("Bia", 2005);
        agenda.insere(p2);
        // if (agenda.busca(p1)) {
        //     System.out.println(p1 + " esta na agenda");
        // }
        // else {
        //     System.out.println(p1 + " nao esta na agenda");
        // }
        // if (agenda.busca(p2)) {
        //     System.out.println(p2 + " esta na agenda");
        // }
        // else {
        //     System.out.println(p2 + " nao esta na agenda");
        // }
        Pessoa p3 = new Pessoa("Antonio", 2004);
        agenda.insere(p3);
        System.out.println(agenda);
    }
}

