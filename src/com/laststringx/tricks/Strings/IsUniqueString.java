package com.laststringx.tricks.Strings;

public class IsUniqueString {
	public static void main(String[] args) {
		System.out.println(isUniqueElementsInStrings("abcdf"));
	}

	static boolean isUniqueElementsInStrings(String str) {
		int check = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((check & (1 << val)) > 0) {
				return false;
			}
			check |= (1 << val);
		}

		return true;

	}
}
