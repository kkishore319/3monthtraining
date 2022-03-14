package com.test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWordFromSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a sentence..");
		String sent = sc.nextLine();
		LongestWordFromSentence l = new LongestWordFromSentence();
		System.out.println(l.LongestWord(sent));

		sc.close();
	}

	public String LongestWord(String sen) {
		String newsen = sen.replaceAll("[^a-zA-Z0-9]", " ");

		return Arrays.stream(newsen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();

	}

}
