package basicas;

import java.util.Calendar;

public class Credito {
	
	String codigo_do_credito;
	String nome_do_cliente;
	double valor_de_credito;
	Calendar data_de_emissao;
	public String getCodigo_do_credito() {
		return codigo_do_credito;
	}
	public void setCodigo_do_credito(String codigo_do_credito) {
		this.codigo_do_credito = codigo_do_credito;
	}
	public String getNome_do_cliente() {
		return nome_do_cliente;
	}
	public void setNome_do_cliente(String nome_do_cliente) {
		this.nome_do_cliente = nome_do_cliente;
	}
	public double getValor_de_credito() {
		return valor_de_credito;
	}
	public void setValor_de_credito(double valor_de_credito) {
		this.valor_de_credito = valor_de_credito;
	}
	public Calendar getData_de_emissao() {
		return data_de_emissao;
	}
	public void setData_de_emissao(Calendar data_de_emissao) {
		this.data_de_emissao = data_de_emissao;
	}



}
