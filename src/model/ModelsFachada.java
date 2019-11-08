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
			return checkboxCheck1();
		} else if(i == 2) {
			return checkboxCheck2();
		} else if(i ==3 ) {
			return checkboxCheck3();
		} else if(i==4) {
			return checkboxCheck4();
		} else if(i==5) {
			return checkboxCheck5();
		}else if(i==6) {
			return checkboxCheck6();
		}else {
			System.err.println("erro");
			return false;
		}
	}

	private boolean checkboxCheck6() {
		if (checkboxes.isCheck6() == true) {
			checkboxes.setCheck6(false);
			return false;
		} else {
			checkboxes.setCheck6(true);
			return true;
		}
	}

	private boolean checkboxCheck5() {
		if (checkboxes.isCheck5() == true) {
			checkboxes.setCheck5(false);
			return false;
		} else {
			checkboxes.setCheck5(true);
			return true;
		}
	}

	private boolean checkboxCheck4() {
		if (checkboxes.isCheck4() == true) {
			checkboxes.setCheck4(false);
			return false;
		} else {
			checkboxes.setCheck4(true);
			return true;
		}
	}

	private boolean checkboxCheck3() {
		if (checkboxes.isCheck3() == true) {
			checkboxes.setCheck3(false);
			return false;
		} else {
			checkboxes.setCheck3(true);
			return true;
		}
	}

	private boolean checkboxCheck2() {
		if (checkboxes.isCheck2() == true) {
			checkboxes.setCheck2(false);
			return false;
		} else {
			checkboxes.setCheck2(true);
			return true;
		}
	}

	private boolean checkboxCheck1() {
		if (checkboxes.isCheck1() == true) {
			checkboxes.setCheck1(false);
			return false;
		} else {
			checkboxes.setCheck1(true);
			return true;
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
