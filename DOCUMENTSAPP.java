package tr.org.linux.kamp.Documents;

import java.util.ArrayList;

public class DOCUMENTSAPP {

	public static void main(String[] args) {
		ArrayList<Byte> contents = new ArrayList<>();
		ArrayList<HtmlFile> pages = new ArrayList<>();
		ArrayList<Boolean> bits = new ArrayList<>();
		contents.add((byte) 1);

		ExecutableFile exefile = new ExecutableFile("firefox", 2, "1.1.1", "linux", contents);
		HtmlFile htmlfile = new HtmlFile("Home", 1, "1.1.1", exefile, 10);
		HtmlFile htmlfile2 = new HtmlFile("Contacts", 1, "1.1.1", exefile, 10);
		pages.add(htmlfile);
		pages.add(htmlfile2);
		htmlfile.setLinksTo(pages);

		bits.add(false);
		bits.add(true);

		DataFile dFile = new DataFile("Moneys", 2, "1.1.1", "PDF", exefile, bits);
		System.out.println(dFile.getSize());
		DataFile dFile2 = new DataFile("Killers", 4, "1.1.1", "PDF", exefile, bits);
		DataFile dFile3 = new DataFile("Heroes", 5, "1.1.1", "PDF", exefile, bits);

		dFile3 = (DataFile) dFile.getCopy(dFile2);

		System.out.println(dFile3.getSize());
		
		dFile3.onClick();
	}

}
