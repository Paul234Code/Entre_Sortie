package com.test_package;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<String>();
		//ajout de 5 chaines de caracteres
		liste.add(new String("une chaine de caractere"));
		liste.add(new String("une deuxieme chaine de caractere"));
		liste.add(new String("une troisieme chaine de caractere"));
		liste.add(new String("derniere chaine de caractere"));
		// affichage des elements
		for(String str : liste)
			System.out.println(str);
		ArrayList<String> allWords = new ArrayList<String>();
		try {
			Scanner input = new Scanner(new File("texte"));
			while (input.hasNext()) {
			String word = input.next();
			allWords.add(word);
			}
			} catch (Exception e){}
		// affichage des mots du textes
		for ( String mot : allWords)
			System.out.print(mot + "");
		// affichage du texte dans l'ordre inverse des mots
		for (int i= allWords.size()-1;i>=0;i--)
			System.out.println(allWords.get(i));
		// affichage du texte et en majuscules les mots aux pluriel
		for(String mot1 :allWords)
			if(mot1.charAt(mot1.length()-1)== 's')
				System.out.println(mot1.toUpperCase()+ " ");
			else
				System.out.println(mot1 + " ");
		// affichage du texte en supprimant les mots aux pluriel
		for(String mot1 :allWords)
			if(mot1.charAt(mot1.length()-1)== 's')
				System.out.println(" ");
			else
				System.out.print(mot1 + " ");
				
			

	}

}
