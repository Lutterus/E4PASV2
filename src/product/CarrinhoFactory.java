package product;

import model.Carrinho;

public class CarrinhoFactory {
	Carrinho carrinho;

	public CarrinhoFactory(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public void addItem(int itemId) {
		if (itemId == 1) {
			carrinho.addBox(new Box("Guilds of Ravnica", "582.99"));
		} else if (itemId == 2) {
			carrinho.addBox(new Box("Ravnica Allegiance", "548.90"));
		} else if (itemId == 3) {
			carrinho.addBox(new Box("War Of The Spark", "613.99"));
		} else if (itemId == 4) {
			carrinho.addBox(new Box("Throne Of Eldraine", "598.99"));
		} else if (itemId == 5) {
			carrinho.addCard(new Card("Nissa, Abaladora do Mundo", "200.00"));
		} else if (itemId == 6) {
			carrinho.addCard(new Card("Manipulacao em Massa", "5.00"));
		}
	}

	public void RemoveItem(int itemId) {
		if (itemId == 1) {
			carrinho.removeBox("Guilds of Ravnica");
		} else if (itemId == 2) {
			carrinho.removeBox("Ravnica Allegiance");
		} else if (itemId == 3) {
			carrinho.removeBox("War Of The Spark");
		} else if (itemId == 4) {
			carrinho.removeBox("Throne Of Eldraine");
		} else if(itemId==5) {
			carrinho.removeCard("Nissa, Abaladora do Mundo");
		} else if(itemId==6) {
			carrinho.removeCard("Manipulacao em Massa");
		}
	}
}
