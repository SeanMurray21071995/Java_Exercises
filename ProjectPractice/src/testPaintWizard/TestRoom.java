package testPaintWizard;

import static org.junit.Assert.*;

import org.junit.Test;

import paintWizard.Room;

public class TestRoom {
	
	@Test 
	public void testRoomCoverageGetSet() {
		Room r = new Room(50);
		assertEquals("the room coverage wasn't set", r.getRoomCoverageMeter2(),50);
	}
}
