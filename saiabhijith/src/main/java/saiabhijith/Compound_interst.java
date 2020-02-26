package saiabhijith;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Compound_interst {
	private static final Logger LOGGER=LogManager.getLogger(Compound_interst.class);
	public double compound_interst(double principle_balence, double interst_rate, double number_of_time) {
		LOGGER.info("entered into The compoundInterst");
		double CI = principle_balence * (Math.pow((1 + interst_rate / 100),number_of_time))-principle_balence;
		return CI;
	}

}
