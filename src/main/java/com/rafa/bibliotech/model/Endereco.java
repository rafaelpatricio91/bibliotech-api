package com.rafa.bibliotech.model;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco
{
	String logradouro;
	String cidade;
	String estado;
}
