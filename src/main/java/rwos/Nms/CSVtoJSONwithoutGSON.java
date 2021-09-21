package rwos.Nms;

import java.io.*;
public class CSVtoJSONwithoutGSON {
	
	public static void readCsvUsingBufferedReader(String filepath){
		
		String line = "";
		String deleimeter = ",";
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.json");
		} catch (IOException e1) {
						e1.printStackTrace();
		} 
		BufferedWriter buffer = new BufferedWriter(writer);  
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filepath));
				
			line = reader.readLine();
				
			while((line = reader.readLine()) != null) {
				
				String machineData[] = line.split(deleimeter);
				
				PowerConsumtion pc = new PowerConsumtion(machineData[0],Integer.valueOf(machineData[1]),Integer.valueOf(machineData[1]));
				
				String s = "{\"date\":\""+machineData[0]+"\",\"machineNo\":"+Integer.valueOf(machineData[1])+",\"consumption\":"+
				Integer.valueOf(machineData[1]) + "}";
				buffer.write(s);
				
			}
			buffer.close();
			System.out.println("Successful");
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
