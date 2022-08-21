package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStg = new Scanner(System.in);
		Scanner scanOp = new Scanner(System.in);
		
        ArrayList<Pessoa> listaUsuarios = new ArrayList<Pessoa>();
        ArrayList<Pessoa> categoriaCrianca = new ArrayList<Pessoa>();
        ArrayList<Pessoa> categoriaAdolescente = new ArrayList<Pessoa>();
        ArrayList<Pessoa> categoriaAdulto = new ArrayList<Pessoa>();
        ArrayList<Pessoa> categoriaIdoso = new ArrayList<Pessoa>();
        
        int i;
        
        System.out.println("--------------- Case Tecnico ----------------");

        while(true){
        		int op = 0;
        		String input;
        		
        		do{
        			System.out.println("\nPor favor, selecione o numero da opcao escolhida:");
     	            System.out.println("1 - Cadastrar usuario");
     	            System.out.println("2 - Listar usuarios por Idade");
     	            System.out.println("3 - Listar usuarios por Ordem Alfabetica");
     	            System.out.println("4 - Listar por Categoria");
     	            System.out.println("9 - Sair");
     	            System.out.println("Opcao: ");
     	            
     	            
     	            //Tratamento de exceção
     	            try {
     	            	input = scanOp.nextLine();
         	            
         	            op = Integer.parseInt(input);
         	            break;
         	            
     	            }catch(NumberFormatException except) {
     	            	System.out.println("- Por favor, insira um número válido!");
     	            }
     	            
        		}while(op != 1 || op != 2 || op != 3 || op != 4 || op != 9);
	           
            
	            if(op == 9) {
	            	break;
	            }else {
	            	switch (op) {
	                case 1:
	                    System.out.println("--- Cadastro de Usuario ---");
	                    System.out.print("Por favor, insira o nome do usuario: ");
	                    String nome = scanStg.nextLine();
	                    
	                    System.out.print("Por favor, insira a idade do usuario: ");
	                    int idade = scanInt.nextInt();
	                    
	                    Pessoa p1 = new Pessoa(nome, idade);
	                    listaUsuarios.add(p1);
	                    
	                    System.out.println("\nUsuario '" + nome + "' adicionado com sucesso!");
	                    
	                    break;
	                    
	                case 2:
	                    System.out.println("--- Exibindo Usuarios Cadastrados (Ordenados por Idade) ---\n");
	                    
	                    listaUsuarios.sort(Comparator.comparing(Pessoa::getIdade));

	                    for(i = 0; i < listaUsuarios.size(); ++i) {
	                        System.out.println(i + 1 + " - ");
	                        listaUsuarios.get(i).imprimirPessoa();;
	                    }
	                    break;
	               
	                case 3:
	                    System.out.println("--- Exibindo Usuarios Cadastrados (Ordem Alfabetica) ---\n");
	                    listaUsuarios.sort(Comparator.comparing(Pessoa::getNome));
	                    
	                    for(i = 0; i < listaUsuarios.size(); ++i) {
	                        System.out.println(i + 1 + " - ");
	                        listaUsuarios.get(i).imprimirPessoa();;
	                    }
	                    break;
	                    
	                case 4:
	                    System.out.println("--- Exibindo Usuarios por Categorias (Idades) ---\n");
	                    
	                    listaUsuarios.sort(Comparator.comparing(Pessoa::getIdade));
	                
	                    for(i = 0; i < listaUsuarios.size(); ++i) {
	                    	
	                    	//Atribuindo a idade dos usuários para a variável categoria
	                        int categoria = listaUsuarios.get(i).getIdade();
	                        
	                        if (categoria >= 0 && categoria <= 12) {
	                        	
	                            categoriaCrianca.add(listaUsuarios.get(i));
	                            
	                        } else if (categoria >= 12 && categoria <= 19) {
	                        	
	                            categoriaAdolescente.add(listaUsuarios.get(i));
	                            
	                        } else if (categoria >= 20 && categoria <= 65) {
	                        	
	                            categoriaAdulto.add(listaUsuarios.get(i));
	                            
	                        } else {
	                        	
	                            categoriaIdoso.add(listaUsuarios.get(i));
	                        }
	                    }

	                    System.out.println("- Exibindo Usuarios na Categoria 'Criança' (0 - 12)\n");

	                    if(categoriaCrianca.size() == 0) {
	                    	System.out.println("Nenhum usuario na categoria Crianca.\n\n");
	                    }else {
	                    	for(i = 0; i < categoriaCrianca.size(); ++i) {
	                            System.out.println(i + 1 + " - ");
	                            categoriaCrianca.get(i).imprimirPessoa();;
	                        }
	                    }
	                    

	                    System.out.println("- Exibindo Usuarios na Categoria 'Adolescente' (13 - 19)\n");

	                    if(categoriaAdolescente.size() == 0) {
	                    	System.out.println("Nenhum usuario na categoria Adolescente.\n\n");
	                    }else {
		                    for(i = 0; i < categoriaAdolescente.size(); ++i) {
		                        System.out.println(i + 1 + " - ");
		                        categoriaAdolescente.get(i).imprimirPessoa();;
		                    }
	                    }

	                    System.out.println("- Exibindo Usuarios na Categoria 'Adulto' (20 - 65)\n");

	                    if(categoriaAdulto.size() == 0) {
	                    	System.out.println("Nenhum usuario na categoria Adulto.\n\n");
	                    }else {
		                    for(i = 0; i < categoriaAdulto.size(); ++i) {
		                        System.out.println(i + 1 + " - ");
		                        categoriaAdulto.get(i).imprimirPessoa();;
		                    }
	                    }

	                    System.out.println("- Exibindo Usuarios na Categoria 'Idoso' (65 - ...)\n");

	                    if(categoriaIdoso.size() == 0) {
	                    	System.out.println("Nenhum usuario na categoria Idoso.\n\n");
	                    }else {
		                    for(i = 0; i < categoriaIdoso.size(); ++i) {
		                        System.out.println(i + 1 + " - ");
		                        categoriaIdoso.get(i).imprimirPessoa();;
		                    }
	                    }
	            		
	                    break;
	                    
	                    default:
	                    	System.out.println("Opcao invalida! Selecione outra opcao");
	                    	break;
	                    
	            	}//fim switch
	            }//fim else
        	}//fim while

        System.out.println("-- Programa Finalizado --");
        System.out.println("-- Autor: Gabriel Braga da Silva --");

        scanInt.close();
        scanStg.close();
        scanOp.close();
	}

}
