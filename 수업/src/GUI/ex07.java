package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ex07 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 1");
			
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("버튼1");
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					btn1.setBackground(Color.RED);
				}
			});
			btn1.setBounds(50,50,70,60);
			this.add(btn1);
			
			
			setSize(200,200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}


