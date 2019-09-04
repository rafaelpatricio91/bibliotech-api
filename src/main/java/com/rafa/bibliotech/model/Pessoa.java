package com.rafa.bibliotech.model;

import java.time.LocalDate;

import javax.persistence.Embedded;

public class Pessoa
{
	private Long id;
	private String nome;
	private String matricula;
	private String rg;
	private String telefone;
	private LocalDate dataNascimento;
	@Embedded
	private Endereco endereco;
	
}
