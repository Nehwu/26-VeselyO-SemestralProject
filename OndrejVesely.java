import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class OndrejVesely {

	public static void main(String[] args) {
		System.out.println("+-------------------------------------+");
		System.out.println("|                 Ahoj!               |");
		System.out.println("|         Chceš vidět sněhuláka?      |");
		System.out.println("|      Napiš ano aby se zobrazil,     |");
		System.out.println("| napsání čehokoliv jiného znamená ne.|");
		System.out.println("|          Zmáčkni pak enter.         |");
		System.out.println("+-------------------------------------+");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int w = 640;
		int h = 480;
		JFrame f = new JFrame();
		ChristmasCanvas dc = new ChristmasCanvas(w,h);
		f.setSize(w,h);
	    f.setTitle("Moje jméno je...");
	    f.add(dc);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		if (s.equals("ano")) {
			
			f.setVisible(true);
			
			System.out.println("+-------------------------------------+");
			System.out.println("|                                     |");
			System.out.println("| Jak se bude jmenovat tvůj sněhulák? |");
			System.out.println("|         Napiš jméno sněhuláka.      |");
			System.out.println("|    Nezapomeň poté zmáčknout enter.  |");
			System.out.println("|                                     |");
			System.out.println("+-------------------------------------+");
			String name = sc.nextLine();
			f.setTitle("Moje jméno je " + name);
			System.out.println("+---------------------------------------------------+");
			System.out.println("|                                                   |");
			System.out.println("|            Chceš ozdobit sněhuláka?               |");
			System.out.println("|              Napiš ano pro ozdobení               |");
			System.out.println("|            Nezapomeň pak zmáčknout enter.         |");
			System.out.println("|                                                   |");
			System.out.println("+---------------------------------------------------+");
			try {
				TimeUnit.SECONDS.sleep(7);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f.setVisible(false);}
			 else {
				    System.out.println("+-------------------------------------+");
					System.out.println("|                                     |");
					System.out.println("|                                     |");
					System.out.println("|             Super volba!            |");
					System.out.println("|       Já ho také nechci vidět :)    |");
					System.out.println("|                                     |");
					System.out.println("+-------------------------------------+");
				 
		}	
		String decoration = sc.nextLine();
		 if (decoration.equals("ano")) { 
			    JFrame g = new JFrame();
				ChristmasNose ac = new ChristmasNose(w,h);
				g.setSize(w,h);
			    g.setTitle(f.getTitle());
			    g.add(ac);
			    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        g.setVisible(true);
		 }
		 else {
				System.out.println("+---------------------------------------------+");
				System.out.println("|                                             |");
				System.out.println("|                                             |");
				System.out.println("|          Nechceš ozdobit sněhuláka :(       |");
				System.out.println("|                                             |");
				System.out.println("|                                             |");
				System.out.println("+---------------------------------------------+");
				f.setVisible(false);
				f.setVisible(true);
				
		 }
	}
}