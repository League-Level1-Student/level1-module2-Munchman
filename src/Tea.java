
public class Tea {
	
public static void main(String[] args) {
	TeaBag bag=new TeaBag(TeaBag.GREEN);
	Cup cup=new Cup();
	Kettle ken=new Kettle();
	ken.boil();
cup.makeTea(bag, ken.getWater());
	
	
	
	
}

}
