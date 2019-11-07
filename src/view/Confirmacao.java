package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import controller.Controller;
import model.Carrinho;
import model.CheckBoxes;
import model.PaymentMethod;

import org.eclipse.swt.widgets.Label;

public class Confirmacao {

	protected Shell shell;
	private Controller c;

	public Confirmacao(Controller c) {
		this.c = c;
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 
	public static void main(String[] args) {
		try {
			// start models
			CheckBoxes model = new CheckBoxes();
			Carrinho carrinho = new Carrinho();
			PaymentMethod pm = new PaymentMethod();

			// start interface
			// Payment p = new Payment();

			// start controllers
			Controller c = new Controller(model, carrinho, pm);

			// start view
			Confirmacao confirmacaoTela = new Confirmacao(c);
			List list = new List(c);

			// link controller
			c.addScreenConfirmacao(confirmacaoTela);

			// start program
			confirmacaoTela.open("aaaaaaaa", "aaaaaa");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 * 
	 * @param string2
	 * @param string
	 */
	public void open(String string, String string2) {
		Display display = Display.getDefault();
		string = "Nome: " + string;
		string2 = "Valores: " + string2;
		createContents(string, string2);
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
	 * 
	 * @param string2
	 * @param string
	 */
	protected void createContents(String string, String string2) {
		shell = new Shell();
		shell.setSize(1280, 1024);
		shell.setText("SWT Application");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.pay();
				shell.close();
			}
		});
		btnNewButton.setBounds(10, 10, 643, 42);
		btnNewButton.setText("FINALIZAR");

		Label nomes = new Label(shell, SWT.NONE);
		nomes.setText(string);
		nomes.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		nomes.setBounds(10, 58, 1142, 42);

		Label total = new Label(shell, SWT.NONE);
		total.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		total.setBounds(10, 106, 1142, 42);
		total.setText(string2);

		Button bt1 = new Button(shell, SWT.RADIO);
		bt1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.changePaymentMethod(1);
			}
		});
		bt1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt1.setBounds(10, 154, 448, 42);
		bt1.setText("Debito");

		Button bt2 = new Button(shell, SWT.RADIO);
		bt2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.changePaymentMethod(2);
			}
		});
		bt2.setText("Credito");
		bt2.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt2.setBounds(10, 202, 448, 42);

		Button bt3 = new Button(shell, SWT.RADIO);
		bt3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.changePaymentMethod(3);
			}
		});
		bt3.setText("Boleto Bancario");
		bt3.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt3.setBounds(10, 250, 448, 42);

		Button bt4 = new Button(shell, SWT.RADIO);
		bt4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				c.changePaymentMethod(4);
			}
		});
		bt4.setText("Paypal");
		bt4.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		bt4.setBounds(10, 298, 448, 42);

	}
}
