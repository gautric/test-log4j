package fr.redhat.testing;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class TechFilter extends Filter {

	String pattern = "Tech";

	public TechFilter() {
	}

	public int decide(LoggingEvent event) {
		int result = DENY;
		Object message = event.getMessage();
		if (message instanceof String) {
			String order = (String) message;
			if (order.contains(pattern)) {
				result = ACCEPT;
			}
		} else {
			result = NEUTRAL;
		}

		return result;
	}
}
