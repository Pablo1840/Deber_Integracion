package unibe.edu.ec;

public class Name {
private String name;
	
	public Name (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int countCaracters() {
		return this.name.length();
	}
	
	public String reversePhrase() {
		String nameReverese="";
		for(int i=name.length() - 1;i>=0;i--) {
			nameReverese = nameReverese + name.charAt(i);
		}
		return nameReverese;
	}
}
