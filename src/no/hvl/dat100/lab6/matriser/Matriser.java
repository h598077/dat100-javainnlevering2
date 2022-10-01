package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		int pos=0;
		for(int tall:matrise[pos]){
			System.out.println(tall);
		}
		pos ++;
		for(int tall:matrise[pos]){
			System.out.println(tall);
		}
		pos++;
		for(int tall:matrise[pos]){
			System.out.println(tall);
		}
			
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		int [] nytab =new int[matrise[0].length+matrise[1].length+matrise[2].length];
		String []StringArray =new String[nytab.length];
		int pos=0;
		int i=0;
		String tmp="";
		String test="";
		String total="";
		String mellomrom="\r\n";
		for(int tall:matrise[pos]){
	//		System.out.println(tall);
			nytab[i] =tall;
			test= Integer.toString(tall);
			StringArray[i] =test;
			tmp =test;
			 total= total+tmp+" ";
			i++;
		}
		pos ++;
		total = total+mellomrom;
		for(int tall:matrise[pos]){
	//		System.out.println(tall);
			nytab[i] =tall;
			test= Integer.toString(tall);
			StringArray[i] =test;
			tmp =test;
			 total=total+tmp+" ";
			i++;
			
		}
		pos++;
		total = total+mellomrom;
		for(int tall:matrise[pos]){
	//		System.out.println(tall);
			nytab[i] =tall;
			test= Integer.toString(tall);
			StringArray[i] =test;
			tmp =test;
			 total= total+tmp+" ";
			i++;
		}
		total=total+ mellomrom;
		
		System.out.println(total);
		
		return total;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int pos =0;
		int i1=0;
		int i2=0;
		int i3=0;
		int tmp=0;
		int sum=0;
		int[][]nymat= new int[3][3];
		for( int teller:matrise[pos]) {
			tmp=teller;
			sum= teller*tall;
			nymat[pos][i1]=sum;
			i1++;
		}
		pos++;
		for( int teller:matrise[pos]) {
			tmp=teller;
			sum= teller*tall;
			nymat[pos][i2]=sum;
			i2++;
		}

		
		pos++;
		for( int teller:matrise[pos]) {
			tmp=teller;
			sum= teller*tall;
			nymat[pos][i3]=sum;
			i3++;
//			System.out.println(teller);
		}

		return nymat;
	
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erlik = false;
		if(a==b) {
			erlik= true;
		} else {
			erlik= false;
		}
		return erlik;
	
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}