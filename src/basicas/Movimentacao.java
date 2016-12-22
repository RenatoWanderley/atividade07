package basicas;

public class Movimentacao {
	
	
	String codigo_da_movimentacao;
	String data_atual;
	int numero_de_boletos;
	double total_de_valor_pago;
	public String getCodigo_da_movimentacao() {
		return codigo_da_movimentacao;
	}
	public void setCodigo_da_movimentacao(String codigo_da_movimentacao) {
		this.codigo_da_movimentacao = codigo_da_movimentacao;
	}
	public String getData_atual() {
		return data_atual;
	}
	public void setData_atual(String data_atual) {
		this.data_atual = data_atual;
	}
	public int getNumero_de_boletos() {
		return numero_de_boletos;
	}
	public void setNumero_de_boletos(int numero_de_boletos) {
		this.numero_de_boletos = numero_de_boletos;
	}
	public double getTotal_de_valor_pago() {
		return total_de_valor_pago;
	}
	public void setTotal_de_valor_pago(double total_de_valor_pago) {
		this.total_de_valor_pago = total_de_valor_pago;
	}
	
	

}
