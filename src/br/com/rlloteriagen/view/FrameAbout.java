package br.com.rlloteriagen.view;

import java.awt.Cursor;

public class FrameAbout extends javax.swing.JFrame {

	private static final long serialVersionUID = -3454034717903754620L;

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;

	public FrameAbout() {
		createComponents();
		initComponents();
	}

	private void createComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
	}

	private void initComponents() {
		setSize( 300, 200 );
		setAlwaysOnTop( true );
		setResizable( false );
		setLocationRelativeTo( null );
		getContentPane().setLayout( null );
		setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

		getContentPane().add( jLabel1 );
		jLabel1.setFont( new java.awt.Font( "Arial", 1, 14 ) );
		jLabel1.setText( "RL Loteria" );
		jLabel1.setBounds( 10, 10, 100, 20 );

		getContentPane().add( jLabel2 );
		jLabel2.setFont( new java.awt.Font( "Tahoma", 3, 11 ) );
		jLabel2.setText( "Versão " + FramePrincipal.versao );
		jLabel2.setBounds( 10, 25, 100, 20 );

		getContentPane().add( jLabel3 );
		jLabel3.setText( "Desenvolvido por Rodrigo Lazoti" );
		jLabel3.setBounds( 40, 100, 300, 20 );

		getContentPane().add( jLabel4 );
		jLabel4.setText( "contato: rodrigolazoti@yahoo.com.br" );
		jLabel4.setBounds( 40, 115, 300, 20 );

		getContentPane().add( jButton1 );
		jButton1.setText( "Fechar" );
		jButton1.setToolTipText( "Fechar tela." );
		jButton1.setBounds( 110, 140, 75, 20 );
		jButton1.setCursor( new Cursor( Cursor.HAND_CURSOR ) );
		jButton1.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				jButton1ActionPerformed( evt );
			}
		} );
	}

	private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
		this.dispose();
	}

}