package tr.org.linux.kamp.Documents;

public abstract class File {
	private String name;
	private int size;
	private String dataCreated;

	public File(String name, int size, String dataCreated) {
		super();
		this.name = name;
		this.size = size;
		this.dataCreated = dataCreated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDataCreated() {
		return dataCreated;
	}

	public void setDataCreated(String dataCreated) {
		this.dataCreated = dataCreated;
	}

	public void onClick() {
		System.out.println("clicked");
	}



}
