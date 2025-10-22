package edu.igor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class App {

    public static void main(String[] args) {
         List<Pessoa> lista = Arrays.asList(
                new Pessoa(1, "Huguinho", Departamento.FINANCEIRO, 40),
                new Pessoa(4, "Zezinho", Departamento.FINANCEIRO, 32),
                new Pessoa(3, "Luizinho", Departamento.VENDAS, 57),
                new  Pessoa(9, "Patinhas",   Departamento.VENDAS, 40),
                new Pessoa(10, "Donald", Departamento.GERENCIA, 54),
                new Pessoa(2, "Margarida", Departamento.FINANCEIRO, 40),
                new Pessoa(8, "Joe Doe", Departamento.VENDAS, 34),
                new Pessoa(5, "Jane Doe", Departamento.VENDAS, 22),
                new Pessoa(6, "Sr Smith", Departamento.VENDAS, 40),
                new Pessoa(7, "Sra Smith", Departamento.GERENCIA, 39),
                 new Pessoa(11, "Trinity", Departamento.VENDAS, 34),
                 new Pessoa(14, "Morpheus", Departamento.FINANCEIRO, 22),
                 new Pessoa(16, "AgenteSmith", Departamento.VENDAS, 47),
                 new Pessoa(13, "Neo", Departamento.GERENCIA, 29)
        );

        /***
         * Exercício
         *      - escreva as consultas solicitadas utilizando
         *        apenas expressões lambda e operações de agregação
          */
        System.out.println("\n1. Funcionários do setor de vendas:");
        List<Pessoa> nova1 = lista.stream() 
                .filter( p -> p.getDpto() == Departamento.VENDAS)
                .toList();

        nova1.forEach(System.out::println);

        System.out.println("\n2. Funcionários do setor de vendas com idade entre 20 e 30 anos");
        List<Pessoa> nova2 = lista.stream() 
                .filter(p -> p.getIdade() <= 30 && p.getIdade() >=20)
                .toList();

        nova2.forEach(System.out::println);

        System.out.println("\n3. Nomes (em maiúsculas) dos funcionários do setor de vendas");
        List<Pessoa> nova3 = lista.stream()
                                  .filter(p -> p.getDpto() == Departamento.VENDAS)
                                  .map( (Pessoa x) -> { x.setNome( x.getNome().toUpperCase() );
                                                        return x; })
                                  .toList();

        nova3.forEach(System.out::println);
      //  lista.forEach(System.out::println);

        System.out.println("\n4. Todos os gerentes:");
        List<Pessoa> nova4 = lista.stream()
                .filter(p -> p.getDpto() == Departamento.GERENCIA)
                .toList();

        nova4.forEach(System.out::println);

        System.out.println("\n5. Idade média dos gerentes:");
        OptionalDouble nova5 = lista.stream()
                                    .filter(p -> p.getDpto() == Departamento.X)
                                    .mapToInt(x -> x.getIdade())
                                    .average();
        
        System.out.println(nova5);

        System.out.println("\n6. Funcionarios ordenados pelo código:");
        List<Pessoa> nova6 = lista.stream()
                                  .sorted(Comparator.comparing(Pessoa:: getCodigo))
                                  .toList();
        
        System.out.println(nova6);

        System.out.println("\n7. Funcionários ordenados pela idade+nome:");
        List<Pessoa> nova7 = lista.stream()
                                  .sorted(Comparator.comparing(Pessoa:: getIdade)
                                  .thenComparing( Pessoa::getNome)
                                  )
                                  .toList();
        
        System.out.println(nova7);

        System.out.println("\n8. Criar uma nova lista apenas com os funcionarios do financeiro:");
        List<Pessoa> nova8 = lista.stream()
                                  .filter(p -> p.getDpto() == Departamento.FINANCEIRO)
                                  .toList();
        
        System.out.println(nova8);

        System.out.println("\n9. Nome e setor da pessoa mais jovem:");
        Pessoa nova9 = lista.stream()
                            .map(Pessoa x -> {x.getIdade()})
                            .min()
                            .getAsInt()
                            ;
        
        System.out.println(Pessoa);


    }
}
