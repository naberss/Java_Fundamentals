package Programas;

import java.io.File;
import java.util.Scanner;

public class Folder_Manipulation {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);

		) {
			/*
			 * System.out.println("Enter a folder name:"); String folderPath = scan.next();
			 */
			String folderPath = "C:\\Users\\Lucas\\Documents";
			File path = new File(folderPath);

			File Folders[] = path.listFiles(File::isDirectory);
			File Files[] = path.listFiles(File::isFile);

			System.out.println("FOLDERS: \n");
			for (File folders : Folders) {
				System.out.println(folders);
			}

			System.out.println("FILES: \n");
			for (File files : Files) {
				System.out.println(files);
			}

			boolean sucess = new File(folderPath + "\\Subdir").mkdir();

		}

	}

}
