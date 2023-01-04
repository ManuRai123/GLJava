package com.gl.DataStructWeek3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class WriteHelper{
	public void readFile() throws IOException{
		FileReader file=null;
		BufferedReader fileInput=null;
		
			try {
				file = new FileReader("C:\\Users\\manuroy\\OneDrive - Cisco\\Desktop\\Unit-test.txt");
				fileInput = new BufferedReader(file);
				
				System.out.println(fileInput.readLine());
				
			} catch (IOException e) {
				System.out.println("file not found"+e.getMessage());
			}finally {
				if(fileInput != null) {
					System.out.println("file Input closing finally");
					fileInput.close();
				}
				if(file != null) {
					System.out.println("file closed finally");
					file.close();
				}
			}
		
	}
}

public class ExThows {

	public static void main(String[] args) throws IOException {
		WriteHelper obj = new WriteHelper();
		obj.readFile();

	}

}
