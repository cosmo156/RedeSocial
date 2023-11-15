package br.edu.ifpb.poo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Classe principal para testar a rede social textual simples em Java
public class Main {

    public static void main(String[] args){

        Scanner scan =  new Scanner(System.in);
        Gerenciador adm = new Gerenciador();

        int opcao;

        do {
            System.out.println("============================");
            System.out.println("1: Criar usuário");
            System.out.println("2: Logar usuário");
            System.out.println("3: sair");
            System.out.print("Digite a opção: ");
            opcao = scan.nextInt();
            System.out.println("============================");
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
                            TimeUnit.SECONDS.sleep(1);
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
                                System.out.println("============================");
                                System.out.println("1: Fazer postagem");
                                System.out.println("2: Interagir com outros usuários");
                                System.out.println("3: Interagir com minhas postagens");
                                System.out.println("4: Vê estatísticas das minhas postagens");
                                System.out.println("5: sair");
                                System.out.print("Digite a opção: ");
                                opUser = scan.nextInt();
                                System.out.println("============================");
                                switch (opUser){
                                    case 1:
                                        System.out.println("Digite o conteúdo da postagem: ");
                                        String conteudo = scan.next();
                                        usuario.fazerPostagem(conteudo.replaceAll("_", " "));
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
                                            if (user.getNome().equals(usuario.getNome()) && user.getSenha().equals(usuario.getSenha())){
                                                continue;
                                            }
                                            System.out.println("Usuário: " + user.getNome());
                                        }
                                        System.out.println("Digite o nome do usuário que deseja vê as postagens: ");
                                        String nomeUser = scan.next();
                                        if (adm.getUsuarios() == null){
                                            System.out.println("Usuário não encontrado");
                                            break;
                                        }
                                        Usuario user = adm.getUsuario(nomeUser);
                                        if (user.getPostagens().isEmpty()){
                                            System.out.println("O usuário selecionado não tem nenhuma postagem criada!");
                                            TimeUnit.SECONDS.sleep(1);
                                            break;
                                        }
                                        for (Postagem postagem: user.getPostagens()){
                                            System.out.println("============================");
                                            System.out.println("índice: " + user.getPostagens().indexOf(postagem));
                                            System.out.println("conteúdo: " + postagem.getTexto());
                                            System.out.println("============================");
                                        }
                                        System.out.println("Digite o índice da postagem que deseja interagir: ");
                                        int indice3 = scan.nextInt();
                                        System.out.println("Carregando...");
                                        TimeUnit.SECONDS.sleep(1);
                                        int inp = 0;
                                        do {
                                            System.out.println("============================");
                                            System.out.println("1: Curtir postagem");
                                            System.out.println("2: Descurtir postagem");
                                            System.out.println("3: fazer comentário");
                                            System.out.println("4: sair");
                                            System.out.println("Digite a opção: ");
                                            inp = scan.nextInt();
                                            System.out.println("============================");
                                            System.out.println("Caregando...");
                                            TimeUnit.SECONDS.sleep(1);
                                            switch (inp){
                                                case 1:
                                                    user.getPostagens().get(indice3).curtir();
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("A postagem foi curtida com sucesso!");
                                                    break;
                                                case 2:
                                                    user.getPostagens().get(indice3).removerCurtida();
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("A curtida da postagem foi removida com sucesso!");
                                                    break;
                                                case 3:
                                                    System.out.println("Digite o conteúdo do comentário: ");
                                                    String comentario = scan.next();
                                                    user.getPostagens().get(indice3).adicionarComentario(comentario.replaceAll("_", " "));
                                                    System.out.println("Comentário adicionado com sucesso!");
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
                                        if (usuario.getPostagens().isEmpty()){
                                            System.out.println("O usuário não tem nehuma postagem cadastrada!");
                                            break;
                                        }
                                        for (Postagem postagem: usuario.getPostagens()){
                                            System.out.println("============================");
                                            System.out.println("Postagem índice : " + usuario.getPostagens().indexOf(postagem));
                                            System.out.println("Conteúdo: " + postagem.getTexto());
                                            System.out.println("============================");
                                        }
                                        TimeUnit.SECONDS.sleep(1);
                                        System.out.println("Digite o índice da postagem que deseja interagir: ");
                                        int indic = scan.nextInt();
                                        System.out.println("Carregando...");
                                        TimeUnit.SECONDS.sleep(1);
                                        int inp3 = 0;
                                        do {
                                            System.out.println("============================");
                                            System.out.println("Qual interação você deseja fazer?");
                                            System.out.println("1: Curtir postagem");
                                            System.out.println("2: Descurtir postagem");
                                            System.out.println("3: fazer comentário");
                                            System.out.println("4: sair");
                                            System.out.println("Digite a opção: ");
                                            inp3 = scan.nextInt();
                                            System.out.println("============================");
                                            TimeUnit.SECONDS.sleep(1);
                                            switch (inp3){
                                                case 1:
                                                    usuario.getPostagens().get(indic).curtir();
                                                    System.out.println("Caregando...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("Postagem curtida com sucesso!");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    break;
                                                case 2:
                                                    usuario.getPostagens().get(indic).removerCurtida();
                                                    System.out.println("Caregando...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    System.out.println("A curtida foi removida com sucesso!");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    break;
                                                case 3:
                                                    System.out.println("Digite o conteudo do comentário: ");
                                                    String comentario2 = scan.next();
                                                    usuario.getPostagens().get(indic).adicionarComentario(comentario2.replaceAll("_", " "));
                                                    System.out.println("Comentário adicinado com sucesso!");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    break;
                                                case 4:
                                                    System.out.println("saindo...");
                                                    TimeUnit.SECONDS.sleep(1);
                                                    break;
                                            }
                                        }while (inp3 != 4);
                                        break;
                                    case 4:
                                        System.out.println("Minhas Postagens: ");
                                        if (usuario.getPostagens().isEmpty()){
                                            System.out.println("O usuário não tem nehuma postagem cadastrada! ");
                                            break;
                                        }
                                        for (Postagem postagem: usuario.getPostagens()){
                                            System.out.println("============================");
                                            System.out.println("Texto: " + postagem.getTexto());
                                            System.out.println("Curtidas: " + postagem.getCurtidas());
                                            System.out.println("Comentarios:");
                                            for (Comentario comentario: postagem.getComentarios()){
                                                System.out.println("------------------------");
                                                System.out.println("autor: " + comentario.getAutor());
                                                System.out.println("comentario: " + comentario.getTexto());
                                                System.out.println("------------------------");
                                            }
                                            System.out.println("============================");
                                        }
                                        break;
                                    case 5:
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
