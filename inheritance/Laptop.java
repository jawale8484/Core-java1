package com.hef.inheritance;
/*
4.	Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int. Create getter, 
setter methods for the variables. In main method, create Laptop object set values of variables noOfUSBPort, 
processorSpeed using setter methods. Print variables noOfUSBPort, processorSpeed using getter methods.
*/
public class Laptop {
int NoOfUSBPort;
String ProcessorSpeed;
public int getNoOfUSBPort() {
	return NoOfUSBPort;
}
public void setNoOfUSBPort(int noOfUSBPort) {
	NoOfUSBPort = noOfUSBPort;
}
public String getProcessorSpeed() {
	return ProcessorSpeed;
}
public void setProcessorSpeed(String processorSpeed) {
	ProcessorSpeed = processorSpeed;
}
void Print() {
	System.out.println("You have "+NoOfUSBPort+"Number of USB port\n And your Processor speed is "+ProcessorSpeed);
	
}
public static void main(String[] args) {
	Laptop ob=new Laptop();
	ob.setNoOfUSBPort(2);
	ob.setProcessorSpeed("1.5GHz");
	ob.Print();
}
}
