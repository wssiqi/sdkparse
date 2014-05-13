package com.siqi.demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class TreeDemo2 {
	public TreeDemo2() {
		JFrame f = new JFrame("TreeDemo2");
		Container contentPane = f.getContentPane();

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("�YԴ������");
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("�ҵĹ��İ�");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("�ҵ���X");
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("�ղ؊A");
		DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("Readme");
		root.add(node1);
		root.add(node2);
		root.add(node3);
		root.add(node4);

		DefaultMutableTreeNode leafnode = new DefaultMutableTreeNode("��˾�ļ�");
		node1.add(leafnode);
		leafnode = new DefaultMutableTreeNode("˽���ļ�");
		node1.add(leafnode);
		leafnode = new DefaultMutableTreeNode("�����ż�");

		leafnode = new DefaultMutableTreeNode("���C�űP(C:)");
		node2.add(leafnode);
		leafnode = new DefaultMutableTreeNode("���C�űP(D:)");
		node2.add(leafnode);
		leafnode = new DefaultMutableTreeNode("���C�űP(E:)");
		node2.add(leafnode);

		DefaultMutableTreeNode node31 = new DefaultMutableTreeNode("�Wվ�б�");
		node3.add(node31);

		leafnode = new DefaultMutableTreeNode("��Ħվ");
		node31.add(leafnode);
		leafnode = new DefaultMutableTreeNode("����Ϣ");
		node31.add(leafnode);
		leafnode = new DefaultMutableTreeNode("�W�j����");
		node31.add(leafnode);

		JTree tree = new JTree(root);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(tree);

		contentPane.add(scrollPane);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new TreeDemo2();
	}
}
