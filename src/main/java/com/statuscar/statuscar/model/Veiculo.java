package com.statuscar.statuscar.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	private Integer ordem_servico;
	private String placa;
	private Integer numero_prisma;
	private String cor_prisma;		
	
	public Veiculo() {
		
	}
	
	public Veiculo(long codigo, Integer ordem_servico, String placa, Integer numero_prisma, String cor_prisma) {
		this.codigo = codigo;
		this.ordem_servico = ordem_servico;
		this.placa = placa;
		this.numero_prisma = numero_prisma;
		this.cor_prisma = cor_prisma;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getOrdem_servico() {
		return ordem_servico;
	}

	public void setOrdem_servico(Integer ordem_servico) {
		this.ordem_servico = ordem_servico;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public Integer getNumero_prisma() {
		return numero_prisma;
	}

	public void setNumero_prisma(Integer numero_prisma) {
		this.numero_prisma = numero_prisma;
	}

	public String getCor_prisma() {
		return cor_prisma;
	}

	public void setCor_prisma(String cor_prisma) {
		this.cor_prisma = cor_prisma;
	}
	 	 	 	 
}
