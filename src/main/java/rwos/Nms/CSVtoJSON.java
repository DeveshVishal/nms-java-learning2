package rwos.Nms;

import java.io.*;
import com.google.gson.Gson;

//import com.google.code.gson;
//import com.google.gson.Gson;
public class CSVtoJSON {
	
	public static void readCsvUsingBufferedReader(String filepath){
		
		String line = "";
		String deleimeter = ",";
		FileWriter writer = null;
		try {
			writer = new FileWriter("/Users/deveshvishal/Downloads/Netmeds/output.json");
		} catch (IOException e1) {
						e1.printStackTrace();
		} 
		BufferedWriter buffer = new BufferedWriter(writer);  
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filepath));
				
			line = reader.readLine();
				
			while((line = reader.readLine()) != null) {
//				System.out.println(line);
				
				String machineData[] = line.split(deleimeter);
				
				PowerConsumtion pc = new PowerConsumtion(machineData[0],Integer.valueOf(machineData[1]),Integer.valueOf(machineData[1]));
				
				String s = new Gson().toJson(pc);
				buffer.write(s);
				
				System.out.println("Json data : " + new Gson().toJson(pc));
			}
			buffer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){

		readCsvUsingBufferedReader("/Users/deveshvishal/Downloads/Netmeds/input.csv");
		
	}

}
