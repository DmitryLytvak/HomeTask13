package ua.ithillel.java.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ua.ithillel.java.model.FileData;

public class FileNavigator {
	
	public Map<String, List<FileData>> listMap = new HashMap<>();
	
	public void add(String pathToFile, FileData data) {
		if (data.getPathToFile() == null) {
			System.out.println("PathToFile missing");
		} else {
			if (!data.getPathToFile().equals(pathToFile)) {
				System.out.println("Key and PathToFile different!");
				System.out.printf("Key %s \n FileDate: {name: %s, size: %s, pathToFile:%s}\n",
						pathToFile, data.getNameFile(), data.getSizeFile(), data.getPathToFile());
			} else {
				listMap.putIfAbsent(pathToFile, new ArrayList<>());
				listMap.get(data.getPathToFile()).add(data);
			}
		}
	}
	
	public List<FileData> find(String pathToFile) {
		return listMap.get(pathToFile);
	}
	
	public List<FileData> filterBySize(int maxSize) {
		List<FileData> listData = new ArrayList<>();
		for (List<FileData> value : listMap.values()) {
			listData.addAll(value);
		}
		List<FileData> newSize = new ArrayList<>();
		for (FileData data : listData) {
			if (data.getSizeFile() <= maxSize) {
				newSize.add(data);
			}
		}
		return newSize;
		
	}
	
	public void remove(String pathToFile) {
		listMap.remove(pathToFile, listMap.get(pathToFile));
	}
	
	public List<FileData> sortBySize() {
		List<FileData> listSortBySize = new ArrayList<>();
		for (List<FileData> value : listMap.values()) {
			listSortBySize.addAll(value);
		}
		return listSortBySize.stream()
				.sorted(Comparator.comparing(FileData::getSizeFile)).toList();
	}
	
	@Override
	public String toString() {
		return "FileNavigator{" +
				"listMap=" + listMap +
				'}';
	}
	
}
