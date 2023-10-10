public class CaixaFragil extends Caixa{

    //atributos
    private double pesoMax;

    //construtor
    public CaixaFragil(String identificador, String conteudo, double peso, double altura, double pesoMax){
        super(identificador, conteudo, peso, altura);
        this.pesoMax = pesoMax;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        if (pesoMax > 0) {
            this.pesoMax = pesoMax;
        } else {
            System.out.println("O peso deve ser maior que zero.");
        }
    }

    public String exibir(){
        String exibir = super.exibir();
         return("Peso maximo suportrado em kg: " + this.pesoMax + "\n");
    }

}