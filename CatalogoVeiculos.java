

import java.util.*;
import java.lang.*;

public class CatalogoVeiculos {

    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Veiculo consultaPorPlaca(String placa){
        Veiculo veiculo = new Veiculo("","","",0,0);
        
        for(int i = 0; i<veiculos.size(); i++){
            if(veiculos.get(i).placa.toUpperCase().equals(placa)){
                veiculo = veiculos.get(i);
                break;
            }
        }
        
        return veiculo;
    }

    public ArrayList<Veiculo> consultaPorMarca(String marca){
        ArrayList<Veiculo> aux = new ArrayList<Veiculo>();
        for(int i = 0; i<veiculos.size(); i++){
            if(veiculos.get(i).marca.toLowerCase().equals(marca)){
                aux.add(veiculos.get(i));
            }
        }
        return aux;
    }

    public ArrayList<Veiculo> consultaPorAno(int ano){
        ArrayList<Veiculo> aux = new ArrayList<Veiculo>();
        for(int i = 0; i<veiculos.size(); i++){
            if(veiculos.get(i).ano == ano){
                aux.add(veiculos.get(i));
            }
        }
        return aux;
    }

    public ArrayList<Veiculo> consultaPorTipo(String tipo){
        ArrayList<Veiculo> aux = new ArrayList<Veiculo>();
        if(tipo.toLowerCase().equals("passageiro")){
            for(int i = 0; i<veiculos.size(); i++){
                if(veiculos.get(i) instanceof VeiculoPassageiros){
                    aux.add(veiculos.get(i));
                }
            }
        }
        else if(tipo.toLowerCase().equals("passeio")){
            for(int i = 0; i<veiculos.size(); i++){
                if(veiculos.get(i) instanceof VeiculoPasseio){
                    aux.add(veiculos.get(i));
                }
            }
        }
        else{
            for(int i = 0; i<veiculos.size(); i++){
                if(veiculos.get(i) instanceof VeiculoUtilitario){
                    aux.add(veiculos.get(i));
                }
            }
        }
        return aux;
        
    }
}
