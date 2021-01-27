package ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {
    final static Logger logger = Logger.getLogger(Payment.class);
    public static void main(String[] args) {

        Water water = new Water(10.5, "lbasd123" );
        pay(water);
        Electricity electricity = new Electricity(2.3, "123");
        pay(electricity);

    }

    public static <T> void pay(T type) {
        logger.info("კომუნალური გადახდილია : " + type.toString());
    }

}
