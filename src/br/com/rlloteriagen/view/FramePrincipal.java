package br.com.rlloteriagen.view;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.rlloteriagen.library.Megasena;

public class FramePrincipal extends javax.swing.JFrame {

	private static final long serialVersionUID = 4039058799057026524L;
	public static final String versao = "1.1";

	private javax.swing.JComboBox cbTipo;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JRadioButtonMenuItem rbmiMetal;
	private javax.swing.JRadioButtonMenuItem rbmiMotif;
	private javax.swing.JRadioButtonMenuItem rbmiWindows;
	private javax.swing.JTextArea taResultado;

	public FramePrincipal() {
		createComponents();
		initComponents();
		mudaLookAndFeel( 0 );
		this.rbmiMetal.setSelected( true );
	}

	private void createComponents() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		cbTipo = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		taResultado = new javax.swing.JTextArea();
		jLabel2 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		rbmiMotif = new javax.swing.JRadioButtonMenuItem();
		rbmiWindows = new javax.swing.JRadioButtonMenuItem();
		rbmiMetal = new javax.swing.JRadioButtonMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
	}

	private void initComponents() {
		setTitle( "RL Loteria " + versao );
		setSize( 400, 250 );
		setResizable( false );
		setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
		setLocationRelativeTo( null );
		getContentPane().setLayout( null );

		jPanel1.setBorder( javax.swing.BorderFactory.createTitledBorder( "" ) );
		jPanel1.setBounds( 5, 5, 380, 185 );
		jPanel1.setLayout( null );
		getContentPane().add( jPanel1 );

		jLabel1.setText( "Tipo de Loteria:" );
		jLabel1.setBounds( 30, 10, 100, 20 );
		jPanel1.add( jLabel1 );

		cbTipo.setModel( new javax.swing.DefaultComboBoxModel( new String[] { "Megasena" } ) );
		cbTipo.setBounds( 150, 10, 200, 20 );
		jPanel1.add( cbTipo );

		jButton1.setText( "Sortear" );
		jButton1.setToolTipText( "Sortear números para loteria selecionada." );
		jButton1.setBounds( 150, 140, 90, 20 );
		jPanel1.add( jButton1 );
		jButton1.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				jButton1ActionPerformed( evt );
			}
		} );

		taResultado.setColumns( 20 );
		taResultado.setEditable( false );
		taResultado.setFont( new java.awt.Font( "Arial", 1, 16 ) );
		taResultado.setForeground( new java.awt.Color( 0, 0, 255 ) );
		taResultado.setRows( 2 );
		taResultado.setBorder( BorderFactory.createBevelBorder( 1 ) );
		taResultado.setAutoscrolls( false );
		taResultado.setBounds( 30, 60, 320, 50 );
		jScrollPane1.setViewportView( taResultado );
		jPanel1.add( taResultado );

		jLabel2.setFont( new java.awt.Font( "Tahoma", 1, 11 ) );
		jLabel2.setText( "Resultado:" );
		jLabel2.setBounds( 30, 40, 70, 20 );
		jPanel1.add( jLabel2 );

		jMenu1.setText( "Loteria" );
		jMenuItem1.setText( "Sair" );
		jMenuItem1.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				jMenuItem1ActionPerformed( evt );
			}
		} );

		jMenu1.add( jMenuItem1 );

		jMenuBar1.add( jMenu1 );

		jMenu3.setText( "Temas" );
		rbmiMotif.setText( "Motif" );
		rbmiMotif.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				rbmiMotifActionPerformed( evt );
			}
		} );

		jMenu3.add( rbmiMotif );

		rbmiWindows.setText( "Windows" );
		rbmiWindows.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				rbmiWindowsActionPerformed( evt );
			}
		} );

		jMenu3.add( rbmiWindows );

		rbmiMetal.setText( "Metal" );
		rbmiMetal.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				rbmiMetalActionPerformed( evt );
			}
		} );

		jMenu3.add( rbmiMetal );

		jMenuBar1.add( jMenu3 );

		jMenu2.setText( "Sobre" );
		jMenuItem2.setText( "RL Loteria" );
		jMenuItem2.addActionListener( new java.awt.event.ActionListener() {
			public void actionPerformed( java.awt.event.ActionEvent evt ) {
				jMenuItem2ActionPerformed( evt );
			}
		} );

		jMenu2.add( jMenuItem2 );

		jMenuBar1.add( jMenu2 );

		setJMenuBar( jMenuBar1 );
	}

	private void rbmiMetalActionPerformed( java.awt.event.ActionEvent evt ) {
		this.rbmiWindows.setSelected( false );
		this.rbmiMotif.setSelected( false );
		mudaLookAndFeel( 0 );
	}

	private void rbmiWindowsActionPerformed( java.awt.event.ActionEvent evt ) {
		this.rbmiMetal.setSelected( false );
		this.rbmiMotif.setSelected( false );
		mudaLookAndFeel( 2 );
	}

	public void mudaLookAndFeel( int index ) {
		UIManager.LookAndFeelInfo[] looks;
		looks = javax.swing.UIManager.getInstalledLookAndFeels();
		try {
			javax.swing.UIManager.setLookAndFeel( looks[index].getClassName() );
			javax.swing.SwingUtilities.updateComponentTreeUI( this );
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	private void rbmiMotifActionPerformed( java.awt.event.ActionEvent evt ) {
		this.rbmiMetal.setSelected( false );
		this.rbmiWindows.setSelected( false );
		mudaLookAndFeel( 1 );
	}

	private void jMenuItem2ActionPerformed( java.awt.event.ActionEvent evt ) {
		FrameAbout fabout = new FrameAbout();
		fabout.setTitle( "Sobre Loteria" );
		fabout.setLocationRelativeTo( null );
		fabout.setVisible( true );
	}

	private void jMenuItem1ActionPerformed( java.awt.event.ActionEvent evt ) {
		if ( JOptionPane.showConfirmDialog( this, "Deseja finalizar o programa?", "Atenção", 0 ) == 0 )
			this.dispose();
	}

	private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {

		if ( this.cbTipo.getSelectedIndex() == 0 ) {
			int[] sequencia = new Megasena().sortearSequencia();
			this.taResultado.setText( null );

			for ( int i = 0; i < sequencia.length; i++ ) {
				if ( i == 0 )
					this.taResultado.setText( String.valueOf( sequencia[i] ) );
				else
					this.taResultado.setText( this.taResultado.getText() + " - " + sequencia[i] );
			}
		}
	}
}