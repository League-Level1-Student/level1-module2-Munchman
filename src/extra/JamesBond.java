package extra;
//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
//The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.

//4. Test your code by instantiating the JamesBond and Vault classes.

//5. Add a constructor for Vault so that you can easily set the secret code. 
public class JamesBond {
int findCode(Vault vic){
	for (int i = 0; i < 1000000; i++) {
		//System.out.println(i);
	boolean b =	vic.tryCode(i);
	if (b == true) {
		return i;
	}		
		
	}
	return -1;
}
public static void main(String[] args) {
	Vault v=new Vault();
	JamesBond blofeld =new JamesBond();
	int s = blofeld.findCode(v);
System.out.println(s);
}

}
