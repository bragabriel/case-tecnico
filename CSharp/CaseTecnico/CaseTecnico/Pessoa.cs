using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaseTecnico
{
    public class Pessoa
    {
        public string nome { get; set; }
        public int idade { get; set; }

        public Pessoa(string nome, int idade)
        {
            this.nome = nome;
            this.idade = idade;
        }

        public void imprimirPessoa()
        {
            Console.WriteLine("Nome = " + this.nome);
            Console.WriteLine("Idade = " + this.idade + "\n");
        }
    }
}
