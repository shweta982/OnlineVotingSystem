package Voting;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class VotingSytem extends JFrame implements ActionListener{

	VotingSytem(){
		setBounds(0,0,1600,800);
		getContentPane().setBackground(Color.cyan);
		JLabel l1=new JLabel("Welcome to");
		l1.setFont(new Font("Tahoma",Font.BOLD,50));
		l1.setBounds(100,230,300,100 );
		add(l1);
		
		JLabel l2=new JLabel("Online Voting System");
		l2.setFont(new Font("Tahoma",Font.BOLD,50));
		l2.setBounds(50,300,700,100 );
		add(l2);
		
		ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("Voting/icons/vote.jpg")); 
		Image I2=I1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
		ImageIcon I3 = new ImageIcon(I2);
		JLabel l3=new JLabel(I3);
		l3.setBounds(700,200,500,300);
		add(l3);
		
		JButton b1=new JButton("Next");
		b1.setFont(new Font("Tahoma",Font.PLAIN,20));
		b1.setBounds(150,500,250,80 );
		b1.addActionListener(this);
		add(b1);
		
		setLayout(null);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new VotingSytem();

	}


	public void actionPerformed(ActionEvent e) {
		new VotePg().setVisible(true);
		this.setVisible(false);
	}

}
