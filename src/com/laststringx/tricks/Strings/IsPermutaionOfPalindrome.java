package com.laststringx.tricks.Strings;

import javax.swing.text.Position.Bias;

public class IsPermutaionOfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutaionOfPalindrome("abac"));

	}

	static boolean isPermutaionOfPalindrome(String str) {
		int bitVector = createBitVector(str);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);

	}

	private static boolean checkExactlyOneBitSet(int bitVector) {
		// TODO Auto-generated method stub
		return (bitVector & (bitVector - 1)) == 0;
	}

	private static int createBitVector(String str) {
		// TODO Auto-generated method stub
		int bitVictor = 0;
		for (Character ch : str.toCharArray()) {
			int x = ch - 'a';
			bitVictor = toggle(bitVictor, x);
		}
		return bitVictor;

	}

	private static int toggle(int bitVictor, int x) {
		// TODO Auto-generated method stub
		if (x < 0)
			return bitVictor;
		int mask = 1 << x;
		if ((bitVictor & mask) == 0) {
			bitVictor |= mask;
		} else {
			bitVictor &= ~mask;
		}
		return bitVictor;
	}

}
