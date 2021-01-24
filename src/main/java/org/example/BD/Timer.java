package org.example.BD;

public class Timer 
{
	private long start;
	private long stop;
	public long yourTime = 0;
	
	public Timer()
	{
		startTheCount();
		stopTheCount();
	}
	
	public long startTheCount() 
	{
		start = System.currentTimeMillis();
		return start;
	}
	public long stopTheCount()
	{
		stop = System.currentTimeMillis();
		yourTime += (stop - start);
		return stop;
	}
}
