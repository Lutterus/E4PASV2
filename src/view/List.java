package view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

import controller.Controller;
import model.Carrinho;
import model.CheckBoxes;
import model.PaymentMethod;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class List {

	protected Shell shell;
	private Controller c;

	public List(Controller c) {
		this.c = c;
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 * @wbp.parser.entryPoint
	 * 
	 
	public static void main(String[] args) {
		// start
		CheckBoxes model = new CheckBoxes();
		Carrinho carrinho = new Carrinho();
		PaymentMethod pm = new PaymentMethod();

		// start interface //Payment p = new Payment();

		// start
		Controller c = new Controller(model, carrinho, pm);

		// start view
		Confirmacao confirmacaoTela = new Confirmacao(c);
		List list = new List(c);

		// link controller
		c.addScreenConfirmacao(confirmacaoTela);

		// start program
		list.open();
	}*/

	/**
	 * Open the window.
	 * 
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents(c);
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents(Controller c) {
		shell = new Shell();
		shell.setSize(897, 736);
		shell.setText("SWT Application");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.button();
				shell.close();
			}
		});
		btnNewButton.setBounds(10, 10, 861, 42);
		btnNewButton.setText("COMPRAR");

		Label image1 = new Label(shell, SWT.NONE);
		image1.setImage(SWTResourceManager
				.getImage("C:\\Users\\Joao\\Documents\\projetos\\trabalhos\\E4PASV2\\assets\\81YBMaJlCpL._SX425_.jpg"));
		image1.setBounds(10, 72, 200, 200);

		Label nome1 = new Label(shell, SWT.NONE);
		nome1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome1.setBounds(216, 72, 231, 49);
		nome1.setText("Guilds of Ravnica");

		Label valor1 = new Label(shell, SWT.NONE);
		valor1.setText("582,99");
		valor1.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor1.setBounds(216, 127, 231, 49);

		Button check1 = new Button(shell, SWT.CHECK);
		check1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check1();
			}
		});
		check1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check1.setBounds(216, 182, 231, 49);
		check1.setText("Adicionar ao carrinho");

		Label image2 = new Label(shell, SWT.NONE);
		image2.setImage(SWTResourceManager
				.getImage("C:\\Users\\Joao\\Documents\\projetos\\trabalhos\\E4PASV2\\assets\\819RjgaYFfL._SX425_.jpg"));
		image2.setBounds(10, 278, 200, 200);

		Label nome2 = new Label(shell, SWT.NONE);
		nome2.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome2.setBounds(216, 278, 231, 49);
		nome2.setText("Ravnica Allegiance");

		Label valor2 = new Label(shell, SWT.NONE);
		valor2.setText("548,90");
		valor2.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor2.setBounds(216, 333, 231, 49);

		Button check2 = new Button(shell, SWT.CHECK);
		check2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check2();
			}
		});
		check2.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check2.setBounds(216, 388, 231, 49);
		check2.setText("Adicionar ao carrinho");

		Label image3 = new Label(shell, SWT.NONE);
		image3.setImage(SWTResourceManager.getImage(
				"C:\\Users\\Joao\\Documents\\projetos\\trabalhos\\E4PASV2\\assets\\81FiGpIjEEL._SL1500_ .jpg"));
		image3.setBounds(453, 72, 200, 200);

		Label nome3 = new Label(shell, SWT.NONE);
		nome3.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome3.setBounds(657, 72, 231, 49);
		nome3.setText("War Of The Spark");

		Label valor3 = new Label(shell, SWT.NONE);
		valor3.setText("613,99");
		valor3.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor3.setBounds(657, 127, 231, 49);

		Button check3 = new Button(shell, SWT.CHECK);
		check3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check3();

			}
		});
		check3.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check3.setBounds(657, 182, 231, 49);
		check3.setText("Adicionar ao carrinho");

		Label image4 = new Label(shell, SWT.NONE);
		image4.setImage(SWTResourceManager
				.getImage("C:\\Users\\Joao\\Documents\\projetos\\trabalhos\\E4PASV2\\assets\\81PLaKLB-0L._SX425_.jpg"));
		image4.setBounds(453, 278, 200, 200);

		Label nome4 = new Label(shell, SWT.NONE);
		nome4.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome4.setBounds(655, 278, 231, 49);
		nome4.setText("Throne Of Eldraine");

		Label valor4 = new Label(shell, SWT.NONE);
		valor4.setText("598,99");
		valor4.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor4.setBounds(655, 333, 231, 49);

		Button check4 = new Button(shell, SWT.CHECK);
		check4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check4();
			}
		});
		check4.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check4.setBounds(657, 388, 231, 49);
		check4.setText("Adicionar ao carrinho");

		Label image5 = new Label(shell, SWT.NONE);
		image5.setImage(SWTResourceManager
				.getImage("C:\\Users\\Joao\\Documents\\projetos\\trabalhos\\E4PASV2\\assets\\en169war.jpg"));
		image5.setBounds(47, 484, 143, 200);

		Label nome5 = new Label(shell, SWT.NONE);
		nome5.setText("Nissa, Abaladora do Mundo");
		nome5.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome5.setBounds(196, 484, 251, 49);

		Label valor5 = new Label(shell, SWT.NONE);
		valor5.setText("200,00");
		valor5.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor5.setBounds(196, 539, 231, 49);

		Button check5 = new Button(shell, SWT.CHECK);
		check5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check5();
			}
		});
		check5.setText("Adicionar ao carrinho");
		check5.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check5.setBounds(196, 594, 231, 49);

		Label image6 = new Label(shell, SWT.NONE);
		image6.setImage(SWTResourceManager
				.getImage("C:\\Users\\Joao\\Documents\\projetos\\trabalhos\\E4PASV2\\assets\\en42rna.jpg"));
		image6.setBounds(453, 484, 143, 200);

		Label nome6 = new Label(shell, SWT.NONE);
		nome6.setText("Manipulacao em Massa");
		nome6.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		nome6.setBounds(602, 484, 251, 49);

		Label valor6 = new Label(shell, SWT.NONE);
		valor6.setText("5,00");
		valor6.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor6.setBounds(602, 539, 231, 49);

		Button check6 = new Button(shell, SWT.CHECK);
		check6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.check6();
			}
		});
		check6.setText("Adicionar ao carrinho");
		check6.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		check6.setBounds(602, 594, 231, 49);
	}
}
