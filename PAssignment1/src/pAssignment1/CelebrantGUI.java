package pAssignment1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class CelebrantGUI extends JFrame {
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JLabel lname = new JLabel("first name");
	private final JTextField textField = new JTextField();
	private final JLabel llast = new JLabel("last name");
	private final JTextField textField_1 = new JTextField();
	private final JLabel lmcel = new JLabel("marrage cele");
	private final JTextField textField_2 = new JTextField();
	private final JLabel lcivcel = new JLabel("civil cele");
	private final JTextField textField_3 = new JTextField();
	private final JLabel lcanzmem = new JLabel("canz memeber");
	private final JTextField textField_4 = new JTextField();
	private final JLabel rescity = new JLabel("resadentual city");
	private final JTextField textField_5 = new JTextField();
	private final JLabel lage = new JLabel("age");
	private final JTextField textField_6 = new JTextField();
	private final JLabel lsalary = new JLabel("salary");
	private final JTextField textField_7 = new JTextField();
	private final JButton bprev = new JButton("Prev");
	private final JButton bnext = new JButton("Next");
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private DefaultTableModel tm = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"firstName", "lastName", "MarrageCelebrant", "civilUnionCelebrant", "canzMember", "resadentualCity", "age", "salary"
			}
		);

	
	/**
	 * Create the frame.
	 */
	public CelebrantGUI() {
		getContentPane().setBackground(SystemColor.info);
		setTitle("Celebrant Regester");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		tabbedPane.setBackground(SystemColor.info);
		tabbedPane.setBounds(33, 11, 612, 384);
		
		getContentPane().add(tabbedPane);
		panel.setBackground(new Color(255, 255, 240));
		
		tabbedPane.addTab("Celebrant Records", null, panel, null);
		panel.setLayout(null);
		lname.setBounds(46, 32, 50, 14);
		
		panel.add(lname);
		textField.setColumns(10);
		textField.setBounds(135, 30, 96, 20);
		
		panel.add(textField);
		llast.setBounds(46, 58, 49, 14);
		
		panel.add(llast);
		textField_1.setColumns(10);
		textField_1.setBounds(135, 55, 96, 20);
		
		panel.add(textField_1);
		lmcel.setBounds(46, 86, 65, 14);
		
		panel.add(lmcel);
		textField_2.setColumns(10);
		textField_2.setBounds(135, 83, 96, 20);
		
		panel.add(textField_2);
		lcivcel.setBounds(46, 114, 49, 14);
		
		panel.add(lcivcel);
		textField_3.setColumns(10);
		textField_3.setBounds(135, 111, 96, 20);
		
		panel.add(textField_3);
		lcanzmem.setBounds(46, 142, 79, 14);
		
		panel.add(lcanzmem);
		textField_4.setColumns(10);
		textField_4.setBounds(135, 139, 96, 20);
		
		panel.add(textField_4);
		rescity.setBounds(46, 167, 79, 14);
		
		panel.add(rescity);
		textField_5.setColumns(10);
		textField_5.setBounds(135, 164, 96, 20);
		
		panel.add(textField_5);
		lage.setBounds(46, 192, 49, 14);
		
		panel.add(lage);
		textField_6.setColumns(10);
		textField_6.setBounds(135, 189, 96, 20);
		
		panel.add(textField_6);
		lsalary.setBounds(46, 217, 49, 14);
		
		panel.add(lsalary);
		textField_7.setColumns(10);
		textField_7.setBounds(135, 214, 96, 20);
		
		panel.add(textField_7);
		bprev.setBackground(SystemColor.info);
		bprev.setBounds(46, 277, 89, 23);
		
		panel.add(bprev);
		bnext.setBackground(SystemColor.info);
		bnext.setBounds(142, 277, 89, 23);
		
		panel.add(bnext);
		panel_1.setBackground(new Color(255, 255, 240));
		
		tabbedPane.addTab("table", null, panel_1, null);
		panel_1.setLayout(null);
		scrollPane.setBounds(86, 67, 421, 219);
		
		panel_1.add(scrollPane);
		table.setModel(tm);
		scrollPane.setViewportView(table);
		panel_2.setBackground(new Color(255, 255, 240));
		drawTable();
		
		tabbedPane.addTab("New tab", null, panel_2, null);
		contentPane.setLayout(null);
	}
	
	public void drawTable() {
		ArrayList<Celebrant> celebrant = new ArrayList<Celebrant>() ;
		tm.setRowCount(0);
		for (int i = 0; i < celebrant.size(); i++) {
			Object[] object = new Object[8];
			object[0] = celebrant.get(i).getFname();
			object[1] = celebrant.get(i).getLname();
			object[2] = celebrant.get(i).isMarragecelebrant();
			object[3] = celebrant.get(i).isCivilnionceleebrant();
			object[4] = celebrant.get(i).isCanzmember();
			object[5] = celebrant.get(i).getResadentualcity();
			object[6] = celebrant.get(i).getAge();
			object[7] = celebrant.get(i).getSalary();
			tm.addRow(object);
		}
	}
}
