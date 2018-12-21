package se.lexicon.falak.GolfTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

public class GolfTest {
			
			@Test
			public void test_getDistance() {
				double givenAngle = 45;
				double givenVelocity = 56;
				
				double expectedDistance = 320;
				
				assertEquals(expectedDistance, Golf.getDistance(givenVelocity, givenAngle), 0);
			}
			
			@Test
			public void test_angleValid_89_and_1() {
				double highestAngle = 89;
				double lowestAngle = 1;
				
				Assert.assertTrue(Golf.angleValid(lowestAngle) & Golf.angleValid(highestAngle));
			}
			
			@Test
			public void test_badValues_return_false() {
				double badvalueLow = 0;
				double badValueHigh = 90;
				
				assertFalse(Golf.angleValid(badvalueLow) & Golf.angleValid(badValueHigh));
			}
}

		


//validating av velocity,distance?
//
//	

	


