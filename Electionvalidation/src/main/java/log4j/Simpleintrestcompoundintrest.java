package log4j;


public class Simpleintrestcompoundintrest {
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("Simpleintrestcompoundintrest.class");
	double SI(double pr,double t,double r )
	{  
		if(pr==0 || r==0 || t==0)
		{
			Logger .warn("pricipal or rate of interest or time is 0");
		}
		double simpleinterest=(pr*r*t)/100;
		Logger . debug("simple interest"+simpleinterest );
		return simpleinterest;
	}
	
	 double CI(float pc,float rc,int tc)
	{
		 				if(pc==0 || rc==0 || tc==0)
				{
					Logger .warn("pricipal or rate of interst or time is 0");
				}
				
				double compoundinterest = pc* (Math.pow((1 + rc / 100), tc));
				Logger . debug("compound interest"+compoundinterest );
				return compoundinterest;
			}
	
}