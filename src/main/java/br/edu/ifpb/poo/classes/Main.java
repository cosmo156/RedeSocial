package br.edu.ifpb.poo.classes;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Classe principal para testar a rede social textual simples em Java
public class Main {

    public static void main(String[] args){

        Scanner scan =  new Scanner(System.in);
        Gerenciador adm = new Gerenciador();

        int opcao;

        do {
            System.out.println("1: Criar usuário");
            System.out.println("2: Logar usuário");
            System.out.println("3: sair");
            System.out.print("Digite a opção: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    try {
                        System.out.println("Digite o nome do Usuário: ");
                        String nome = scan.next();
                        System.out.println("Digite a Senha do Usuário: ");
                        String senha = scan.next();
                        System.out.println("Carregando...");
                        TimeUnit.SECONDS.sleep(1);
                        adm.cadastrarUsuario(nome, senha);
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                case 2:
                    try {
                        if (adm.getUsuarios().isEmpty()) {
                            System.out.println("Nenhum usuário cadastrado! ");
                            break;
                        }
                        System.out.println("Digite o nome do Usuário: ");
                        String nome2 = scan.next();
                        System.out.println("Digite a Senha do Usuário: ");
                        String senha2 = scan.next();
                        System.out.println("Carregando...");
                        TimeUnit.SECONDS.sleep(1);
                        Usuario usuario = adm.logarUsuario(nome2, senha2);
                        if (usuario != null){
                            TimeUnit.SECONDS.sleep(1);
                            int opUser;
                            do {
                                System.out.println("1: Fazer postagem");
                                System.out.println("2: Interagir com outros usuários");
                                System.out.println("3: Interagir com suas postagens");
                                System.out.println("4: Vê estatísticas das suas postagens");
                                System.out.println("5: sair");
                                System.out.print("Digite a opção: ");
                                opUser = scan.nextInt();
                                switch (opUser){
                                    case 1:
                                        System.out.println("Digite o conteúdo da postagem: ");
                                        String conteudo = scan.next();
                                        usuario.fazerPostagem(conteudo);
                                        System.out.println("Carregando...");
                                        TimeUnit.SECONDS.sleep(1);
                                        System.out.println("Postagem criada com sucesso!");
                                        TimeUnit.SECONDS.sleep(1);
                                        break;
                                    case 2:
                                        if (adm.getUsuarios().size() == 1){
                                            System.out.println("Apenas você está cadastrado no sistema!");
                                            TimeUnit.SECONDS.sleep(1);
                                            break;
                                        }
                                        for (Usuario user: adm.getUsuarios()){
                                            System.out.println("Usuário: " + user.getNome());
                                        }
                                        System.out.println("Digite o nome do usuário que deseja vê as postagens: ");
                                        String nomeUser = scan.next();
                                        Usuario user = adm.getUsuario(nomeUser);
                                        if (user.getPostagens().isEmpty()){
                                            System.out.println("O usuário selecionado não tem nenhuma postagem criada!");
                                            TimeUnit.SECONDS.sleep(1);
                                            break;
                                        }
                                        for (Postagem postagem: user.getPostagens()){
                                            System.out.println("índice: " + user.getPostagens().indexOf(postagem) + ", " + postagem);
                                        }
                                        System.out.println("Digite o índice da postagem que deseja interagir: ");
                                        int indice3 = scan.nextInt();
                                        System.out.println("Carregando...");
                                        TimeUnit.SECONDS.sleep(1);
                                        int inp = 0;
                                        do {
                                            System.out.println("1: Curtir postagem");
                                            System.out.println("2: Descurtir postagem");
                                            System.out.println("3: fazer comentário");
                                            System.out.println("4: sair");
                                            System.out.println("Digite a opção: ");
                                            inp = scan.nextInt();
                                            System.out.println("Caregando...");
                                            TimeUnit.SECONDS.sleep(1);
                                            switch (inp){
                                                case 1:
                                                    user.getPostagens().get(indice3).curtir();
                                                    System.out.println("Caregando...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("A postagem foi curtida com sucesso!");
                                                    break;
                                                case 2:
                                                    user.getPostagens().get(indice3).removerCurtida();
                                                    System.out.println("Caregando...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("A curtida da postagem foi removida com sucesso!");
                                                    break;
                                                case 3:
                                                    System.out.println("Digite o conteudo do comentário: ");
                                                    String comentario = scan.next();
                                                    user.getPostagens().get(indice3).adicionarComentario(comentario);
                                                    System.out.println("Comentario adicionado com sucesso!");
                                                    break;
                                                case 4:
                                                    System.out.println("saindo...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    break;
                                                default:
                                                    System.out.println("Opção Inválida!");
                                            }
                                        }while (inp != 4);
                                        break;
                                    case 3:
                                        System.out.println("Suas Postagens: ");
                                        for (Postagem postagem: usuario.getPostagens()){
                                            System.out.println("============================");
                                            System.out.println("Postagem índice : " + usuario.getPostagens().indexOf(postagem));
                                            System.out.println("Conteudo: " + postagem.getTexto());
                                            System.out.println("============================");
                                        }
                                        TimeUnit.SECONDS.sleep(1);
                                        System.out.println("Digite o índice da postagem que deseja interagir: ");
                                        int indic = scan.nextInt();
                                        System.out.println("Carregando...");
                                        TimeUnit.SECONDS.sleep(1);
                                        int inp3 = 0;
                                        do {
                                            System.out.println("Qual interação você deseja fazer?");
                                            System.out.println("1: Curtir postagem");
                                            System.out.println("2: Descurtir postagem");
                                            System.out.println("3: fazer comentário");
                                            System.out.println("4: sair");
                                            System.out.println("Digite a opção: ");
                                            inp3 = scan.nextInt();
                                            System.out.println("Caregando...");
                                            TimeUnit.SECONDS.sleep(1);
                                            switch (inp3){
                                                case 1:
                                                    usuario.getPostagens().get(indic).curtir();
                                                    System.out.println("Caregando...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("Postagem curtida com sucesso!");
                                                    break;
                                                case 2:
                                                    usuario.getPostagens().get(indic).removerCurtida();
                                                    System.out.println("Caregando...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("A curtida foi removida com sucesso!");
                                                    break;
                                                case 3:
                                                    System.out.println("Digite o conteudo do comentário: ");
                                                    String comentario2 = scan.next();
                                                    usuario.getPostagens().get(indic).adicionarComentario(comentario2);
                                                    System.out.println("Comentario adicinado com sucesso!");
                                                    break;
                                                case 4:
                                                    System.out.println("saindo...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    break;
                                            }
                                        }while (inp3 != 4);
                                        break;
                                    case 4:
                                        for (Postagem postagem: usuario.getPostagens()){
                                            System.out.println("============================");
                                            System.out.println("Texto: " + postagem.getTexto());
                                            System.out.println("Curtidas: " + postagem.getCurtidas());
                                            for (Comentario comentario: postagem.getComentarios()){
                                                System.out.println("Comentarios:");
                                                System.out.println("autor: " + comentario.getAutor());
                                                System.out.println("comentario: " + comentario.getTexto());
                                            }
                                            System.out.println("============================");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Saindo...");
                                        TimeUnit.SECONDS.sleep(1);
                                        break;
                                    default:
                                        System.out.println("Opção Inválida!");
                                }
                            }while (opUser != 5);
                        }
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                case 3:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (opcao != 3);
    }
}
