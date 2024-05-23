/*
    1 - Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
    Em seguida, imprima a lista ordenada.
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // 1 - Lista de inteiro e ordernar usando collections.sort
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(7);
        numeros.add(1);
        Collections.sort(numeros);
        System.out.println("Valores ordenado: ");
        System.out.println(numeros);
        System.out.println();

        // 2 e 3 - Criar um objeto da classe titulo, adicionar itens e usar o collections.sort
        Titulo chuck = new Titulo("Chuck");
        Titulo doisHomensEmeio = new Titulo("Dois Homens e meio");
        Titulo friends = new Titulo("Friends");
        Titulo bigBangATeoria = new Titulo("Big Bang a Teoria");
        Titulo todoMundoOdeiaChris = new Titulo("Todo Mundo Odeia o Chris");

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(chuck);
        listaDeTitulos.add(doisHomensEmeio);
        listaDeTitulos.add(friends);
        listaDeTitulos.add(bigBangATeoria);
        listaDeTitulos.add(todoMundoOdeiaChris);
        System.out.println("Lista de titulos antes da ordenação: ");
        System.out.println(listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println("Lista de titulos depois da ordenação: ");
        System.out.println(listaDeTitulos);
        System.out.println();

        // 4 - Crie um lista utilizando a interface List e intancie-a tanto como arrayList quanto como LinkedList
        // A implementação, ordenação e impressão intanciando como arraylist já foi feito acima no (2 e 3)

        // Instanciando  a lista como LinkedList
        List<Titulo> listaLinked = new LinkedList<>();
        listaLinked.add(todoMundoOdeiaChris);
        listaLinked.add(doisHomensEmeio);
        listaLinked.add(friends);
        listaLinked.add(chuck);
        listaLinked.add(bigBangATeoria);
        System.out.println("Lista de titulos usando LinkedList: ");
        System.out.println(listaLinked);
        System.out.println();

        // Ordenando lista
        Collections.sort(listaLinked);
        System.out.println("Lista de titulos ordenada usando LinkedList: ");
        System.out.println(listaLinked);









    }
}
