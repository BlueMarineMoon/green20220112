package org.comstudy21.ex06;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class R {
	public static JTable table;
	public static DefaultTableModel tbModel;
	public static JScrollPane scrollPane;
	
	public static Vector data;
	public static Vector<String> columnNames;
	
//	public static Object[][] data;
//	public static Object[] columnNames;
	
	public static final JTextField txtFld1 = new JTextField(6);
	public static final JTextField txtFld2 = new JTextField(6);
	public static final JTextField txtFld3 = new JTextField(6);
	public static final JTextField txtFld4 = new JTextField(6);
	
	public static final JButton allBtn = new JButton("전체");
	public static final JButton inputBtn = new JButton("입력");
	public static final JButton searchBtn = new JButton("검색");
	public static final JButton modifyBtn = new JButton("수정");
	public static final JButton deleteBtn = new JButton("삭제");
	public static final JButton finishBtn = new JButton("종료");
	
	public static final SaramDao dao = new SaramDao();
}
