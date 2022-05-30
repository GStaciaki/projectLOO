package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FrameBase extends JFrame implements VisualWindow {

	public CardLayout cl;
	private PanelBase baseJP;
	private JButton btList, btRegister, btGoBack, btGoBack2, btGoBack3, btGoBack4, btSubmit, btRemove, btUpdate,
			btUpdateAndBack;

	public FrameBase() {
		setLayouts();
		setComponents();
		setEvents();
		validate();
	}

	@Override
	public void setLayouts() {
		setSize(800, 600);
		setVisible(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void setComponents() {

		baseJP = new PanelBase(this);
		cl = new CardLayout();
		cl = (CardLayout) baseJP.getLayout();

		add(baseJP, BorderLayout.CENTER);

	}

	@Override
	public void setEvents() {

	}

	public void activateInitialScreen() {
		cl.show(baseJP, "initial");
	}

	public void activateSecondScreen() {
		cl.show(baseJP, "second");
	}

	public void activateThirdScreen() {
		cl.show(baseJP, "third");
	}

	public void activateRemoveScreen() {
		cl.show(baseJP, "remove");
	}

	public void activateUpdateScreen() {
		cl.show(baseJP, "update");
	}

//	public JButton getButtonList() {
//		btList = new JButton("Lista de Usuarios");
//		return btList;
//	}
//
//	public JButton getButtonRegister() {
//		btRegister = new JButton("Cadastrar Novo Usuario");
//		return btRegister;
//	}
//
//	public JButton getButtonGoBack() {
//		btGoBack = new JButton("Voltar");
//		return btGoBack;

//
//	public JButton getButtonSubmit() {
//		btSubmit = new JButton("CADASTRAR");
//		return btSubmit;
//	}
//
//	public JButton getButtonRemove() {
//		btRemove = new JButton("Remover Usuario");
//		return btRemove;
//	}
//
//	public JButton getButtonUpdate() {
//		btUpdate = new JButton("Alterar Usuario");
//		return btUpdate;
//	}
//
//	public JButton getButtonUpdateAndClose() {
//		btUpdateAndBack = new JButton("Alterar");
//		return btUpdateAndBack;
//	}
}