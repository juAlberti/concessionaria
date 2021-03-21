public class VeiculoPassageiros extends Veiculo {
    int nroPass;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPass){
        super(placa, marca, modelo, ano, valor);
        this.nroPass = nroPass;
    }
}
