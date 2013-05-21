package fr.redhat.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TestSLF4j {
	private static final Logger LogTech = LoggerFactory.getLogger("tech."
			+ TestSLF4j.class.getCanonicalName());
	private static final Logger LogFonc = LoggerFactory.getLogger(TestSLF4j.class
			.getCanonicalName());

	public static void main(String[] args) {
		LogTech.error("Mon Erreur Tech");
		LogFonc.error("Mon Erreur Fonc");
	}
}
