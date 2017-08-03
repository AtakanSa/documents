package tr.org.linux.kamp.Documents;

import java.util.ArrayList;

public class DataFile extends BinaryFile {
	public DataFile(String name, int size, String dataCreated, String Format, ExecutableFile opensWith,
			ArrayList<Boolean> bits) {
		super(name, size, dataCreated);
		this.CompressionFormat = Format;
		this.opensWith = opensWith;
		this.bits = bits;
		// TODO Auto-generated constructor stub
	}

	private String CompressionFormat;
	private ExecutableFile opensWith;
	private ArrayList<Boolean> bits = new ArrayList<>();

	public String getCompressionFormat() {
		return CompressionFormat;
	}

	public void setCompressionFormat(String compressionFormat) {
		CompressionFormat = compressionFormat;
	}

	public ExecutableFile getOpensWith() {
		return opensWith;
	}

	public void setOpensWith(ExecutableFile opensWith) {
		this.opensWith = opensWith;
	}

	public ArrayList<Boolean> getBits() {
		return bits;
	}

	public void setBits(ArrayList<Boolean> bits) {
		this.bits = bits;
	}

	@Override
	public BinaryFile getCopy(BinaryFile BFile) {
		// TODO Auto-generated method stub
		return super.getCopy(BFile);
	}

}
