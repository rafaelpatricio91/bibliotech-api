package com.rafa.bibliotech.model;

import java.time.LocalDate;

public class Emprestimo
{
	private Long id;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	
	private Funcionario funcionario;
	private Aluno aluno;
	private Livro livro;
}
