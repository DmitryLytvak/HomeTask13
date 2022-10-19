package ua.ithillel.java;

import ua.ithillel.java.controller.FileNavigator;
import ua.ithillel.java.model.FileData;

public class Main {
	
	public static void main(String[] args) {
		
		FileNavigator fileNavigator = new FileNavigator();
		fileNavigator.add("./file/", new FileData("file.txt", 200, "./file/"));
		fileNavigator.add("./file/", new FileData("log.txt", 700, "./file/"));
		fileNavigator.add("./file/", new FileData("config.txt", 600, "./file/"));
		fileNavigator.add("./file/file1/", new FileData("myFile.txt", 200, "./file/"));
		fileNavigator.add("./file/", new FileData("logistic.txt", 500, "./file/"));
		fileNavigator.add("./file/newFile/", new FileData("logistic.txt", 300, "./file/newFile/"));
		
		System.out.println(fileNavigator.sortBySize());
		
		System.out.println(fileNavigator);
		System.out.println(fileNavigator.find("./file/"));
		System.out.println(fileNavigator.sortBySize());
		System.out.println(fileNavigator.filterBySize(500));
		fileNavigator.remove("./file/");
		System.out.println(fileNavigator);
	}
}
	

