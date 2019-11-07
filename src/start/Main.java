package start;

import controller.Controller;
import controller.Payment;
import model.Carrinho;
import model.CheckBoxes;
import model.PaymentMethod;
import view.Confirmacao;
import view.List;

public class Main {
	public static void main(String[] args) {
		//start models
		CheckBoxes model = new CheckBoxes();
		Carrinho carrinho = new Carrinho();
		PaymentMethod pm = new PaymentMethod();
		
		//start interface
		//Payment p = new Payment();
		
		//start controllers		
		Controller c = new Controller(model, carrinho, pm);
		
		//start view
		Confirmacao confirmacaoTela = new Confirmacao(c);		
		List list = new List(c);
		
		//link controller
		c.addScreenConfirmacao(confirmacaoTela);
		
		//start program
		list.open();
	}
}
