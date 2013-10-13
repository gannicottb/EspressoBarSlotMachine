package com.gannicott.espressobarslotmachine;

import java.util.Random;

public class SlotMachine {
	
	/*	There are 3 reels. Each has 3 values. Each value comes from a themed set (coffee, tea, espresso).
		Left: coffee(0), tea(0), espresso(0)
		Middle: coffee(1), tea(1), espresso(1)
		Right: coffe(2), tea(2), espresso(2)
			
		The SlotMachine class contains the reels, and passes commands to them.
	*/
	
	final int NO_PRIZE = -1;
	final int COFFEE = 0;
	final int TEA = 1;
	final int ESPRESSO = 2;
	
	Reel left, middle, right;
	public SlotMachine()
	{
		//Initialize reels
		left = new Reel();
		middle = new Reel();
		right = new Reel();
	}
	
	public int pull()
	{
		//Spin each reel, pass those values to getPrize and return the result
		return getPrize(left.spin(), middle.spin(), right.spin());
	}
	
	private int getPrize(int left, int middle, int right)
	{
		int prize = NO_PRIZE;
		//if left == middle == right, then the prize is equal to that value
		//else the user didn't win anything
		if (left == middle && middle == right )
		{
			prize = left;
		}
		return prize;		
	}
	
	private class Reel {
		Reel()
		{
			//I suppose this is where you decide which set of values go on this reel
		}
		
		public int spin()
		{
			//spin the reel and then return its value 0-2.
			Random gen = new Random();
			return gen.nextInt(3);			
		}
	}

}
