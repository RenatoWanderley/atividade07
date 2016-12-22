package basicas;

import java.util.Calendar;

public class Pagamento {
	
	double valor;
	String codigo_do_pagamento;
	Calendar data;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCodigo_do_pagamento() {
		return codigo_do_pagamento;
	}
	public void setCodigo_do_pagamento(String codigo_do_pagamento) {
		this.codigo_do_pagamento = codigo_do_pagamento;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	

}
