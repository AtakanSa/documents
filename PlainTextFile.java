package tr.org.linux.kamp.Documents;

import java.util.ArrayList;

public class PlainTextFile extends TextFile implements Openable {
	public PlainTextFile(String name, int size, String dataCreated) {
		super(name, size, dataCreated, dataCreated, numChars);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<String> lines = new ArrayList<>();

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}

}
