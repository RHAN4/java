
package com.mycompany.herancamuitacoisa;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("1109200100", Generos.MASCULINO, EstadoCivil.CASADO, "11/09/2001", "Celso", "71988543017", "celsinho11@gmail.com", 
                new Endereco("Avenida 5", "09", "Ao lado das torres.", "45700-899", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico prestacaoServico = new PrestacaoServico("17/02/1999", "05/09/2020", "5646545646466", 
                "5555", "Marcelly LTDA", "71988557722", "raylinha55@gmail.com", 
                new Endereco("Não possui", "00", "Ao lado do matagal", "47802-258", "São Francisco", UnidadeFederativa.BAHIA));
        
        System.out.println(cliente);
        System.out.println(prestacaoServico);
    }
}
