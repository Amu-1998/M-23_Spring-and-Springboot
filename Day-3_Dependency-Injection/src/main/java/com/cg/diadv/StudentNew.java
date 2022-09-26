package com.cg.diadv;

//2.Dependency in term of object
//StudentNew class is dependent on mathCheat class
public class StudentNew {
	
	MathCheat math;
	
	//DI using Setters
	
	public void setMath(MathCheat math) {
		this.math = math;
	}



	public void cheating()
	{
		math.mathCheat();
	}
}
