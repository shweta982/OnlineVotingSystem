package Voting;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class VotePg extends JFrame implements ActionListener {
     
	
	JButton b1,b2,b3,b4,b5;
	int a,b,c,d;
	VotePg(){
		setBounds(0,0,1600,800);
		getContentPane().setBackground(Color.white);
		
		ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("Voting/icons/bjp4.jpg")); 
		Image I2=I1.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
		ImageIcon I3 = new ImageIcon(I2);
		JLabel l1=new JLabel(I3);
		l1.setBounds(50,0,400,250);
		add(l1);
		
		ImageIcon I4=new ImageIcon(ClassLoader.getSystemResource("Voting/icons/Aam_ Aadmi_Party_Logo.jpg")); 
		Image I5=I4.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
		ImageIcon I6 = new ImageIcon(I5);
		JLabel l2=new JLabel(I6);
		l2.setBounds(900,0,400,250);
		add(l2);
		
		ImageIcon I7=new ImageIcon(ClassLoader.getSystemResource("Voting/icons/congres2.jpg")); 
		Image I8=I7.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
		ImageIcon I9 = new ImageIcon(I8);
		JLabel l3=new JLabel(I9);
		l3.setBounds(50,350,400,250);
		add(l3);
		
		ImageIcon I10=new ImageIcon(ClassLoader.getSystemResource("Voting/icons/shivsena2.png")); 
		Image I11=I10.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
		ImageIcon I12 = new ImageIcon(I11);
		JLabel l4=new JLabel(I12);
		l4.setBounds(900,350,400,250);
		add(l4);
		
		b1=new JButton("Vote");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma",Font.PLAIN,20));
		b1.setBounds(150,260,150,50 );
		add(b1);
		
		b2=new JButton("Vote");
		b2.addActionListener(this);
		b2.setFont(new Font("Tahoma",Font.PLAIN,20));
		b2.setBounds(1020,260,150,50 );
		add(b2);
		
		b3=new JButton("Vote");
		b3.addActionListener(this);
		b3.setFont(new Font("Tahoma",Font.PLAIN,20));
		b3.setBounds(150,600,150,50 );
		add(b3);
		
		b4=new JButton("Vote");
		b4.addActionListener(this);
		b4.setFont(new Font("Tahoma",Font.PLAIN,20));
		b4.setBounds(1020,600,150,50 );
		add(b4);
		
		b5=new JButton("Result");
		b5.addActionListener(this);
		b5.setFont(new Font("Tahoma",Font.PLAIN,20));
		b5.setBounds(580,300,150,50 );
		add(b5);
		
		setLayout(null);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new VotePg();

	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			a+=1;
			JOptionPane.showMessageDialog(null,"Your vote is added to BJP");
		}
		
		if(e.getSource()==b2) {
			b+=1;
			JOptionPane.showMessageDialog(null,"Your vote is added to AAM-ADMI-PARTY");
		}
		
		if(e.getSource()==b3) {
			c+=1;
			JOptionPane.showMessageDialog(null,"Your vote is added to Congress");
		}
		
		if(e.getSource()==b4) {
			d+=1;
			JOptionPane.showMessageDialog(null,"Your vote is added to Shivsena");
			
		}
		
		if(e.getSource()==b5) {
			JOptionPane.showMessageDialog(null,"\n BJP= "+a+"\n AAM-ADMI-PARTY= "+b+"\n Congress= "+c+"\n Shivsena= "+d);
		}
		
		
	}

}
