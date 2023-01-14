package com.it.berdeja.oop;

import java.util.Arrays;
import java.util.Objects;

public class Present {
	private Sweet[] sweets;
	
	{this.sweets = new Sweet[0];}
	
    public void addSweet(Sweet sweet) {
    	if (sweet == null) {
    		return;
    	}
    	Sweet[] newSweets = Arrays.copyOf(sweets, sweets.length + 1);
    	newSweets[newSweets.length - 1] = sweet;
    	sweets = newSweets;
	}

	public double calculateTotalWeight() {
		double sum = 0;
		for (Sweet sweet : sweets) {
			sum += sweet.getWeight();
		}
		return sum;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		Sweet[] filterArray = new Sweet[sweets.length];
		for (int i = 0; i < sweets.length; i++) {
			if (sweets[i].getSugarWeight() >= minSugarWeight && sweets[i].getSugarWeight() <= maxSugarWeight) {
				filterArray[i] = sweets[i];
			}
		}
		return Arrays.stream(filterArray).filter(Objects::nonNull).toArray(Sweet[]::new);
	}

	public Sweet[] getSweets() {
		return Arrays.copyOf(sweets, sweets.length);
	}
}
