public class Main {
    public static void main(String[] args) {
        PilhaDeCaixas pilha = new PilhaDeCaixas(50.00);

        Caixa caixa1 = new Caixa(669, "pera", 99, 98);
        Caixa caixa2 = new Caixa(741, "morango", 50, 20);
        
        System.out.println(caixa1.exibir());
        System.out.println(caixa2.exibir());
       
        pilha.empilhar(caixa1);
        pilha.empilhar(caixa2);
        
        System.out.println("");

        pilha.exibirDados();

        Caixa caixaDesempilhada = pilha.desempilhar();
        System.out.println("Caixa desempilhada");
        System.out.println("Altura: " + caixaDesempilhada.getAltura());
        System.out.println("Peso:" + caixaDesempilhada.getPeso());

        double alturaAtual = pilha.getAlturaAtual();
        double pesoAtual = pilha.getPesoAtual();
        System.out.println("Altura atual: " + alturaAtual + " Cm");
        System.out.println("Peso atual: " + pesoAtual + " Kg");

    }
}
