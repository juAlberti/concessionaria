public class VeiculoUtilitario extends Veiculo{
    int capCargaTon;
    int nroEixos;

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon, int nroEixos){
        super(placa, marca, modelo, ano, valor);
        this.capCargaTon = capCargaTon;
        this.nroEixos = nroEixos;
    }
}
