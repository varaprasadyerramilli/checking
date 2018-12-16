package ds.stack;

public class App {
public static void main(String[] args)
{
	
//	thestack.push('H');
//	thestack.push('E');
//	thestack.push('L');
//	thestack.push('L');
//	thestack.push('O');
	
	reverseString("varaprasad");	
}

public static void reverseString(String name)
{
	stackchar thestack = new stackchar(name.length());//assign size to the stack
	for(int i=0; i<name.length(); i++)
	{
		thestack.push(name.charAt(i));
	}
	while(!thestack.isEmpty()){
		char value=thestack.pop();
		System.out.print(value);
}
}
}



