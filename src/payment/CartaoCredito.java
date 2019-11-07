package payment;

import controller.Payment;
import view.Finalizar;

public class CartaoCredito implements Payment {
	@Override
	public void pay(String value, String itens) {
		//padronizacao value
				String[] array = value.split(";");
				double valor = 0;
				for (int i = 0; i < array.length; i++) {
					valor = valor + Double.valueOf(array[i]);
				}
				String valor2 = "$";
				valor2 = valor2 + String.valueOf(valor);
				
				//padronizacao itens
				String[] array2 = itens.split(";");
				String itens2 = "";
				int i=0;
				if(array2.length>3) {
					i=2;
					itens = "Itens: " + array2[0] + "; " + array2[1] + "; ";
					for (int j = 0; j < array2.length; j++) {
						if(j==array2.length-1) {
							itens2 = itens2 + array2[j];
						}else {
							itens2 = itens2 + array2[j] + "; ";
						}
						
					}
				}else {
					itens = "Itens: " + itens;
				}
				
				
				//padronizacao metodo
				String metodo = "Metodo de pagamento: Cartao de Credito";
				
				Finalizar window = new Finalizar();
				window.open(valor2, itens, itens2, metodo, i);
	}
}
