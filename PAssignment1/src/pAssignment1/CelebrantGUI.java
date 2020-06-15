package pAssignment1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Locale;

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

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelebrantGUI extends JFrame {
	private ArrayList<Celebrant> celebrantData;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JLabel lname = new JLabel("first name");
	private final JTextField fnametext = new JTextField();
	private final JLabel llast = new JLabel("last name");
	private final JTextField lnametext = new JTextField();
	private final JLabel lmcel = new JLabel("marrage cele");
	private final JTextField marageceltext = new JTextField();
	private final JLabel lcivcel = new JLabel("civil cele");
	private final JTextField civelceltext = new JTextField();
	private final JLabel lcanzmem = new JLabel("canz memeber");
	private final JTextField canzmemtext = new JTextField();
	private final JLabel rescity = new JLabel("resadentual city");
	private final JTextField rescitytext = new JTextField();
	private final JLabel lage = new JLabel("age");
	private final JTextField agetext = new JTextField();
	private final JLabel lsalary = new JLabel("salary");
	private final JTextField salarytext = new JTextField();
	private final JButton bprev = new JButton("Prev");
	private final JButton bnext = new JButton("Next");
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	//gets the table to be created in the desired fassion
	private DefaultTableModel tm = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"firstName", "lastName", "MarrageCelebrant", "civilUnionCelebrant", "canzMember", "resadentualCity", "age", "salary"
			}
		);
	private JPanel contentPane;
	private int count = 0;
	
	/**
	 * Create the frame.
	 */
	public CelebrantGUI(ArrayList<Celebrant> celebrantData) {
		this.celebrantData = celebrantData;
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
		fnametext.setColumns(10);
		fnametext.setBounds(135, 30, 96, 20);
		
		panel.add(fnametext);
		llast.setBounds(46, 58, 49, 14);
		
		panel.add(llast);
		lnametext.setColumns(10);
		lnametext.setBounds(135, 55, 96, 20);
		
		panel.add(lnametext);
		lmcel.setBounds(46, 86, 65, 14);
		
		panel.add(lmcel);
		marageceltext.setColumns(10);
		marageceltext.setBounds(135, 83, 96, 20);
		
		panel.add(marageceltext);
		lcivcel.setBounds(46, 114, 49, 14);
		
		panel.add(lcivcel);
		civelceltext.setColumns(10);
		civelceltext.setBounds(135, 111, 96, 20);
		
		panel.add(civelceltext);
		lcanzmem.setBounds(46, 142, 79, 14);
		
		panel.add(lcanzmem);
		canzmemtext.setColumns(10);
		canzmemtext.setBounds(135, 139, 96, 20);
		
		panel.add(canzmemtext);
		rescity.setBounds(46, 167, 79, 14);
		
		panel.add(rescity);
		rescitytext.setColumns(10);
		rescitytext.setBounds(135, 164, 96, 20);
		
		panel.add(rescitytext);
		lage.setBounds(46, 192, 49, 14);
		
		panel.add(lage);
		agetext.setColumns(10);
		agetext.setBounds(135, 189, 96, 20);
		
		panel.add(agetext);
		lsalary.setBounds(46, 217, 49, 14);
		
		panel.add(lsalary);
		salarytext.setColumns(10);
		salarytext.setBounds(135, 214, 96, 20);
		
		panel.add(salarytext);
		
		//decreases the count when viewing the records can not go below 0
		bprev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count > 0) {
					count--;
					setDataText();		
				}
			}
		});
		bprev.setBackground(SystemColor.info);
		bprev.setBounds(46, 277, 89, 23);
		
		//increases the count number but not passed the last record number
		panel.add(bprev);
		bnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < 10046) {
					count++;
					setDataText();
				}
			}
		});
		bnext.setBackground(SystemColor.info);
		bnext.setBounds(142, 277, 89, 23);
		
		panel.add(bnext);
		panel_1.setBackground(new Color(255, 255, 240));
		
		//creating the pie graph
		setDataText();		
		DefaultPieDataset pieGraph = new DefaultPieDataset();
		for (int i = 0; i < 50; i++) {
			pieGraph.setValue(celebrantData.get(i).getFname(), celebrantData.get(i).getSalary());
		}
		
		JFreeChart pie = ChartFactory.createPieChart("Salary for each celebrant", pieGraph, true, true, Locale.ENGLISH);
		ChartPanel piePanel = new ChartPanel(pie);
		piePanel.setVisible(true);
		tabbedPane.add("Pie Chart", piePanel);
		
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
		//drawing the table and setting the fields as the data
		tm.setRowCount(0);
		for (int i = 0; i < 10046; i++) {
			Object[] object = new Object[8];
			object[0] = celebrantData.get(i).getFname();
			object[1] = celebrantData.get(i).getLname();
			object[2] = celebrantData.get(i).isMarragecelebrant();
			object[3] = celebrantData.get(i).isCivilnionceleebrant();
			object[4] = celebrantData.get(i).isCanzmember();
			object[5] = celebrantData.get(i).getResadentualcity();
			object[6] = celebrantData.get(i).getAge();
			object[7] = celebrantData.get(i).getSalary();
			tm.addRow(object);
		}
	}
	public void setDataText() {
		//sets the data to be displayed for the records
		fnametext.setText(celebrantData.get(count).getFname());
		lnametext.setText(celebrantData.get(count).getLname());
		marageceltext.setText(Boolean.toString((celebrantData.get(count).isMarragecelebrant())));
		civelceltext.setText(Boolean.toString((celebrantData.get(count).isCivilnionceleebrant())));
		canzmemtext.setText(Boolean.toString((celebrantData.get(count).isCanzmember())));
		agetext.setText(Integer.toString((celebrantData.get(count).getAge())));
		salarytext.setText(Integer.toString((celebrantData.get(count).getSalary())));
		rescitytext.setText(celebrantData.get(count).getResadentualcity());
	}
}
