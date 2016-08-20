package Calculator;
import javax.swing.*;
public class Main {
	public static void main(String[] args){
		Gui g = new Gui();
		g.setSize(250, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
	}

	private static void setDefaultCloseOperation(int disposeOnClose) {
		// TODO Auto-generated method stub
		
	}
}
