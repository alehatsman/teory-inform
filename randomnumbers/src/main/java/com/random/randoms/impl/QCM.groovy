package com.random.randoms.impl

import com.random.randoms.Random

/**
 * Квадратичный конгруэнтный метод 
 * @author Aleh_Atsman
 */
class QCM implements Random {
	def x = Integer.MAX_VALUE,
		m = Integer.MAX_VALUE,
		a = 16807,
		c = 0,
		d = 16807;
		
	
	def random() {
		x = (d*Math.pow(x, 2) + a*x + c) % m;
		return Math.abs(x);
	}
}