package tr.org.linux.kamp.Documents;

import java.util.ArrayList;

public class ExecutableFile extends BinaryFile {

	public ExecutableFile(String name, int size, String dataCreated, String platform, ArrayList<Byte> contents) {
		super(name, size, dataCreated);
		this.platform = platform;
		this.contents = contents;
		// TODO Auto-generated constructor stub
	}

	private String platform;
	private ArrayList<Byte> contents = new ArrayList<>();

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public ArrayList<Byte> getContents() {
		return contents;
	}

	public void setContents(ArrayList<Byte> contents) {
		this.contents = contents;
	}

}
