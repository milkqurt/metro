import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> route;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        route = new ArrayList<>();
        Line line1 = new Line(1,"First");
        Line line2 = new Line(2,"Second");

        route.add(new Station("Petrovskaya",line1));
        route.add(new Station("Gogolya",line1));
        route.add(new Station("Alberta",line2));
        route.add(new Station("Keysova",line2));
    }

    public void testCalculateDuration(){
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 8.5;
        assertEquals(expected,actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
