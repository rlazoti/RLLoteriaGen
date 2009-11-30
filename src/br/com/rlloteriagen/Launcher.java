package br.com.rlloteriagen;

import br.com.rlloteriagen.view.FramePrincipal;

public class Launcher {

	public static void main( String args[] ) {
		java.awt.EventQueue.invokeLater( new Runnable() {
			public void run() {
				FramePrincipal fmain = new FramePrincipal();
				fmain.setLocationRelativeTo( null );
				fmain.setVisible( true );
			}
		} );
	}

}
