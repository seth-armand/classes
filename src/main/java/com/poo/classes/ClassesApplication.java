package com.poo.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
	} { 

	   Editora editora = new Editora(1, "Editora Exemplo");
	   Autor autor = new Autor(1, "Autor Exemplo");
	   livro livro = new livro(1, "1ª Edição", "Livro Exemplo", 2023, autor, editora);
	   exemplar exemplar = new exemplar(1, livro);
	   endereco endereco = new endereco(1, "SP", "São Paulo", "Residencial", "Rua Exemplo", "Apto 101");
	   pessoa pessoa = new pessoa(1, "123456789", "987654321", "Pessoa Exemplo", endereco);
	   devolucao devolucao = new devolucao(1, new Date());
	   List<ExemplarEmprestimo> exemplaresEmprestimo = new ArrayList<>();
	   ExemplarEmprestimo exemplarEmprestimo = new ExemplarEmprestimo(1, exemplar, null, devolucao);
	   exemplaresEmprestimo.add(exemplarEmprestimo);
	   emprestimo emprestimo = new emprestimo(1, new Date(), new Date(), pessoa, exemplaresEmprestimo);

	   // Adicione mais testes conforme necessário
	   System.out.println("Livro: " + livro.getTitulo());
	   System.out.println("Pessoa: " + pessoa.getNome());
	   System.out.println("Emprestimo ID: " + emprestimo.getEmprestimoId());
   }

}


