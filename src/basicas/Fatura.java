package basicas;

import java.util.Calendar;

public class Fatura {
	
	String codigo_da_fatura;
	Calendar data_de_vencimento;
	double valor_total;
	String nome_do_cliente;
	
	public String getCodigo_da_fatura() {
		return codigo_da_fatura;
	}
	public void setCodigo_da_fatura(String codigo_da_fatura) {
		this.codigo_da_fatura = codigo_da_fatura;
	}
	public Calendar getData_de_vencimento() {
		return data_de_vencimento;
	}
	public void setData_de_vencimento(Calendar data_de_vencimento) {
		this.data_de_vencimento = data_de_vencimento;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String getNome_do_cliente() {
		return nome_do_cliente;
	}
	public void setNome_do_cliente(String nome_do_cliente) {
		this.nome_do_cliente = nome_do_cliente;
	}

}
