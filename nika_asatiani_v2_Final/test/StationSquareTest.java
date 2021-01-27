import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;

public class StationSquareTest {

    Train train = new Train();

    @Test
    public void passengerHas_ticket_pass() {
        Passenger passenger = new Passenger("zoro", true);
        train.AddPassenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());
        Assert.assertEquals(1, train.getPassengerList().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void passengerHasno_ticket_not_pass() {
        Passenger passenger = new Passenger("cxeni", false);
        train.AddPassenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());
        Assert.assertEquals(0, train.getPassengerList().size());
    }

    @Test
    public void passengerHasno_ticket_pass() {
        Passenger passenger = new Passenger("loma", false);
        train.AddPassenger(passenger);
        Assert.assertEquals(0, train.getPassengerList().size());
    }


}
