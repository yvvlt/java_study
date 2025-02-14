package 수업;
import javax.swing.JFrame;

public class ex_08 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setTitle("GUI 연습");
			
			//
			
			setSize(500,500);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();

	}

}
