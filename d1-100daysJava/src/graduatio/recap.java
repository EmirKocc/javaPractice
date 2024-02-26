package graduatio;

import java.util.Iterator;

public class recap {

	public static void main(String[] args) {
		 double nubmers[] = {45,31, 3, 4, 5, 6, 7,8,9,};
		 double enBuyukSayi = nubmers[0];
		 
		 
		 for(double myList:nubmers) {
			 if (enBuyukSayi<myList){
				 enBuyukSayi=myList;
				
			}
		 }
		 System.out.println(enBuyukSayi);
	}

}
