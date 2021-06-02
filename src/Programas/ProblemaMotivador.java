package Programas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Employee;

public class ProblemaMotivador {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Lucas\\Documents\\MY_TXT.txt");
		List<Employee> list = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			String[] split = bf.readLine().split(",");

			while (split != null) {
				/*
				 * for (String rec : split) {
				 * 
				 * list.add(rec); }
				 */

				Employee employee = new Employee(split[0], Double.parseDouble(split[0]));
				list.add(employee);

				String line = bf.readLine();

				if (line != null) {
					split = line.split(",");
				} else {
					split = null;
				}
			}

			Collections.sort(list);

			for (Employee rec : list) {
				System.out.println(rec);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
