package com.test_package;
// package a importer afin d'utilser l'object File
import java.io.File;
public class Main {

	public static void main(String[] args) {
		// creation d'un object File
		File f= new File("Text3.txt");
		// affichage du chemin absolu du fichier
		System.out.println("Chemin Absolu du fichier: "+ f.getAbsolutePath());
		// affiche le nom du fichier
		System.out.println("Nom du fichier : " +f.getName());
		// l'existence du fichier
		System.out.println("Est ce que le fichier Exists : "+ f.exists());
		// verifie si c'est repertoire
		System.out.println("Est ce qu'un repertoire: " + f.isDirectory());
		// verifie si f est un fichier
		System.out.println("Est ce qu'un fichier: "+f.isFile());
		//affichage de la liste des fichier
		for(File file : f.listRoots())
		{
		System.out.println(file.getAbsolutePath());
		try {
		int i = 1;
		//On parcourt la liste des fichiers et répertoires
		for(File nom : file.listFiles()){
		//S'il s'agit d'un dossier, on ajoute un "/"
		System.out.print("\t\t" + ((nom.isDirectory()) ?
		nom.getName()+"/" : nom.getName()));
		if((i%4) == 0){
		System.out.print("\n");
		}
		i++;
		}
		
		
		
		System.out.println("\n");
		} catch (NullPointerException e) {}
		//L'instruction peut générer une NullPointerException
		//s'il n'y a pas de sous-fichier !
		
		}
		
	

	}
}
