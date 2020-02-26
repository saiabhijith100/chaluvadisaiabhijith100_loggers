package saiabhijith;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleInterst {
	private static final Logger LOGGER=LogManager.getLogger(SimpleInterst.class);
	public static double simpleinterst(double PrincipleAmount,double interst,int time) {
		LOGGER.info("entered into The simpleInterst");
		 return (PrincipleAmount*interst*time)/100;
	 }
}
