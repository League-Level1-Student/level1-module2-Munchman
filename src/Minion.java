
public class Minion {

	
	
	private String name;
private int eyes;
private String color;
private String master;

Minion(String n, int e, String c, String m){
	name=n;
	eyes=e;
	color=c; 
	master=m;
	
}

String getName(){
	return name;
}
void setName(String n) {
	name=n;
}

int getEyes() {
	return eyes;
	
}
void setEyes(int e) {
	eyes=e;
}

String getColor() {
	return color;
	
}
void setColor(String c) {
	color=c;
	
}

String getMaster() {
	return master;
}
void setMaster(String m) {
	master=m;
}





}
