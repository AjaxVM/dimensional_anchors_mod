package com.ajaxvm.dimensional_anchors.utils;

public class Common {
	public static String capitalizeWords (String s) {
		String[] words = s.split("\\s");

		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
		}

		return String.join(" ", words);
	}
}