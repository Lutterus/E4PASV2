package controller;

import model.Carrinho;
import model.CheckBoxes;
import model.PaymentMethod;
import payment.Boleto;
import payment.CartaoCredito;
import payment.CartaoDebito;
import payment.Paypal;
import product.CarrinhoFactory;
import view.Confirmacao;

public class Controller {
	private CheckBoxes checkboxes;
	private Confirmacao confirmacao;
	private Carrinho carrinho;
	private PaymentMethod paymentMethod;
	private CarrinhoFactory carrinhofactory;

	public Controller(CheckBoxes checkboxes, Carrinho carrinho, PaymentMethod paymentMethod) {
		this.checkboxes = checkboxes;
		this.carrinho = carrinho;
		this.paymentMethod = paymentMethod;
		this.carrinhofactory = new CarrinhoFactory(carrinho);
	}

	public void button() {
		if(carrinho.getCarrinhoNomes()=="") {
			System.err.println("Impossivel continuar. Nenhum item selecionado");
		}else {
			confirmacao.open(carrinho.getCarrinhoNomes(), carrinho.getCarrinhoValores());
		}
		
	}

	public void check1() {
		if (checkboxes.isCheck1() == true) {
			carrinhofactory.RemoveItem(1);
			checkboxes.setCheck1(false);
		} else {
			checkboxes.setCheck1(true);
			carrinhofactory.addItem(1);
		}
	}

	public void check2() {
		if (checkboxes.isCheck2() == true) {
			checkboxes.setCheck2(false);
			carrinhofactory.RemoveItem(2);
		} else {
			checkboxes.setCheck2(true);
			carrinhofactory.addItem(2);
		}
	}

	public void check3() {
		if (checkboxes.isCheck3() == true) {
			checkboxes.setCheck3(false);
			carrinhofactory.RemoveItem(3);
		} else {
			checkboxes.setCheck3(true);
			carrinhofactory.addItem(3);
		}
	}

	public void check4() {
		if (checkboxes.isCheck4() == true) {
			checkboxes.setCheck4(false);
			carrinhofactory.RemoveItem(4);
		} else {
			checkboxes.setCheck4(true);
			carrinhofactory.addItem(4);
		}
	}
	
	public void check5() {
		if (checkboxes.isCheck5() == true) {
			checkboxes.setCheck5(false);
			carrinhofactory.RemoveItem(5);
		} else {
			checkboxes.setCheck5(true);
			carrinhofactory.addItem(5);
		}
	}
	
	public void check6() {
		if (checkboxes.isCheck6() == true) {
			checkboxes.setCheck6(false);
			carrinhofactory.RemoveItem(6);
		} else {
			checkboxes.setCheck6(true);
			carrinhofactory.addItem(6);
		}
	}

	public void addScreenConfirmacao(Confirmacao confirmacaoTela) {
		this.confirmacao = confirmacaoTela;		
	}

	public void changePaymentMethod(int i) {
		paymentMethod.setNewMethod(i);
		
	}

	public void pay() {
		int i = paymentMethod.getMethod();
		
		if(i==0) {
			System.out.println("nenhum metodo selecionado");
		}else if(i==1) {
			Payment payment = new CartaoDebito();
			payment.pay(carrinho.getCarrinhoValores(), carrinho.getCarrinhoNomes());
		}else if(i==2) {
			Payment payment = new CartaoCredito();
			payment.pay(carrinho.getCarrinhoValores(), carrinho.getCarrinhoNomes());
		}else if(i==3) {
			Payment payment = new Boleto();
			payment.pay(carrinho.getCarrinhoValores(), carrinho.getCarrinhoNomes());
		}else if(i==4){
			Payment payment = new Paypal();
			payment.pay(carrinho.getCarrinhoValores(), carrinho.getCarrinhoNomes());
		} else {
			System.err.println("erro");
		}		
	}

}