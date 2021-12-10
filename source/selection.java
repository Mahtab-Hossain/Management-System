import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.JPanel;
public class selection extends JFrame{

		JButton b1,b2,b3;

		selection(){
			Font f=new Font("Arial",Font.BOLD,20);
			b1=new JButton("User Login");
			b2=new JButton("Staff Login");
			b3=new JButton("Admin Login");

			b1.setBounds(400,200,300,50);
			b2.setBounds(400,300,300,50);
			b3.setBounds(400,400,300,50);
			

			b1.setBackground(Color.BLACK);
			b1.setFont(f);

			b2.setBackground(Color.GRAY);
			b2.setFont(f);

			b3.setBackground(Color.GRAY);
			b3.setFont(f);
	
			add(b1);
			add(b2);
			add(b3);
			setLayout(null);
			setVisible(true);
			setSize(1080,720);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					Slogin sl = new Slogin();
					setVisible(false);
				}
			});
		}
}