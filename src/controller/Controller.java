package controller;

import model.ModelsFachada;
import payment.Boleto;
import payment.CartaoCredito;
import payment.CartaoDebito;
import payment.Payment;
import payment.Paypal;
import product.CarrinhoFactory;
import view.Confirmacao;

public class Controller {
	private Confirmacao confirmacao;
	private CarrinhoFactory carrinhofactory;
	private ModelsFachada fachada;

	public Controller(ModelsFachada fachada) {
		this.fachada = fachada;
		this.carrinhofactory = new CarrinhoFactory(fachada.getCarrinho());
	}

	public void button() {
		if (fachada.getCarrinhoNomes() == "") {
			System.err.println("Impossivel continuar. Nenhum item selecionado");
		} else {
			confirmacao.open(fachada.getCarrinhoNomes(), fachada.getCarrinhoValores());
		}

	}

	public void check1() {
		boolean aux = fachada.getcheckBox(1);
		if (aux == false) {
			carrinhofactory.RemoveItem(1);
		} else {
			carrinhofactory.addItem(1);
		}
	}

	public void check2() {
		boolean aux = fachada.getcheckBox(2);
		if (aux == false) {
			carrinhofactory.RemoveItem(2);
		} else {
			carrinhofactory.addItem(2);
		}
	}

	public void check3() {
		boolean aux = fachada.getcheckBox(3);
		if (aux == false) {
			carrinhofactory.RemoveItem(3);
		} else {
			carrinhofactory.addItem(3);
		}
	}

	public void check4() {
		boolean aux = fachada.getcheckBox(4);
		if (aux == false) {
			carrinhofactory.RemoveItem(4);
		} else {
			carrinhofactory.addItem(4);
		}
	}

	public void check5() {
		boolean aux = fachada.getcheckBox(5);
		if (aux == false) {
			carrinhofactory.RemoveItem(5);
		} else {
			carrinhofactory.addItem(5);
		}
	}

	public void check6() {
		boolean aux = fachada.getcheckBox(6);
		if (aux == false) {
			carrinhofactory.RemoveItem(6);
		} else {
			carrinhofactory.addItem(6);
		}
	}

	public void addScreenConfirmacao(Confirmacao confirmacaoTela) {
		this.confirmacao = confirmacaoTela;
	}

	public void changePaymentMethod(int i) {
		fachada.setPaymentMethod(i);

	}

	public void pay() {
		int i = fachada.getPaymentMethod();

		if (i == 0) {
			System.out.println("nenhum metodo selecionado");
		} else if (i == 1) {
			Payment payment = new CartaoDebito();
			payment.pay(fachada.getCarrinhoValores(), fachada.getCarrinhoNomes());
		} else if (i == 2) {
			Payment payment = new CartaoCredito();
			payment.pay(fachada.getCarrinhoValores(), fachada.getCarrinhoNomes());
		} else if (i == 3) {
			Payment payment = new Boleto();
			payment.pay(fachada.getCarrinhoValores(), fachada.getCarrinhoNomes());
		} else if (i == 4) {
			Payment payment = new Paypal();
			payment.pay(fachada.getCarrinhoValores(), fachada.getCarrinhoNomes());
		} else {
			System.err.println("erro");
		}
	}

}