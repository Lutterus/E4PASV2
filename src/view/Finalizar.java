package view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class Finalizar {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Finalizar window = new Finalizar();
			window.open("$800", "algum iten, algum iten", "algum iten, algum iten", "Paypal", 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 * @param itens2 
	 * @param i 
	 */
	public void open(String value, String itens, String itens2, String method, int i) {
		Display display = Display.getDefault();
		createContents(value, itens, itens2, method, i);
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
	 * @param i 
	 * @param method 
	 * @param method 
	 * @param itens 
	 */
	protected void createContents(String value2, String itens2, String itens3, String method2, int i) {
		shell = new Shell();
		shell.setSize(593, 432);
		shell.setText("SWT Application");
		
		Label info = new Label(shell, SWT.NONE);
		info.setFont(SWTResourceManager.getFont("Segoe UI", 25, SWT.NORMAL));
		info.setBounds(121, 10, 362, 62);
		info.setText("COMPRA FINALIZADA!");
		
		Label itens = new Label(shell, SWT.WRAP);
		itens.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		itens.setBounds(10, 139, 557, 26);
		itens.setText(itens2);
		
		if(i==2) {
			Label label = new Label(shell, SWT.WRAP);
			label.setText(itens3);
			label.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
			label.setBounds(10, 171, 557, 26);
		}
		
		Label metodoPagamento = new Label(shell, SWT.WRAP);
		metodoPagamento.setText(method2);
		metodoPagamento.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		metodoPagamento.setBounds(10, 219, 557, 47);
		
		Label valor = new Label(shell, SWT.WRAP);
		valor.setText(value2);
		valor.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		valor.setBounds(10, 278, 557, 47);

	}
}
