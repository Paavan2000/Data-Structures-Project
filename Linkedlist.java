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

public class Linkedlist extends JFrame {
	class Node {
		int data;
		Node link;
	}

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField displaybox;
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Linkedlist frame = new Linkedlist();
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
	public Linkedlist() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 558, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(118, 10, 308, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(32, 51, 166, 19);
		contentPane.add(lblNewLabel_1);

		elementrear = new JTextField();
		elementrear.setBounds(239, 53, 96, 19);
		contentPane.add(elementrear);
		elementrear.setColumns(10);

		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(elementrear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
					String message = "Element " + elem + " inserted at rear";
					JOptionPane.showMessageDialog(contentPane, message);
					elementrear.setText("");
				} else {
					Node temp = first;
					while (temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
					String message = "Element " + elem + " inserted at rear";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				elementrear.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(385, 52, 137, 21);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(32, 120, 166, 19);
		contentPane.add(lblNewLabel_1_1);

		elementfront = new JTextField();
		elementfront.setColumns(10);
		elementfront.setBounds(239, 122, 96, 19);
		contentPane.add(elementfront);

		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(elementfront.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
					String message = "Element " + elem + " inserted at front";
					JOptionPane.showMessageDialog(contentPane, message);
					elementfront.setText("");
				} else {
					newnode.link = first;
					first = newnode;
					String message = "Element " + elem + " Inserted sucessfully";
					JOptionPane.showMessageDialog(contentPane, message);
					elementfront.setText("");
				}
			}
		});
		btnInsertFront.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInsertFront.setBounds(385, 121, 137, 21);
		contentPane.add(btnInsertFront);

		JButton delectrear = new JButton("DELECT REAR");
		delectrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Delection not possible");
				} else if (first.link == null) {
					String message = "Element Deleted " + first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				} else {
					Node temp = first;
					while (temp.link.link != null) {
						temp = temp.link;
					}
					String message = "Deleted element " + temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link = null;
				}
			}
		});
		delectrear.setFont(new Font("Tahoma", Font.BOLD, 15));
		delectrear.setBounds(215, 169, 139, 27);
		contentPane.add(delectrear);

		JButton delectfront = new JButton("DELECT FRONT");
		delectfront.setFont(new Font("Tahoma", Font.BOLD, 15));
		delectfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Delection not possible");
				} else if (first.link == null) {
					String message = "Element Deleted " + first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				} else {
					String message = "Element Deleted at " + first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = first.link;
				}
			}
		});
		delectfront.setBounds(215, 221, 151, 27);
		contentPane.add(delectfront);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mesg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				} else if (first.link == null) {
					String res = String.valueOf(first.data);
					displaybox.setText(res);
				} else {
					Node temp = first;
					while (temp != null) {
						mesg = mesg + " " + temp.data;
						temp = temp.link;
					}
				}
				displaybox.setText(mesg);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 15));
		display.setBounds(250, 272, 116, 27);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setBounds(107, 309, 359, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
