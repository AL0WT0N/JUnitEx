package com.qa.junit;

public class BlackjackSimple {
	
	public static int play(int dealer, int player) {
		if (dealer > 21 && player > 21) {
			return 0;
		} else if (dealer > 21) {
			return player;
		} else if (player > 21) {
			return dealer;
		}
		return Math.max(dealer, player);    
		
	}
	
}
