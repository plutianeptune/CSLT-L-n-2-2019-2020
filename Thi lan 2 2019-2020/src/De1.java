import java.util.Scanner;
import java.io.*;
public class De1 {
	
	private static void NhapMang(int[] mang) {
		Scanner n = new Scanner(System.in);
		for(int i=0;i<mang.length;i++) {
			System.out.printf("Nhap phan tu thu %d :",i);
			mang[i]=n.nextInt();
		}
	}
	
	private static void XuatMang(int[] mang) {
		for(int i=0;i<mang.length;i++) {
			System.out.printf("%d",mang[i]);
		}
	}
	
	private static  void SapXepMang(int[] mang) {
		for(int i=0;i<mang.length-1;i++) {
			for(int j=i+1;j<mang.length;j++) {
				if(mang[i] > mang[j]) {
					int temp = mang[i];
					mang[i]  = mang[j];
					mang[j]  = temp;
				}
			}
		}
	}
	
	private static void GhiFile(String content) {
		try {
			File file = new File("D:/File code/Data.txt");
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
		SapXepMang(mang);
		System.out.println("\n========== Mang sau khi sap xep tang dan ");
		XuatMang(mang);
		
//Câu 4:
		String content = "";
		for(int i=0;i<mang.length;i++) {
			content+=String.valueOf(mang[i]+"");
		}
		GhiFile(content);
	}

}
