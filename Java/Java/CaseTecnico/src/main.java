import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		ArrayList<Pessoa> listaUsuarios = new ArrayList<Pessoa>();
		ArrayList<Pessoa> categoriaCrianca = new ArrayList<Pessoa>();
		ArrayList<Pessoa> categoriaAdolescente = new ArrayList<Pessoa>();
		ArrayList<Pessoa> categoriaAdulto = new ArrayList<Pessoa>();
		ArrayList<Pessoa> categoriaIdoso= new ArrayList<Pessoa>();
		
		int op = 0;
		
		System.out.println("--------------- Case T�cnico ----------------");
		
		do {			
			System.out.println("\nPor favor, selecione o numero da opcao escolhida:");
			System.out.println("1 - Cadastrar usu�rio");
			System.out.println("2 - Listar usu�rios por Idade");
			System.out.println("3 - Listar usu�rios por Ordem Alfabetica");
			System.out.println("4 - Listar por Categoria");
			System.out.println("9 - Sair");
			
			System.out.println("Op��o: ");
			op = scan.nextInt();
			
			switch(op) {
			case 1:
				
				System.out.println("--- Cadastro de Usu�rio ---");
				
				System.out.print("Por favor, insira o nome do usu�rio: ");
				String nome = scan.next();
				System.out.print("Por favor, insira a idade do usu�rio: ");
				int idade= scan.nextInt();
				
				Pessoa p1 = new Pessoa(nome, idade);
				
				listaUsuarios.add(p1);
				
				System.out.println("\nUsu�rio '" + nome + "' adicionado com sucesso!");
				
				break;
			
			case 2:
			
				System.out.println("--- Exibindo Usu�rios Cadastrados (Ordenados por Idade) ---\n");
				

				listaUsuarios.sort(Comparator.comparing(Pessoa::getIdade));
				
				
				for(int i = 0; i < listaUsuarios.size(); i++) {
					System.out.println((i+1) + " - ");
					listaUsuarios.get(i).imprimirPessoa();;
				}
				
				break;
			
			case 3:
				
				System.out.println("--- Exibindo Usu�rios Cadastrados (Ordem Alfab�tica) ---\n");
				

				listaUsuarios.sort(Comparator.comparing(Pessoa::getNome));
				
				
				for(int i = 0; i < listaUsuarios.size(); i++) {
					System.out.println((i+1) + " - ");
					listaUsuarios.get(i).imprimirPessoa();;
				}
				
				break;
				
				
			case 4:
				System.out.println("--- Exibindo Usu�rios por Categorias (Idades) ---\n");
				
				/*
				for(int i = 0; i < listaUsuarios.size(); i++) {
					
					int categoria = listaUsuarios.get(i).getIdade();

					if(categoria >= 0 && categoria <= 12) {
						categoriaCrianca.add(listaUsuarios(i));
					}
				}
				*/
				break;
				
			}
			
		}while(op != 1 || op!=2 || op!=3);

}
}