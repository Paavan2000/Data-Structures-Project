import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField display;
	private int q[];
	private int r = -1;
	private int f = 0;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Queue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 647, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Heading = new JLabel("QUEUE DATA STRUCTURE");
		Heading.setForeground(new Color(255, 0, 0));
		Heading.setFont(new Font("Tahoma", Font.BOLD, 20));
		Heading.setBounds(196, 10, 271, 25);
		contentPane.add(Heading);

		JLabel lblNewLabel = new JLabel("ENTER THE LENGTH");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(142, 72, 223, 25);
		contentPane.add(lblNewLabel);

		length = new JTextField();
		length.setBounds(371, 74, 96, 19);
		contentPane.add(length);
		length.setColumns(10);

		JButton CreateQueue = new JButton("CREATE");
		CreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				q = new int[len];
				size = len - 1;
				String message = "Queue size " + len + " created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		CreateQueue.setFont(new Font("Tahoma", Font.BOLD, 15));
		CreateQueue.setBounds(285, 107, 93, 27);
		contentPane.add(CreateQueue);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(122, 153, 219, 25);
		contentPane.add(lblNewLabel_1);

		element = new JTextField();
		element.setBounds(371, 157, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r == size) {
					JOptionPane.showMessageDialog(contentPane, "Insert not possible");
				} else {
					int elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					String message = "Element " + elem + " inserted ";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(485, 151, 106, 27);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("DELECT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (r == -1 || f > r) {
					JOptionPane.showMessageDialog(contentPane, "Delection not possible");
				} else {
					String message = "Element Deleted " + q[f];
					f++;
					JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(285, 186, 91, 27);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("DISPLAY");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mesg="";
				if(f>r||r==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=f;i<=r;i++) {
						mesg=mesg+" "+q[i];
					}
				}
				display.setText(mesg);
			}
		});
		btnNewButton_2.setBounds(285, 223, 117, 27);
		contentPane.add(btnNewButton_2);

		display = new JTextField();
		display.setBounds(196, 275, 290, 19);
		contentPane.add(display);
		display.setColumns(10);
	}

}
