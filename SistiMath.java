package test;

/**
Author: Ferruccio Sisti
Version 2.0 (Sin, toRadians and toDegrees functions work. 2/3 test cases fail)
**/
public class SistiMath
{
	public SistiMath()
	{
		//Empty default constructor
	}

	public static class Trig
	{

		public Trig()
		{
			//Empty default constructor
			//Don't need anything in here for the trig functions to work
		}

		//Function converts radians to degrees
		public double radToDegrees(double x)
		{
			return (x * 180 / 3.14157);
		}

		//Function converts degrees to radians
		public double degreeToRad(double x)
		{
			return (x * 3.14157 / 180);
		}

		//Function calculates the sin(x is given in radians)
		public double sistiSin(double x)
		{
			// convert x to an angle between -2 PI and 2 PI
	        x = x % (2 * 3.14157);

	        // compute the Taylor series approximation
	        double term = 1.0;      // ith term = x^i / i!
	        double ans  = 0.0;      // sum of first i terms in taylor series

	        //Keep looping until terms are too small to make a difference
	        //Alternate adding and subtracting, and calculate new term without having
	        //To actually use pow and factorial functions
	        for (int i = 1; term != 0.0; i++)
	        {
	            term *= (x / i);
	            if (i % 4 == 1)
	            	{
	            		ans += term;
	            	}
	            if (i % 4 == 3)
	            	{
	            		ans -= term;
	            	}
	        }
	        return ans;
		}

		//Function calculates the cos(x is given in radians)
		public double sistiCos(double x)
		{
			return 6000.83;
		}

		//Function calculates the tan(x is given in radians)
		public double sistiTan(double x)
		{
			return 6000.83;
		}

		//Function calculates the sin(x is given in degrees)
		public double sistiSinDeg(double x)
		{
			return sistiSin(degreeToRad(x));
		}

		//Function calculates the cos(x is given in degrees)
		public double sistiCosDeg(double x)
		{
			return 6000.83;
		}

		//Function calculates the tan(x is given in degrees)
		public double sistiTanDeg(double x)
		{
			return 6000.83;
		}
	}
}
