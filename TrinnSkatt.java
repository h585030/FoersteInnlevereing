package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class TrinnSkatt {

	public static void main(String[] args) {
		
		String bruttoloennTxt = showInputDialog("Bruttolønn:");
		int bruttoloenn = parseInt(bruttoloennTxt);
		
		if ( bruttoloenn >= 999550) {
			System.out.println("16,2% trinnskatt");
		} else if ( bruttoloenn >= 639750 && bruttoloenn < 999550) {
			int Bosettelse = showConfirmDialog(null, "Er du bosatt i Troms eller Finnmark?", "Bosettelse", YES_NO_OPTION);
			if ( Bosettelse == YES_OPTION) {
				System.out.println("11,2% trinnskatt");
			} else {
				System.out.println("13,2% trinnskatt");
			}
		} else if ( bruttoloenn >= 254500 && bruttoloenn < 639750) {
			System.out.println("4,2% trinnskatt");
		} else if ( bruttoloenn >= 180800 && bruttoloenn < 254500) {
			System.out.println("1,9% trinnskatt");
		} else if ( bruttoloenn >= 0 && bruttoloenn < 180800) {
			System.out.println("Ingen trinnskatt");
		} else {
			System.out.println("Ugyldig bruttolønn");
		}

	}

}
