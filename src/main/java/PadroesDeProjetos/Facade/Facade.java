package PadroesDeProjetos.Facade;

import PadroesDeProjetos.Facade.subsistema1.crm.CrmService;
import PadroesDeProjetos.Facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
