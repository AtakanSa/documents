package tr.org.linux.kamp.Documents;

public abstract class BinaryFile extends File {
	public BinaryFile(String name, int size, String dataCreated) {
		super(name, size, dataCreated);
		// TODO Auto-generated constructor stub
	}

	public BinaryFile getCopy(BinaryFile BFile) {
		BinaryFile copyFile = BFile;

		return copyFile;
	}

	
	
	
}
