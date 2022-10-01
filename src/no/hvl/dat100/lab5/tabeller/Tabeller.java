package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

//	// a)
	public static void skrivUt(int[] tabell) {

	 for(int i=0;i<tabell.length;i++) {
		  
	}

	}

//	// b)
	public static String tilStreng(int[] tabell) {
		String x= "";
		String tmp = "[";
		int k=0;
		int sum =0;
//		System.out.print("[");
	
			
		
		for(int i=0;i<tabell.length;i++) {
			x=Integer.toString(tabell[i]);
			if(i==tabell.length-1) {
				tmp=tmp+x;
			} else {
				tmp=tmp+x+",";
			}

		}	
		tmp=tmp+"]";
		System.out.print(tmp);	
		return tmp;
	}

////	 c)
	public static int summer(int[] tabell) {  //for
		int sum =0;
		int tmp =0;
		for(int i=0;i<tabell.length;i++) {
			tmp = tabell[i];
			sum= tmp+sum;
			
		}
		return sum;
	}
//	public static int summer(int[] tabell) { //while
//		int sum =0;
//		int i =0;
//		int tmp =0;
//		while(i<tabell.length) {
//			sum+= tabell[i];
//			sum=tmp+sum;
//			i++;
//		}
//		System.out.print(sum);
//		return sum;
//	}
//	public static int summer(int[] tabell) {     // utvidet for
//		int summ1 =0;
//		for (int summ : tabell) {
//			summ1 +=summ;
//		 
//	 }
//		System.out.print(summ1);
//	return summ1;
//	
//}
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int pos =0;
		boolean funnet= false;
		
		while(!funnet &&pos<tabell.length) {
			if(tall==tabell[pos]) {
				funnet=true;
			}
			pos++;
		}
	//	System.out.println(funnet);
		return funnet;
		
		
		
	
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index=-1;
		for(int i=0; i<tabell.length;i++) {
			if(tabell[i]==tall) {
				index =i;
			}
		}
		return index;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] tabell2 = new int [tabell.length];
		int p=0;
	 for(int i=tabell.length-1;i>=0;i--) {
		 tabell2[p]	= tabell[i];
					p++;
				
			}
	 for(int i=0;i<tabell.length;i++) {
		 	System.out.println(tabell2[i]);
		}
		 
		return tabell2;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sorter =true;
		for (int i =0;i<tabell.length-1;i++) {
			if(tabell[i]>tabell[i+1]) {
				sorter =false;
			}
		}
//		System.out.println(sorter);
		return sorter;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int pos=0;
	int [] nytab =new int[tabell1.length+tabell2.length];
	for (int element : tabell1) {
		nytab[pos] =element;
		pos++;
	}
	for(int element: tabell2) {
		nytab[pos]=element;
		pos++;
	}
		

	 return nytab;
}
}