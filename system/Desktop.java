package org.system;

public class Desktop extends computer {
	public void desktopSize() {
		System.out.println("the desktop size is 36inch");
		
	}

	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.computerModel();
		a.desktopSize();

	}

}
