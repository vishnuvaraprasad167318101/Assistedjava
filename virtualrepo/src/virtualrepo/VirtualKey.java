package virtualrepo;

import java.util.*;
import java.io.File;


public class VirtualKey 
{
	


		public static File folder = new File("C:\\hellofile");

		public static void main(String[] args) {

			// welcome Page
		
			System.out.println("\t Welcome to hyper Pvt. Ltd  \n");
			menu();
		}

		public static void menu() {

			System.out.println("The List of Operation are \n");
			String arr[] = { "1. Retrive Current file names in an ascending order","2.  To perform Business-level operations", "3. Close the application" };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				
			}
			System.out.println("\nSelect one of the options listed above\n");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 1:
				File m[] = folder.listFiles();
				Arrays.sort(m);

				for (int i = 0; i < m.length; i++)
					System.out.println(m[i]);
				menu();
				break;
			case 2:
				boolean l = true;
				while (l) {
					System.out.println("Business Level Operations\n");
					System.out.println(" 1 : To Add a file in the existing Directory");
					System.out.println(" 2 : To Delete a file from the existing Directory. ");
					System.out.println(" 3 : To Search a user specified file from the Directory");
					System.out.println(" 4 : Back to the main menu");

					int k = sc.nextInt();
					switch (k) {
					case 1:
						System.out.println("Enter the File Name to create");
						String s = sc.next();
						File file = new File(folder, s);

						try {
							boolean value = file.createNewFile();
							if (value) {
								System.out.println("The new file is created.");
							} else {
								System.out.println("The file already exists.");
							}
						} catch (Exception e) {
							e.getStackTrace();
						}
						break;
					case 2:
						System.out.println("Enter the File Name to delete");
						String name = sc.next();
						File file1 = new File(folder, name);

						try {
							boolean value = file1.delete();
							if (value) {
								System.out.println("The new file is Deleted.");
							} else {
								System.out.println("File Not Found");
							}
						} catch (Exception e) {
							e.getStackTrace();
						}
						break;
					case 3:
						System.out.println("Enter a keyword to search");
						String search = sc.next();
						boolean flag1 = false;
						File arr1[] = folder.listFiles();
						System.out.println("File :\n");
						for (int i = 0; i < arr1.length; i++) {
							if (arr1[i].getName().startsWith(search)) {
								flag1 = true;
								System.out.println(arr1[i]);
							}
						}
						if (flag1 == false) {
							System.out.println("No file found");
						}

						break;
					case 4:
						l = false;
						menu();
						break;
					default:
						System.out.println("You have made an invalid choice!");
						System.out.println("Please enter correct choice\n");

					}
				}
				break;
			case 3:
				System.out.println("Closing Your Application\n");
				System.out.println("Thank You");
				break;
			default:
				System.out.println("You have made an invalid choice!");
				System.out.println("Please enter correct choice\n");
				menu();
				break;

			}
		}		
}


