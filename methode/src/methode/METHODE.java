package methode;

public class METHODE {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	METHODE b=new METHODE();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}
}
