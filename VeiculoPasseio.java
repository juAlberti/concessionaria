public class VeiculoPasseio extends Veiculo{
    double consumoKmLt;

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor, double consumoKmLt){
        super(placa, marca, modelo, ano, valor);
        this.consumoKmLt = consumoKmLt;
    }
}
