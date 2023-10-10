public class Caixa{

    //atributos
    private String identificador;
    private String conteudo;
    private double peso;
    private double altura;

    //construtor
    public Caixa(String identificador, String conteudo, double peso, double altura){
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    //get e set
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("O peso deve ser maior que zero.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura deve ser maior que zero.");
        }
    }

    //metodo
    public String exibir(){
        return("Identificador: " +  this.identificador + "\n" + 
        "Conteúdo: " + this.conteudo + "\n" + 
        "Peso em kg: " + this.peso + "\n" + 
        "Altura em Cm:" + this.altura + "\n");
    }

}