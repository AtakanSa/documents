package tr.org.linux.kamp.Documents;

import java.util.ArrayList;

public class HtmlFile extends TextFile implements Openable {
	public HtmlFile(String name, int size, String dataCreated, ExecutableFile browserCompatibaleWith, int HtmlVersion) {
		super(name, size, dataCreated, dataCreated, numChars);
		this.browserCompatibaleWith = browserCompatibaleWith;

		this.htmlVersion = htmlVersion;
		// TODO Auto-generated constructor stub
	}

	private ExecutableFile browserCompatibaleWith;
	private ArrayList<HtmlFile> linksTo = new ArrayList<>();
	private int htmlVersion;

	public ArrayList<HtmlFile> getLinksTo() {
		return linksTo;
	}

	public void setLinksTo(ArrayList<HtmlFile> linksTo) {
		this.linksTo = linksTo;
	}

	public ExecutableFile getBrowserCompatibaleWith() {
		return browserCompatibaleWith;
	}

	public void setBrowserCompatibaleWith(ExecutableFile browserCompatibaleWith) {
		this.browserCompatibaleWith = browserCompatibaleWith;
	}

	public int getHtmlVersion() {
		return htmlVersion;
	}

	public void setHtmlVersion(int htmlVersion) {
		this.htmlVersion = htmlVersion;
	}

}
