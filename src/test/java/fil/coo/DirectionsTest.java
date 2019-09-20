package fil.coo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionsTest {
	
	Directions d ;

	@Test
	public void DirectionsConstructorTest(){
		d = Directions.UP;
		assertEquals("up", d.toString());
	}
	
	@Test
	public void DirectionsGetOppositeTest(){
		d = Directions.UP;
		assertEquals(Directions.DOWN,  d.getOpposite());
		d = Directions.DOWN;
		assertEquals(Directions.UP,  d.getOpposite());
		d = Directions.LEFT;
		assertEquals(Directions.RIGHT,  d.getOpposite());
		d = Directions.RIGHT;
		assertEquals(Directions.LEFT,  d.getOpposite());
	}

}
