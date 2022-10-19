package ua.ithillel.java.model;

public class FileData {
	
	private String name;
	private int size;
	private String pathToFile;
	
	public FileData(String name, int size, String pathToFile) {
		this.name = name;
		this.size = size;
		this.pathToFile = pathToFile;
	}
	
	@Override
	public String toString() {
		return "FileData{" +
				"nameFile='" + name + '\'' +
				", sizeFile=" + size +
				", pathToFile='" + pathToFile + '\'' +
				'}' + "\n";
	}
	
	public String getNameFile() {
		return name;
	}
	
	public void setNameFile(String nameFile) {
		this.name = nameFile;
	}
	
	public int getSizeFile() {
		return size;
	}
	
	public void setSizeFile(int sizeFile) {
		this.size = sizeFile;
	}
	
	public String getPathToFile() {
		return pathToFile;
	}
	
	public void setPathToFile(String pathToFile) {
		this.pathToFile = pathToFile;
	}
}
