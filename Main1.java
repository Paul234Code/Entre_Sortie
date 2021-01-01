package com.test_package;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		// declarons  de nos objects en dehors du try/catch
		FileInputStream fis= null;
		FileOutputStream fos= null;
		//on instancie nos objects dans le bloc Try
		try{
			// fis va lire le fichier
			// fos va ecrire dans le nouveau fichier
			
			fis= new FileInputStream(new File("Text3.txt"));
			fos = new FileOutputStream(new File("Text2.txt"));
			// on cree un tableau de Bytes pour indiquer le nombre de bytes lu a chaque tours de boucle
			byte [] buffer= new byte[8];
			//variable  de type int qui va stocker le nombre de bytes lu
			int NbreByte;
			while((NbreByte = fis.read(buffer)) >=0) {
				// on ecrit dans notre fichier destination avec l'object fos
				fos.write(buffer);
				// affichage de ce qu'on a lu au format bytes et char
				for( byte bit :buffer) {
					System.out.println("bite: "+ bit +" format char: ( " + (char)bit + " ) ");
				System.out.println(" ");
					
			}
				//Nous réinitialisons le buffer à vide
				//au cas où les derniers byte lus ne soient pas un multiple de 8
				//Ceci permet d'avoir un buffer vierge à chaque lecture
				//et ne pas avoir de doublon en fin de fichier
				 buffer = new byte[8];
			
		}
			System.out.println("Copie terminée !");
		

	}catch(FileNotFoundException e) {
		// exception leve si FileInputStream ne trouve pas aucun fichier
		e.printStackTrace();
	}catch(IOException e) {
		// celle ci se produit s'il ya erreur de lecture ou d'ecriture
		e.printStackTrace();
	}
	finally {
		// on ferme nos flux de donnees dans un bloc finally pour s'assurer que 
		// que ces instructions seront exécutées dans tous les cas
		//meme si une exception est levée !
		try {
			if (fis!=null)
				fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		try {
		if (fos!=null)
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();;
		}
	}

}
}
