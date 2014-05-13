package com.siqi.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

public class AppMain {
	public static void main(String[] args) {
		Shell shell = new Shell();
		shell.setSize(600, 400);

		shell.setLayout(new FillLayout());

		Composite container = new Composite(shell, SWT.BORDER);
		container.setLayout(new FillLayout());

		Tree tree = new Tree(container, SWT.CHECK);
		TreeColumn treeColumn = new TreeColumn(tree, SWT.NONE);
		treeColumn.setText("tes");
		treeColumn.setWidth(100);

		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);

		TreeItem treeItem = new TreeItem(tree, SWT.NONE);
		treeItem.setText("test");

		shell.open();

		while (!shell.isDisposed()) {
			if (!shell.getDisplay().readAndDispatch()) {
				shell.getDisplay().sleep();
			}
		}

	}
}
