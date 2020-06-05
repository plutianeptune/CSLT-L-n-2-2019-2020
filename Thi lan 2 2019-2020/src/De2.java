import java.util.Scanner;
import java.io.*;
public class De2 {
	
	private static void NhapMang(int[] mang) {
		Scanner n = new Scanner(System.in);
		for(int i=0;i<mang.length;i++) {
			System.out.printf("Nhap phan tu thu %d :",i);
			mang[i] = n.nextInt();
		}
		
	}
	
	private static void XuatMang(int[] mang) {
		for(int i=0;i<mang.length;i++) {
			System.out.printf("%d",mang[i]);
		}
	}
	
	private static boolean KiemTraSNT(int so) {
		if(so<=2) return false;
		for(int i=2;i<so/2;i++) {
			if(so % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	private static void GhiFile(String content) {
		try {
			File file = new File("D:/File code/Data,txt");
			FileWriter fw = new FileWriter(file);
			fw.write(content);
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Câu 1:
		Scanner n = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu :");
		int n1 = n.nextInt();
		int[] mang = new int[n1];
		NhapMang(mang);
		
//Câu 2:
		XuatMang(mang);
		
//Câu 3:
		System.out.println("\n========== Liet ke cac SNT");
		String content = "";
		for(int i=0;i<mang.length;i++) {
			if(KiemTraSNT(mang[i])) {
				System.out.println(mang[i] +": la so nguyen to");
				content+=String.valueOf(mang[i]) +"";
			}
		}

//Câu 4:
GhiFile(content);
	}
}

