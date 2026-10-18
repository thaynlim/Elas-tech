package petshop;
import java.util.*;

public class Petshop1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Pet[] lista = new Pet[5];
        int opcao = -1;
        int total = 0;
        ArrayDeque<String> fila = new ArrayDeque<>();

        while (opcao != 0) {
            System.out.println();
            System.out.println("===Ficha do Pet===");
            System.out.println("1 - Cadastrar Pet ");
            System.out.println("2 - Listar Pets ");
            System.out.println("3 - Buscar Pet ");
            System.out.println("4 - Listar espécie ");
            System.out.println("5 - Fila do banho ");
            System.out.println("6 - Chamar o próximo ");
            System.out.println("7 - Executar serviço ");
            System.out.println("0 - Sair");
            System.out.println(" Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= lista.length) {
                            System.out.println(" Limite de pets atingido!");
                            break;
                        }
                        Pet pet;
                        System.out.println(" Insira o nome do pet: ");
                        String nome = sc.nextLine();

                        System.out.println(" Qual a espécie? ");
                        String especie = sc.nextLine();

                        if (especie.equalsIgnoreCase("Cachorro")){
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            pet = new Gato();
                        }else {
                            pet = new Pet();
                        }
                        pet.nome = nome;
                        pet.especie = especie;

                        System.out.println(" Qual o peso? ");
                        Double peso = sc.nextDouble();
                        sc.nextLine();

                        pet.porte = pet.definirPorte();

                        lista[total] = pet;
                        total++;

                        mostrarFicha(pet);
                        System.out.println("---");
                        mostrarFicha(pet, "===Ficha do Pet===");
                        System.out.println(" Pet cadastrado! Agora são " + total + " pets.");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println(" Nenhum pet cadastrado até o momento!");
                        } else {
                            System.out.println("=====PETS CADASTRADOS=====");
                            for (int i = 0; i < total; i++) {
                                System.out.printf(" Nome: %s - Espécie:  %s - Peso: %.1f Kg - Porte: %s\n",
                                        lista[i].nome,
                                        lista[i].especie,
                                        lista[i].peso,
                                        lista[i].porte);

                                        lista[i].emitirSom();
                            }
                        }
                        break;

                    case 3:
                        System.out.println(" Qual o nome do seu Pet? ");
                        String busca = sc.nextLine();
                        boolean achou = false;
                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.printf(" Encontrado: %s - Espécie: %s  - Peso: %.1f kg - Porte: %s%n", lista[i].nome, lista[i].especie, lista[i].peso, lista[i].porte);
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            System.out.println(" Pet não localizado ");
                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especies.add(lista[i].especie.toLowerCase());
                        }
                        System.out.println("===ESPÉCIES CADASTRADAS===");
                        for (String especie1 : especies){
                        System.out.println(" - " + especie1);
                        }
                        System.out.println(" Total de espécies " + especies.size());
                        break;

                    case 5:
                        System.out.println(" Qual o nome do Pet que irá entrar na fila? ");
                        String nomeFila = sc.nextLine();
                        fila.add(nomeFila);
                        System.out.println(nomeFila + " Entrou na fila ");
                        System.out.println(" Fila agora: " + fila);
                        break;

                    case 6:
                        if(fila.isEmpty()){
                            System.out.println(" A fila do banho está vazia ");
                        }
                        else {
                            String proximo = fila.peek();
                            System.out.println(" Próximo da fila: " + proximo);
                            fila.poll();
                            System.out.println(" Atendendo " + proximo + "...");
                            System.out.println(" Fila Agora " + fila);
                        }
                        break;

                    case 7:
                        System.out.println(" Nome do pet ");
                        String nomeServico = sc.nextLine();
                        ArrayList<Servico> servicos = new ArrayList<>();
                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        System.out.println("\n=== ESCOLHA O SERVIÇO ===");
                        System.out.println(" 1. Banho");
                        System.out.println(" 2. Tosa");
                        System.out.println(" 3. Consulta");
                        System.out.println(" Escolha");
                        int escolhaServico = sc.nextInt();
                        sc.nextLine();

                        if(escolhaServico >= 1 && escolhaServico <= servicos.size()) {
                            System.out.println("\n === SERVIÇO EM ANDAMENTO ===");
                            servicos.get(escolhaServico - 1).executar(nomeServico);
                            System.out.println("=========================");
                        }else {
                            System.out.println(" Serviço inválido!");
                        }
                        break;

                    case 0: {
                        System.out.println(" Até logo!");
                        break;
                    }
                    default: {
                        System.out.println(" Opção inválida.");
                    }
                }
            } catch
            (InputMismatchException e) {
                System.out.println(" Digite apenas números!");
                sc.nextLine();
            }
        }
    }
    static void mostrarFicha (Pet pet){
        System.out.println(" Nome: " + pet.nome);
    }
    static void mostrarFicha (Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println(" Nome: " + pet.nome);
        System.out.println(" Espécie: " + pet.especie);
        System.out.printf(" Peso: %.1f kg%n", pet.peso);
        System.out.println(" Porte: " + pet.porte);
    }
    }









