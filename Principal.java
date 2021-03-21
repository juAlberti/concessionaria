import java.util.*;
public class Principal{
    public static void main(String[] args){
        CatalogoVeiculos catalogo = new CatalogoVeiculos();

        Scanner in = new Scanner(System.in);

        //adicionar veiculos no catalogo
        catalogo.veiculos.add(new VeiculoPassageiros("ABC1D23", "Mercedes", "Sprinter", 2019, 250000, 9));
        catalogo.veiculos.add(new VeiculoPassageiros("DFJ3A40", "Chrysler", "Minivan", 2021, 70000, 7));
        catalogo.veiculos.add(new VeiculoPasseio("FGT6B84", "Honda", "Civic", 2021, 110000, 10.5));
        catalogo.veiculos.add(new VeiculoUtilitario("UHK8P42", "Ford", "F-150", 2020, 200000, 1, 1));
        catalogo.veiculos.add(new VeiculoPasseio("GYI6L87", "Toyota", "Corolla", 2021, 125000, 22.5));
        catalogo.veiculos.add(new VeiculoPasseio("SLE6O32", "Honda", "Civic", 2019, 100000, 10.5));

        System.out.println("Digite 'Placa' para consultar por placa.");
        System.out.println("Digite 'Marca' para consultar por marca.");
        System.out.println("Digite 'Ano' para consultar por ano.");
        System.out.println("Digite 'Tipo' para consultar por tipo.");

        String opcao = in.nextLine().toLowerCase();

        switch (opcao) {
            case "placa":
                System.out.println("Digite a placa do veiculo:");
                String placa = in.nextLine();
                Veiculo veiculo = catalogo.consultaPorPlaca(placa);
                System.out.println("Placa: "+veiculo.placa+" || Marca: "+veiculo.marca+" || Modelo: "+veiculo.modelo+
                                    " || Ano: "+veiculo.ano+" || Valor: R$ "+veiculo.valor);
                break;

            case "marca":
                System.out.println("Digite a marca do veiculo:");
                String marca = in.nextLine().toLowerCase();
                ArrayList<Veiculo> veiculosMarca = catalogo.consultaPorMarca(marca);
                if(veiculosMarca.size() == 0){
                    System.out.println("Não existem veículos desta marca no catálogo.");
                }
                else{
                    for(int i = 0; i<veiculosMarca.size(); i++){
                        System.out.println("Placa: "+veiculosMarca.get(i).placa+" || Marca: "+veiculosMarca.get(i).marca+" || Modelo: "+
                                            veiculosMarca.get(i).modelo+" || Ano: "+veiculosMarca.get(i).ano+
                                            " || Valor: R$ "+veiculosMarca.get(i).valor);
                
                    }
                }
                break;

            case "ano":
                System.out.println("Digite o ano do veiculo:");
                int ano = in.nextInt();
                ArrayList<Veiculo> veiculosAno = catalogo.consultaPorAno(ano);
                if(veiculosAno.size() == 0){
                    System.out.println("Não existem veículos deste ano no catálogo.");
                }
                else{
                    for(int i = 0; i<veiculosAno.size(); i++){
                        System.out.println("Placa: "+veiculosAno.get(i).placa+" || Marca: "+veiculosAno.get(i).marca+" || Modelo: "+
                                            veiculosAno.get(i).modelo+" || Ano: "+veiculosAno.get(i).ano+
                                            " || Valor: R$ "+veiculosAno.get(i).valor);
                
                    }
                }
                break;

            case "tipo":
                System.out.println("Digite o tipo do veiculo: 'Passageiro', 'Passeio' ou 'Utilitario'");
                String tipo = in.nextLine().toLowerCase();
                while(!tipo.equals("passageiro") && !tipo.equals("passeio") && !tipo.equals("utilitario")){
                    System.out.println("Digite o tipo do veiculo: 'Passageiro', 'Passeio' ou 'Utilitario'");
                    tipo = in.nextLine().toLowerCase();
                }
                ArrayList<Veiculo> veiculosTipo = catalogo.consultaPorTipo(tipo);
                switch(tipo){
                    case "passageiro":
                        VeiculoPassageiros veiculopass;
                        for(int i = 0; i<veiculosTipo.size(); i++){
                            veiculopass = (VeiculoPassageiros)veiculosTipo.get(i);
                            System.out.println("Placa: "+veiculopass.placa+" || Marca: "+veiculopass.marca+
                                                " || Modelo: "+veiculopass.modelo+" || Tipo: "+veiculopass.ano+
                                                " || Valor: R$ "+veiculopass.valor+" || Passageiros: "+veiculopass.nroPass);
                        }
                        break;

                    case "passeio":
                        VeiculoPasseio veiculopasseio;
                        for(int i = 0; i<veiculosTipo.size(); i++){
                            veiculopasseio = (VeiculoPasseio)veiculosTipo.get(i);
                            System.out.println("Placa: "+veiculopasseio.placa+" || Marca: "+veiculopasseio.marca+
                                                " || Modelo: "+veiculopasseio.modelo+" || Tipo: "+veiculopasseio.ano+
                                                " || Valor: R$ "+veiculopasseio.valor+" || Consumo: "
                                                +veiculopasseio.consumoKmLt+"Km/L");
                        }
                        break;

                    case "utilitario":
                        VeiculoUtilitario veiculoutil;
                        for(int i = 0; i<veiculosTipo.size(); i++){
                            veiculoutil = (VeiculoUtilitario)veiculosTipo.get(i);
                            System.out.println("Placa: "+veiculoutil.placa+" || Marca: "+veiculoutil.marca+
                                                " || Modelo: "+veiculoutil.modelo+" || Tipo: "+veiculoutil.ano+
                                                " || Valor: R$ "+veiculoutil.valor+" || Carga: "+veiculoutil.capCargaTon+
                                                " || Eixos: "+veiculoutil.nroEixos);
                        }
                        break;

                    default:
                        break;
                }
                
        
            default:
                break;
        }
        
        
        
    }
}