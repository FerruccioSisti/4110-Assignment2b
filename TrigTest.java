package test;

/**
Author: Ferruccio Sisti
Version 3.0 (All tests pass)
**NOTE** Test cases will pass if they are within 0.03 of the expected answer
*			although they should all be exact or much closer than 0.03
**/
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.Math;

public class TrigTest {

	SistiMath.Trig t;

	@Before
	public void setUp() throws Exception
	{
		this.t = new SistiMath.Trig();
	}

	@Test
	public void radSinNegTest()
	{
		double x = -3.14157;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSin0Test()
	{
		//Test an edge case
		double x = 0;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinFirstQuadTest()
	{
		//Test in first quadrant
		double x = 1.55;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinPIover2Test()
	{
		//Test an edge case
		double x = 3.14157 / 2;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinSecondQuadTest()
	{
		//Test in second quadrant
		double x = 1.8;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinPITest()
	{
		//Test an edge case
		double x = 3.14157;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinThirdQuadTest()
	{
		//Test in third quadrant
		double x = 4;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSin3PIover2Test()
	{
		//Test an edge case
		double x = 3 * 3.14157 / 2;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinFourthQuadTest()
	{
		//Test in fourth quadrant
		double x = 5;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSin2PITest()
	{
		//Test an edge case
		double x = 2 * 3.14157;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radSinAbove2PITest()
	{
		//Test an edge case
		double x = 2 * 3.14157 + 1;
		double y = t.sistiSin(x);
		//Math.sin uses radians so you don't need to convert before using
		assertEquals(Math.sin(x), y, 0.03);
	}

	@Test
	public void radCosNegTest()
	{
		double x = -3.14157;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCos0Test()
	{
		//Test an edge case
		double x = 0;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosFirstQuadTest()
	{
		//Test in first quadrant
		double x = 1.55;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosPIover2Test()
	{
		//Test an edge case
		double x = 3.14157 / 2;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosSecondQuadTest()
	{
		//Test in second quadrant
		double x = 1.8;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosPITest()
	{
		//Test an edge case
		double x = 3.14157;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosThirdQuadTest()
	{
		//Test in third quadrant
		double x = 4;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCos3PIover2Test()
	{
		//Test an edge case
		double x = 3 * 3.14157 / 2;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosFourthQuadTest()
	{
		//Test in fourth quadrant
		double x = 5;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCos2PITest()
	{
		//Test an edge case
		double x = 2 * 3.14157;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radCosAbove2PITest()
	{
		//Test an edge case
		double x = 2 * 3.14157 + 1;
		double y = t.sistiCos(x);
		//Math.cos uses radians so you don't need to convert before using
		assertEquals(Math.cos(x), y, 0.03);
	}

	@Test
	public void radTanNegTest()
	{
		double x = -3.14157;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTan0Test()
	{
		//Test an edge case
		double x = 0;
		double y = t.sistiTan(x);
		//Math.cosuses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanFirstQuadTest()
	{
		//Test in first quadrant
		double x = 1.55;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanPIover2Test()
	{
		//Test an edge case
		double x = 3.14157 / 2;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanSecondQuadTest()
	{
		//Test in second quadrant
		double x = 1.8;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanPITest()
	{
		//Test an edge case
		double x = 3.14157;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanThirdQuadTest()
	{
		//Test in third quadrant
		double x = 4;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTan3PIover2Test()
	{
		//Test an edge case
		double x = 3 * 3.14157 / 2;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanFourthQuadTest()
	{
		//Test in fourth quadrant
		double x = 5;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTan2PITest()
	{
		//Test an edge case
		double x = 2 * 3.14157;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void radTanAbove2PITest()
	{
		//Test an edge case
		double x = 2 * 3.14157 + 1;
		double y = t.sistiTan(x);
		//Math.tan uses radians so you don't need to convert before using
		assertEquals(Math.tan(x), y, 0.03);
	}

	@Test
	public void degSin0Test()
	{
		//Test an edge case
		double x = 0;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin45Test()
	{
		double x = 45;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin90Test()
	{
		double x = 90;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin150Test()
	{
		double x = 150;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin180Test()
	{
		double x = 180;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin200Test()
	{
		double x = 200;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin270Test()
	{
		double x = 270;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin300Test()
	{
		double x = 300;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(Math.toRadians(x)), y, 0.03);
	}

	@Test
	public void degSin360Test()
	{
		double x = 360;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degSin460Test()
	{
		double x = 460;
		double y = t.sistiSinDeg(x);
		//Math.sin uses radians so needs to be converted before asserting
		assertEquals(Math.sin(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCosNegTest()
	{
		//Test an edge case
		double x = -90;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos0Test()
	{
		//Test an edge case
		double x = 0;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos45Test()
	{
		//Test in each quadrant
		double x = 0;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos90Test()
	{
		//Test an edge case
		double x = 90;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos120Test()
	{
		//Test in each quadrant
		double x = 120;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos180Test()
	{
		//Test an edge case
		double x = 180;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos210Test()
	{
		//Test in each quadrant
		double x = 210;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos270Test()
	{
		//Test an edge case
		double x = 270;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos300Test()
	{
		//Test in each quadrant
		double x = 300;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos360Test()
	{
		//Test an edge case
		double x = 360;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degCos460Test()
	{
		//Test an edge case
		double x = 460;
		double y = t.sistiCosDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.cos(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTanNegTest()
	{
		//Test an edge case
		double x = -90;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan0Test()
	{
		//Test an edge case
		double x = 0;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan60Test()
	{
		//Test in each quadrant
		double x = 60;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan90Test()
	{
		//Test an edge case
		double x = 90;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan120Test()
	{
		//Test in each quadrant
		double x = 120;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan180Test()
	{
		//Test an edge case
		double x = 180;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan230Test()
	{
		//Test in each quadrant
		double x = 230;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan270Test()
	{
		//Test an edge case
		double x = 270;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan300Test()
	{
		//Test in each quadrant
		double x = 300;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan360Test()
	{
		//Test an edge case
		double x = 360;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void degTan420Test()
	{
		//Test an edge case
		double x = 420;
		double y = t.sistiTanDeg(x);
		//Check to see if proper result, to three decimal places, uses radians so needs to be converted before asserting
		assertEquals(Math.tan(t.degreeToRad(x)), y, 0.03);
	}

	@Test
	public void radToDegreeTest()
	{
		//test if conversion works for random positive number
		double x = t.radToDegrees(3.14157);
		assertEquals(180, x, 0.03);
	}

	@Test
	public void radToDegreeNegTest()
	{
		//test that conversion works for negative number
		double x = t.radToDegrees(-3.14157);
		assertEquals(-180, x, 0.03);
	}

	@Test
	public void radToDegreeZeroTest()
	{
		//test that conversion works for zero
		double x = t.radToDegrees(0);
		assertEquals(0, x, 0.03);
	}

	@Test
	public void degreeToRadTest()
	{
		//test that conversion works for random positive number
		double x = t.degreeToRad(180);
		assertEquals(3.14157, x, 0.03);
	}

	@Test
	public void degreeToRadNegTest()
	{
		//test that conversion works for random negative number
		double x = t.degreeToRad(-180);
		assertEquals(-3.14157, x, 0.03);
	}

	@Test
	public void degreeToRadZeroTest()
	{
		//test that conversion works for random positive number
		double x = t.degreeToRad(0);
		assertEquals(0, x, 0.03);
	}
}
