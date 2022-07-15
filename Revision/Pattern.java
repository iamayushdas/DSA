import java.util.Scanner;
public class Pattern {
    public static void pattern1(int n) {
		int nsp = n-1, nst = 1;
		
		for(int r = 1; r<=n; r++) {
			for(int csp = 1; csp <=nsp ; csp++) {
				System.out.print("\t");
			}
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}
			nsp -- ;
			nst ++;
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		int nst = n-2, nsp = 1;
		
		for(int r = 1; r<=n; r++) {
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}
			for(int csp = 1; csp <=nsp ; csp++) {
				System.out.print("\t");
			}
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}
			if(r<=n/2){
				nsp +=2 ;
				nst -- ;
			}else{
				nsp -=2 ;
				nst ++;
			}

			System.out.println();
		}
	}
	public static void pattern3(int n) {
		int nst = 1, nsp = 0;
		
		for(int r = 1; r<=n; r++) {
			for(int csp = 1; csp <=nsp ; csp++) {
				System.out.print("\t");
			}
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}

				nsp ++ ;

			System.out.println();
		}
	}
	public static void pattern4(int n) {
		int nsp1 = 0, nsp2 = n - 2;
		
		for(int r = 1; r<=n; r++) {
			for(int csp1 = 1; csp1 <=nsp1 ; csp1++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int csp2 = 1; csp2 <= nsp2; csp2++) {
				System.out.print("\t");
			}
			if(r != n/2+1){
				System.out.print("*\t");
			}
			if(r<=n/2){
				nsp1 ++;
				nsp2 -=2;
			}else{
				nsp1 --;
				nsp2 +=2;
			}

			System.out.println();
		}
	}

	public static void pattern11(int rows){
		int  nst = 1;
		for(int i = 1; i<=rows; i++){
			// for(int csp = 1; csp <= nsp; csp++){
			// 	System.out.print("\t");
			// }
			int count = 0;
			for(int cst = 1; cst <= nst ; cst++){
				System.out.print(count+i +"\t");
				count++;
			}

			nst++;
			System.out.println();
		}
	}

	public static void pattern12(int rows){
		int a  = 0;
		int b = 1;
		int nst = 1;
		for(int i = 1; i<=rows; i++){
			for(int cst = 1; cst<=nst; cst++){
				System.out.print(a+ " ");
				int c = a+b;
				a = b; 
				b = c;
			}
			nst++;
			System.out.println();
		}
	}
	public static void pattern9(int n){
		for(int r=1;r<=n;r++){
			for(int c=1;c<=n;c++)
			{
				if(r==c||r+c==n+1)
				{
					System.out.print("*\t");
				}
				else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public static void pattern10(int n){
		int nsp1 = n/2 , nsp2 = -1;
		for(int r = 1 ; r<=n;r++){
			for(int csp1 = 1; csp1<= nsp1;csp1++){
				System.out.print("\t");
			}
				System.out.print("*\t");			
			for(int csp2= 1; csp2<=nsp2; csp2++){
				System.out.print("\t");
			}
				if(r>1 && r<n){
				System.out.print("*\t");
				}
				if(r<=n/2){
					nsp1--;
					nsp2+=2;
				}else{
					nsp1++;
					nsp2-=2;
				}
				
				
			System.out.println();

		}

	}


	public static void pattern111(int n ){
		int nst= 1; 
		int count = 1;
		for(int r = 1; r<=n;r++){
			for(int cst = 1; cst <=nst;cst++){
				System.out.print(count + " ");
				count++;
			}
			nst++;
			System.out.println();
		}
		
	}


	public static void pattern121(int n){
		int nst = 1, a=0,b=1;
		for(int r= 1; r<=n;r++){
			for(int cst = 1; cst<=nst;cst++){
				System.out.print(a+"\t");
				int c = a+b;
				a=b;
				b=c;
			}
			System.out.println();
			nst++;
		}
	}

	public static void fibonaci(int n ){
		int a = 0 , b=1;
		for(int r = 1;r<=n;r++){
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
			
		}

	}

	public static void pattern13(int rows){
		for(int n = 0; n<=rows; n++){
			int nCr = 1;
			for(int r = 0; r<=n; r++){
				// System.out.print(n+"C"+r + "\t");
				System.out.print(nCr + "\t");
				nCr = ((n-r)*nCr) / (r+1);
			}
			System.out.println();
		}
	}

	public static void diamond(int n){
		int nst = 1, nsp = n/2;
		for(int r = 1; r<=n; r++){
			for(int csp = 1; csp <= nsp ; csp++){
				if(r==n/2 + 1){
					System.out.print("*\t");
				}
				System.out.print("\t");
			}
			for(int cst = 1; cst<=nst ; cst++){
				System.out.print("*\t");
			}
			if(r<=n/2){
				nst++;

			}else{
				nst--;
			}
			System.out.println();
		}

	}
	public static void bridge16(int n){
		int nst = 1, nsp = 2*n - 3, count = 1;;
		for(int r = 1; r<=n; r++){
			for(int cst = 1; cst <=nst; cst++){
				System.out.print(count++ +"\t");

			}
			for(int csp = 1; csp<=nsp; csp++){
				System.out.print("\t");
			}
			if(r==n){
				nst--;
				count--;
			}
			for(int cst = 1; cst <=nst; cst++){
				System.out.print(--count +"\t");
			}
			

			nst++;
			nsp-=2;

			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	diamond(n);
		// bridge16(n);
	}
}