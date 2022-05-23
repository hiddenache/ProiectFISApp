package PkOrders;

import java.awt.BorderLayout;

import PkAdmin.AdminManagement;
import PkCustomer.CustomerPanel;
import PkCustomer.MyOrderRecords;
import PkSign.AccessMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrackOrder extends JFrame {

	private JPanel contentPane;
	private JTextField orderID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrackOrder frame = new TrackOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	int indext;
	
	public int searchOrder(String id) {
        for (int i = 0; i < OrderDetails.getOrderlist().size(); i++) {
            if (OrderDetails.getOrderlist().get(i).getOrderID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

	/**
	 * Create the frame.
	 */
	public TrackOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTrackDetails = new JLabel("Type your order ID to see the status of it!");
		lblTrackDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrackDetails.setBounds(260, 270, 198, 20);
		contentPane.add(lblTrackDetails);
			
		JLabel lblTrackYourOrder = new JLabel();
		lblTrackYourOrder.setText("Track your order");
		lblTrackYourOrder.setForeground(new Color(153, 0, 255));
		lblTrackYourOrder.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTrackYourOrder.setBounds(271, 11, 187, 49);
		contentPane.add(lblTrackYourOrder);
		
		JLabel lblNewLabel = new JLabel("Order ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(210, 109, 85, 14);
		contentPane.add(lblNewLabel);
		
		orderID = new JTextField();
		orderID.setBounds(314, 103, 144, 20);
		contentPane.add(orderID);
		orderID.setColumns(10);
		
		JButton btnTrack = new JButton("Track");
		btnTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				OrderDetails order = new OrderDetails();
//				order.setOrderID(orderID.getText());
				for(int i=0; i<OrderDetails.getOrderlist().size(); i++) {
					if(searchOrder(orderID.getText()) != -1) {
						lblTrackDetails.setText("Your order is " + OrderDetails.getOrderlist().get(i).getStatus() + "!");
					}
					else {
						JOptionPane.showMessageDialog(null, "No order with this ID", "Error Message", JOptionPane.ERROR_MESSAGE); 
					}
					indext = i;
				}		
			}
		});
		btnTrack.setBounds(282, 170, 152, 33);
		contentPane.add(btnTrack);
		
		JButton backb = new JButton();
		backb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setVisible(false);
		         AccessMenu l = new AccessMenu();
		         l.setVisible(true);
			}
		});
		backb.setText("Back");
		backb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		backb.setBounds(23, 295, 87, 33);
		contentPane.add(backb);
		
		
	}
}
