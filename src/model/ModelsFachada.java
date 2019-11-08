package model;

public class ModelsFachada {
	private CheckBoxes checkboxes;
	private Carrinho carrinho;
	private PaymentMethod paymentMethod;

	public ModelsFachada() {
		checkboxes = new CheckBoxes();
		carrinho = new Carrinho();
		paymentMethod = new PaymentMethod();
	}

	public boolean getcheckBox(int i) {
		if (i == 1) {
			return checkboxes.isCheck1();
		} else if (i == 2) {
			return checkboxes.isCheck2();
		} else if (i == 3) {
			return checkboxes.isCheck3();
		} else if (i == 4) {
			return checkboxes.isCheck4();
		} else if (i == 5) {
			return checkboxes.isCheck5();
		} else if (i == 6) {
			return checkboxes.isCheck6();
		} else {
			System.err.println("erro");
			return false;
		}
	}

	public void setPaymentMethod(int i) {
		paymentMethod.setNewMethod(i);
	}

	public int getPaymentMethod() {
		return paymentMethod.getMethod();
	}

	public String getCarrinhoValores() {
		return carrinho.getCarrinhoValores();
	}

	public String getCarrinhoNomes() {
		return carrinho.getCarrinhoNomes();
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

}
