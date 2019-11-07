package model;

public class PaymentMethod {
	private boolean cartaoDebito;
	private boolean cartaoCredito;
	private boolean boletoBancario;
	private boolean paypal;

	public PaymentMethod() {
		cartaoDebito = false;
		cartaoCredito = false;
		boletoBancario = false;
		paypal = false;
	}

	public void setNewMethod(int i) {
		if (i == 1) {
			cartaoDebito = true;
			cartaoCredito = false;
			boletoBancario = false;
			paypal = false;
		} else if (i == 2) {
			cartaoDebito = false;
			cartaoCredito = true;
			boletoBancario = false;
			paypal = false;
		} else if (i == 3) {
			cartaoDebito = false;
			cartaoCredito = false;
			boletoBancario = true;
			paypal = false;
		} else if (i == 4) {
			cartaoDebito = false;
			cartaoCredito = false;
			boletoBancario = false;
			paypal = true;
		} else {
			System.err.println("erro");
		}
	}

	public int getMethod() {
		if (cartaoDebito == false && cartaoCredito == false && boletoBancario == false && paypal == false) {
			return 0;

		} else if (cartaoDebito == true) {
			return 1;
		} else if (cartaoCredito == true) {
			return 2;
		} else if (boletoBancario == true) {
			return 3;
		} else if (paypal == true) {
			return 4;
		} else {
			return 0;
		}
	}
}
