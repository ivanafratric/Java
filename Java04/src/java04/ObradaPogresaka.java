package java04;

import javax.swing.JOptionPane;

public class ObradaPogresaka {

	public static void main(String[] args) {

		int i=0;
		while(true) {
			try {
				i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}
		
		System.out.println(i);
		
	}

}
