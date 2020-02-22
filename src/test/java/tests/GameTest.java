package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

// import java.util.ArrayList;
// import service_layer_cards.*;
import service_layer_physics.*;


class GameTest {

	@Test
	void testPlayerNumbers() {
		int handNum = 0;
		Game.setPlayerNum(2);
		String problem = "Tul Keves Kartya";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 6;
		Game.setPlayerNum(3);
		problem = "3-ra teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 6;
		Game.setPlayerNum(5);
		problem = "5-re teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 5;
		Game.setPlayerNum(6);
		problem = "6-ra teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 5;
		Game.setPlayerNum(7);
		problem = "7-re teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 4;
		Game.setPlayerNum(8);
		problem = "8-ra teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 4;
		Game.setPlayerNum(10);
		problem = "10-re teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
		handNum = 0;
		Game.setPlayerNum(11);
		problem = "11-re teszteles";
		assertEquals(Game.getMaxCardsInHand(), handNum, problem);
		
	}
	
	@Test
	void testPlayerProportion() {
		/*
		 * BRUTEFORCE TESZTELVE... Jobb ötletem most nincs :(
		 */
		Game.setPlayerNum(10);
		Game.fillPlayers();
		Game.printPlayersType();
	}

}