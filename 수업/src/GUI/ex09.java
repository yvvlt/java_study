package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex09 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 3");
			
			
			this.setLayout(new FlowLayout());
			
			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10,10);
			this.add(txt);
			this.add(area);
			
			txt.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					int key = e.getKeyCode();
					
					if(key == KeyEvent.VK_ENTER) {
						String str = txt.getText();
						area.setText(area.getText() + str + '\n');
						txt.setText("");
					}
					
					
					if(!(key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9)) {
						String str = txt.getText();
						int strlen = str.length();
						if(strlen !=0)
							txt.setText(str.substring(0, strlen-1));
					}
				}
			});
			
			
			
			setSize(200,200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
