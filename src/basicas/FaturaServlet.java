
package basicas;

import gerenciador.dao.FaturaDao;
import gerenciador.entidades.Contato;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Fatura")
public class FaturaServlet extends HttpServlet {

    

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	// pegando os parâmetros do request
	String codigo_da_fatura = request.getParameter("codigo_da_fatura");
	String data_de_vencimento = request.getParameter("data_de_vencimento");
	String valor_total = request.getParameter("valor_total");
	String nome_do_cliente = request.getParameter("nome_do_cliente");

	// fazendo a conversão da data
	Date dataNascimento;
	try {
	    data_de_vencimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
	} catch (ParseException e) {
	    System.out.println("Erro de conversão da data");
	    return;
	}

	// monta um objeto contato
	Contato contato = new Contato();
	contato.setcodigo_da_fatura(codigo_da_fatura);
	contato.data_de_vencimento(data_de_vencimento);
	contato.setvalor_total(valor_total);
	contato.setnome_do_cliente(nome_do_cliente);

	// salva o contato
	FaturaDao dao = new FaturaDao();
	dao.salvar(Fatura);

	// imprime o nome do contato que foi adicionado
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("Contato " + contato.getNome() + " adicionado com sucesso");
	out.println("<br /> <a href='/gerenciador'> Início </a>");
	out.println("</body>");
	out.println("</html>");
    }
}

