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

public class Circularqueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int r = -1;
	private int f = 0;
	private int count = 0;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circularqueue frame = new Circularqueue();
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
	public Circularqueue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CIRCULARQUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(146, 10, 279, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE LENGTH");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(53, 51, 156, 19);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setBounds(247, 53, 96, 19);
		contentPane.add(length);
		length.setColumns(10);

		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				cq = new int[len];
				size = len;
				String message = "Circular queue " + len + " created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(194, 92, 85, 21);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(53, 128, 166, 19);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setBounds(247, 130, 96, 19);
		contentPane.add(element);
		element.setColumns(10);

		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count == size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				} else {
					int elem = Integer.valueOf(element.getText());
					r = (r + 1) % size;
					cq[r] = elem;
					String message = "Element " + elem + " inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					count++;
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(400, 129, 85, 21);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("DELECT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Delection not possible");
				} else {
					String message = "Element Deleted " + cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f = (f + 1) % size;
					count--;
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(194, 198, 85, 21);
		contentPane.add(btnNewButton_2);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int f1 = f;
				String mesg = "";
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				} else {
					for (int i = 1; i <= count; i++) {
						mesg = mesg + " " + cq[f1];
						f1 = (f1 + 1) % size;
					}
				}
				displaybox.setText(mesg);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 12));
		display.setBounds(194, 247, 87, 23);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setBounds(106, 311, 319, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
