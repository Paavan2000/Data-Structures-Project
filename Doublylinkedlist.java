
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
import java.awt.Color;

public class Doublylinkedlist extends JFrame {
	class Node {
		int data;
		Node prelink;
		Node nextlink;
	}

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField display;
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doublylinkedlist frame = new Doublylinkedlist();
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
	public Doublylinkedlist() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 564, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(98, 10, 313, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(40, 50, 180, 13);
		contentPane.add(lblNewLabel_1);

		elementrear = new JTextField();
		elementrear.setBounds(230, 49, 96, 19);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
			//Play it once.

		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(elementrear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
					String message = "Element " + elem + " inserted sucessfully";
					JOptionPane.showMessageDialog(contentPane, message);
					elementrear.setText("");
				} else {
					Node temp;
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prelink = temp;
					String message = "Element " + elem + " inserted sucessfully";
					JOptionPane.showMessageDialog(contentPane, message);
					elementrear.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(358, 48, 125, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(40, 95, 166, 19);
		contentPane.add(lblNewLabel_2);

		elementfront = new JTextField();
		elementfront.setBounds(230, 97, 96, 19);
		contentPane.add(elementfront);
		elementfront.setColumns(10);

		JButton front = new JButton("INSERT FRONT");
		front.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int elem = Integer.valueOf(elementfront.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
					String message = "Element " + elem + " inserted sucessfully";
					JOptionPane.showMessageDialog(contentPane, message);
					elementfront.setText("");
				} else {
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
					String message = "Element " + elem + " inserted sucessfully";
					JOptionPane.showMessageDialog(contentPane, message);
					elementfront.setText("");
				}
			}
		});
		front.setFont(new Font("Tahoma", Font.BOLD, 12));
		front.setBounds(358, 94, 125, 23);
		contentPane.add(front);

		JButton delectrear = new JButton("DELECT REAR");
		delectrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Delecting not possible");
				} else if (first.nextlink == null) {
					String message = "Deleted element is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				}else {
				Node temp = first;
				while (temp.nextlink.nextlink != null) {
					temp = temp.nextlink;
				}
				String message = "Deleted element is " + temp.nextlink.data;
				JOptionPane.showMessageDialog(contentPane, message);
				temp.nextlink = null;
			}
			}
		});
		delectrear.setFont(new Font("Tahoma", Font.BOLD, 12));
		delectrear.setBounds(230, 138, 145, 23);
		contentPane.add(delectrear);

		JButton delectfront = new JButton("DELECT FRONT");
		delectfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Delecting not possible");
				} else if (first.nextlink == null) {
					String message = "Deleted element is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				} else {
					String message = "Deleted element is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		delectfront.setFont(new Font("Tahoma", Font.BOLD, 12));
		delectfront.setBounds(230, 171, 123, 23);
		contentPane.add(delectfront);

		JButton displayfarword = new JButton("DISPLAY FORWORD");
		displayfarword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mesg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				} else if (first.nextlink == null) {
					String str=String.valueOf(first.data);
					display.setText(str);
				} else {
					Node temp = first;
					while (temp != null) {
						mesg = mesg + " " + temp.data;
						temp = temp.nextlink;
					}
				}
				display.setText(mesg);
			}
		});
		displayfarword.setFont(new Font("Tahoma", Font.BOLD, 12));
		displayfarword.setBounds(230, 204, 155, 23);
		contentPane.add(displayfarword);

		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mesg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				} else if (first.nextlink == null) {
					String str=String.valueOf(first.data);
					display.setText(str);
				} else {
					Node temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					while (temp != null) {
						mesg = mesg + " " + temp.data;
						temp = temp.prelink;
					}
				}
				display.setText(mesg);
			}
		});
		displayreverse.setFont(new Font("Tahoma", Font.BOLD, 12));
		displayreverse.setBounds(230, 237, 155, 23);
		contentPane.add(displayreverse);

		display = new JTextField();
		display.setBounds(143, 270, 328, 19);
		contentPane.add(display);
		display.setColumns(10);
	}
}
