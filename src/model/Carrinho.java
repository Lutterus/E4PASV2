package model;

import java.util.ArrayList;

import product.Box;
import product.Card;

public class Carrinho {
	ArrayList<Box> boxes;
	ArrayList<Card> cards;

	public Carrinho() {
		boxes = new ArrayList<Box>();
		cards = new ArrayList<Card>();
	}

	public String getCarrinhoNomes() {
		String nomeConcat = "";
		int i = 0;
		for (Box string : boxes) {
			if (i != 0) {
				nomeConcat = nomeConcat + "; " + string.getNome();
			} else {
				nomeConcat = nomeConcat + string.getNome();
			}
			i++;
		}

		for (Card string : cards) {
			if (i != 0) {
				nomeConcat = nomeConcat + "; " + string.getNome();
			} else {
				nomeConcat = nomeConcat + string.getNome();
			}
			i++;
		}
		return nomeConcat;
	}

	public String getCarrinhoValores() {
		String nomeConcat = "";
		int i = 0;
		for (Box string : boxes) {
			if (i != 0) {
				nomeConcat = nomeConcat + "; " + string.getValor();
			} else {
				nomeConcat = nomeConcat + string.getValor();
			}
			i++;
		}

		for (Card string : cards) {
			if (i != 0) {
				nomeConcat = nomeConcat + "; " + string.getValor();
			} else {
				nomeConcat = nomeConcat + string.getValor();
			}
			i++;
		}
		return nomeConcat;
	}

	public void addBox(Box box) {
		boxes.add(box);

	}

	public void removeBox(String nome) {
		int i = 0;
		int j = 0;
		for (Box box : boxes) {
			if (box.getNome().contentEquals(nome)) {
				j = i;
			}
			i++;
		}

		boxes.remove(j);
	}

	public void addCard(Card card) {
		cards.add(card);

	}

	public void removeCard(String nome) {
		int i = 0;
		int j = 0;
		for (Card card : cards) {
			if (card.getNome().contentEquals(nome)) {
				j = i;
			}
			i++;
		}

		cards.remove(j);

	}
}
