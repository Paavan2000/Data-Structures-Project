import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 try {
		      File soundFile = new File("C:\\Users\\paava\\Downloads\\data1.wav");
		      AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
		      Clip clip = AudioSystem.getClip();
		      clip.open(audioIn);
		      clip.start();
		    } catch (Exception e) {
		      e.printStackTrace();
		    } 
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Heading = new JLabel("Choice Data Structure");
		Heading.setForeground(new Color(255, 0, 0));
		Heading.setFont(new Font("Algerian", Font.BOLD, 20));
		Heading.setBounds(247, 46, 309, 19);
		contentPane.add(Heading);

		JButton array = new JButton("Array");
		array.setForeground(new Color(0, 128, 0));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.setBounds(350, 92, 85, 21);
		contentPane.add(array);

		JButton stack = new JButton("Stack");
		stack.setForeground(new Color(0, 128, 0));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		stack.setFont(new Font("Tahoma", Font.BOLD, 12));
		stack.setBounds(350, 152, 85, 21);
		contentPane.add(stack);

		JButton queue = new JButton("Queue");
		queue.setForeground(new Color(0, 128, 0));
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		queue.setFont(new Font("Tahoma", Font.BOLD, 12));
		queue.setBounds(350, 212, 85, 21);
		contentPane.add(queue);

		JButton circularqueue = new JButton("Circular Queue");
		circularqueue.setBackground(new Color(240, 240, 240));
		circularqueue.setForeground(new Color(0, 128, 0));
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Circularqueue().setVisible(true);
			}
		});
		circularqueue.setFont(new Font("Tahoma", Font.BOLD, 12));
		circularqueue.setBounds(350, 271, 123, 23);
		contentPane.add(circularqueue);

		JButton linkedlist = new JButton("SINGLY LINKED LIST");
		linkedlist.setBackground(new Color(255, 255, 255));
		linkedlist.setForeground(new Color(0, 128, 0));
		linkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Linkedlist().setVisible(true);
			}
		});
		linkedlist.setFont(new Font("Tahoma", Font.BOLD, 12));
		linkedlist.setBounds(350, 331, 169, 23);
		contentPane.add(linkedlist);

		JButton doublylist = new JButton("Doublylinkedlist");
		doublylist.setForeground(new Color(0, 128, 0));
		doublylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Doublylinkedlist().setVisible(true);
			}
		});
		doublylist.setFont(new Font("Tahoma", Font.BOLD, 12));
		doublylist.setBounds(350, 392, 131, 23);
		contentPane.add(doublylist);
	}
}
