package tr.org.linux.kamp.Documents;

public class TextFile extends File implements Openable {
	public TextFile(String name, int size, String dataCreated, String encoding, long numchars) {
		super(name, size, dataCreated);
		this.encoding = encoding;
		this.numChars = numchars;
		// TODO Auto-generated constructor stub
	}

	private String encoding;
	protected static long numChars;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public long getNumChars() {
		return numChars;
	}

	public void setNumChars(long numChars) {
		this.numChars = numChars;
	}

	@Override
	public void open() {
		System.out.println("TextFile Açıldı");

	}

}
