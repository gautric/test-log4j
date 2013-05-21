package fr.redhat.testing;

import org.apache.log4j.Logger;



public class TestLog4j {
	  private static final Logger LogTech = Logger.getLogger("tech."+TestLog4j.class.getCanonicalName());
	  private static final Logger LogFonc = Logger.getLogger(TestLog4j.class.getCanonicalName());
	  
	  
	  public static void main(String[] args) {
		LogTech.error("Mon Erreur Tech");
		LogFonc.error("Mon Erreur Fonc");
	}
}
