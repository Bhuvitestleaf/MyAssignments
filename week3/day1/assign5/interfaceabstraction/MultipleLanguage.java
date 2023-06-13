package week3.day1.assign5.interfaceabstraction;

public abstract class MultipleLanguage implements Language, TestTool    //(Abstract) Class implements interface
{
public void python() {
	System.out.println("Python used to build websites & s/w, automate tasks & conduct data analysis");
}
public abstract void ruby();  //unimplemented method (Abstract method)
}
