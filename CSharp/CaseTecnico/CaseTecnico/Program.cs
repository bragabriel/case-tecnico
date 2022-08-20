using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaseTecnico
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Pessoa> listaUsuarios = new List<Pessoa>();
            List<Pessoa> categoriaCrianca = new List<Pessoa>();
            List<Pessoa> categoriaAdolescente = new List<Pessoa>();
            List<Pessoa> categoriaAdulto = new List<Pessoa>();
            List<Pessoa> categoriaIdoso = new List<Pessoa>();

            int i;

            Console.WriteLine("------ Case Tecnico ------");

            while (true)
            {
                int op = 0;

                do
                {
                    Console.WriteLine("\nPor favor, selecione o numero da opcao escolhida:");
                    Console.WriteLine("1 - Cadastrar usuario");
                    Console.WriteLine("2 - Listar usuarios por Idade");
                    Console.WriteLine("3 - Listar usuarios por Ordem Alfabetica");
                    Console.WriteLine("4 - Listar por Categoria");
                    Console.WriteLine("9 - Sair\n");
                    Console.Write("Opcao: ");

                    try
                    {
                        op = int.Parse(Console.ReadLine());
                    }
                    catch (FormatException)
                    {
                        Console.WriteLine("Por favor, um número inteiro!");
                    }

                    if (op != 1 && op != 2 && op != 3 && op != 4 && op != 9)
                    {
                        Console.WriteLine("Por favor, insira uma opção válida!");
                    }

                } while (op != 1 && op != 2 && op != 3 && op != 4 && op != 9);

                if (op == 9)
                {
                    break;
                }
                else
                {
                    switch (op)
                    {
                        case 1:
                            Console.WriteLine("--- Cadastro de Usuario ---");
                            Console.Write("Por favor, insira o nome do usuario: ");
                            string nome = Console.ReadLine();
                            Console.Write("Por favor, insira a idade do usuario: ");
                            int idade = int.Parse(Console.ReadLine());

                            Pessoa p1 = new Pessoa(nome, idade);
                            listaUsuarios.Add(p1);

                            Console.WriteLine("\nUsuario '" + nome + "' adicionado com sucesso!");

                            break;

                        case 2:
                            Console.WriteLine("--- Exibindo Usuarios Cadastrados (Ordenados por Idade) ---\n");

                            listaUsuarios = listaUsuarios.OrderBy(x => x.idade).ToList();

                            for (i = 0; i < listaUsuarios.Count(); ++i)
                            {
                                Console.WriteLine(i + 1 + " - ");
                                listaUsuarios[i].imprimirPessoa();
                            }

                            break;
                           
                        case 3:
                            Console.WriteLine("--- Exibindo Usuarios Cadastrados (Ordem Alfabetica) ---\n");

                            listaUsuarios = listaUsuarios.OrderBy(x => x.nome).ToList();

                            for (i = 0; i < listaUsuarios.Count(); ++i)
                            {
                                Console.WriteLine(i + 1 + " - ");
                                listaUsuarios[i].imprimirPessoa();
                            }
                            break;
                            
                        case 4:
                            Console.WriteLine("\n--- Exibindo Usuarios por Categorias (Idades) ---\n");

                            listaUsuarios = listaUsuarios.OrderBy(x => x.idade).ToList();

                            for (i = 0; i < listaUsuarios.Count(); ++i)
                            {

                                //Atribuindo a idade dos usuários para a variável categoria
                                int categoria = listaUsuarios[i].idade;

                                if (categoria >= 0 && categoria <= 12)
                                {
                                    categoriaCrianca.Add(listaUsuarios[i]);
                                }
                                else if (categoria >= 12 && categoria <= 19)
                                {
                                    categoriaAdolescente.Add(listaUsuarios[i]);
                                }
                                else if (categoria >= 20 && categoria <= 65)
                                {
                                    categoriaAdulto.Add(listaUsuarios[i]);
                                }
                                else
                                {
                                    categoriaIdoso.Add(listaUsuarios[i]);
                                }
                            }

                            Console.WriteLine("- Exibindo Usuarios na Categoria 'Criança' (0 - 12)\n");

                            if (categoriaCrianca.Count() == 0)
                            {
                                Console.WriteLine("Nenhum usuario na categoria Crianca.\n\n");
                            }
                            else
                            {
                                for (i = 0; i < categoriaCrianca.Count(); ++i)
                                {
                                    Console.WriteLine(i + 1 + " - ");
                                    categoriaCrianca[i].imprimirPessoa(); ;
                                }
                            }


                            Console.WriteLine("- Exibindo Usuarios na Categoria 'Adolescente' (13 - 19)\n");

                            if (categoriaAdolescente.Count() == 0)
                            {
                                Console.WriteLine("Nenhum usuario na categoria Adolescente.\n\n");
                            }
                            else
                            {
                                for (i = 0; i < categoriaAdolescente.Count(); ++i)
                                {
                                    Console.WriteLine(i + 1 + " - ");
                                    categoriaAdolescente[i].imprimirPessoa(); ;
                                }
                            }

                            Console.WriteLine("- Exibindo Usuarios na Categoria 'Adulto' (20 - 65)\n");

                            if (categoriaAdulto.Count() == 0)
                            {
                                Console.WriteLine("Nenhum usuario na categoria Adulto.\n\n");
                            }
                            else
                            {
                                for (i = 0; i < categoriaAdulto.Count(); ++i)
                                {
                                    Console.WriteLine(i + 1 + " - ");
                                    categoriaAdulto[i].imprimirPessoa(); ;
                                }
                            }

                            Console.WriteLine("- Exibindo Usuarios na Categoria 'Idoso' (65 - ...)\n");

                            if (categoriaIdoso.Count() == 0)
                            {
                                Console.WriteLine("Nenhum usuario na categoria Idoso.\n\n");
                            }
                            else
                            {
                                for (i = 0; i < categoriaIdoso.Count(); ++i)
                                {
                                    Console.WriteLine(i + 1 + " - ");
                                    categoriaIdoso[i].imprimirPessoa(); ;
                                }
                            }

                            break;

                        default:
                            Console.WriteLine("Opcao invalida! Selecione outra opcao");
                            break;

                    }//fim switch
                }//fim else
            }//end while
           
        }
    }
}

