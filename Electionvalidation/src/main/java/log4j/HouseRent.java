package log4j;

import org.apache.log4j.Logger;

public class HouseRent {
	
		static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("HouseRent.class");
		public double cc(String material,double area)
			{
			int cost;
			double total_cost;
			if(material=="standard")
			{
				cost=1200;
			}
			else if(material=="abovestandard")
			{
				cost=1500;
			}
			else if(material=="highstandard")
			{
				cost=1800;
			}
			else
			{
				cost=2500;
			}
			total_cost=area*cost;
			Logger . debug("House Rent :"+total_cost);
			return total_cost;
			}
		}

