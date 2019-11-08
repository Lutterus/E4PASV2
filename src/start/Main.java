package start;

import controller.Controller;
import model.Carrinho;
import model.CheckBoxes;
import model.ModelsFachada;
import model.PaymentMethod;
import payment.Payment;
import view.Confirmacao;
import view.List;

public class Main {
	public static void main(String[] args) {
		//start models
		ModelsFachada fachada = new ModelsFachada();
		
		//start interface
		//Payment p = new Payment();
		
		//start controllers		
		Controller c = new Controller(fachada);
		
		//start view
		Confirmacao confirmacaoTela = new Confirmacao(c);		
		List list = new List(c);
		
		//link controller
		c.addScreenConfirmacao(confirmacaoTela);
		
		//start program
		list.open();
	}
}
