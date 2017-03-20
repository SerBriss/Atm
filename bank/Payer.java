package bank;

import java.util.ArrayList;
import java.util.List;

public class Payer{
    String name;
    String phone;
    public List<Card> cards;
    Card primeCard;

    public String getName() {
        return name;

    }

    public String getPhone(){
        return phone;
    }

    public void getACard(Card card){
cards.add(card);
    }


	
	public Payer(String name){
		this.name = name;
		cards = new ArrayList<Card>();
		phone = "+79312028771";
	}

	public void setPrimeCard(Card card){
	    primeCard = card;
    }

    public Card getPrimeCard(){
	    return primeCard;
    }
	
}