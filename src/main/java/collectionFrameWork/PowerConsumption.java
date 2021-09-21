package collectionFrameWork;

import java.util.*;

public class PowerConsumption {
	
	String date ;
	int machineNo ;
	int consumptionInHp ;
	
	public PowerConsumption( String date , int machineNo , int consumptionInHp ) {
		this.date = date ;
		this.machineNo = machineNo ;
		this.consumptionInHp = consumptionInHp ;
	}
	
	public String toString() {
		
		StringBuffer str = new StringBuffer() ;
		str.append( date );
		str.append( "\t\t" );
		str.append( String.valueOf( machineNo ) );
		str.append( "\t\t" );
		str.append( String.valueOf( consumptionInHp ) );
		return str.toString() ;
	}
	
	public static void main( String ar[] ) {
		
		PowerConsumption p[] = new PowerConsumption[6] ;
		
		p[0] = new PowerConsumption ( "10.05.08" , 10 , 100 ) ;
		p[1] = new PowerConsumption ( "10.05.08" , 11 , 120 ) ;
		p[2] = new PowerConsumption ( "10.05.08" , 12 , 125 ) ;
		p[3] = new PowerConsumption ( "11.05.08" , 10 , 145 ) ;
		p[4] = new PowerConsumption ( "11.05.08" , 11 , 155 ) ;
		p[5] = new PowerConsumption ( "12.05.08" , 12 , 165 ) ;
//		p[6] = new PowerConsumption ( "13.05.08" , 13 , 165 ) ;

		
		System.out.println("Date\t\tMachine\t\tConsumption");
		for( int i = 0 ; i < p.length ; i++ ) {
			System.out.println(p[i]) ;
		}
		
		TreeMap<Integer, ArrayList<Pair>> map = new TreeMap<>();
		
		TreeSet<String> dmap = new TreeSet<>();
		
		for(int i = 0; i<p.length; i++) {
			if(!map.containsKey(p[i].machineNo)) {
				ArrayList<Pair> arr = new ArrayList<>();
				map.put(p[i].machineNo, arr);
			}
			ArrayList<Pair> arr2 = map.get(p[i].machineNo);
			arr2.add(new Pair(p[i].date, p[i].consumptionInHp));
			
			map.put(p[i].machineNo,arr2);
			
			dmap.add(p[i].date);
			
		}
		
		String arr[][] = new String[map.size()+2][map.size()+2];
		
		arr[0][0] = "Machine/Date";
		arr[0][arr.length-1] = "Total";
		arr[arr.length-1][0] = "Total";
		
		
		int i = 1;
		
		for(String d: dmap) {
			arr[0][i++] = d;
		}
		
		i = 1;
		int j = 0;
		int tsum = 0;
		
		for(int k: map.keySet()) {
			arr[i][0] = Integer.toString(k);
			j = 1;
			ArrayList<Pair> list = map.get(k);
			
			int a = 0;
			int sum = 0;
			
			while(a < list.size()) {
				if(list.get(a).date == arr[0][j]) {
					int val = list.get(a).consumption;
					sum += val;
					arr[i][j] = Integer.toString(val);
					a++;
				}
				else {
					arr[i][j] = "0";
				}
				j++;
			}
			
			tsum += sum;
			
			arr[i][arr[0].length-1] = Integer.toString(sum);
			i++;
		}
		
		arr[arr.length-1][arr[0].length-1] = Integer.toString(tsum);
		
		for(i = 1; i<arr.length-1; i++) {
			
			int sum = 0;
			
			for(j = 1; j<arr[0].length; j++) {
				sum += Integer.valueOf(arr[j][i] == null ? "0" : arr[j][i]);
				if(j == arr.length-1) {
					arr[arr.length-1][i] = Integer.toString(sum);
				}
			}
		}
		
		System.out.println();
		for(int l = 0; l<arr[0].length; l++) {
			
			if(arr[0][l] == null) {
				arr[0][l] = "0";
			}
			
			System.out.print(arr[0][l]+"\t");
			
		}
		System.out.println();
		
		for(int m = 1; m<arr.length; m++) {
			for(int n = 0; n<arr[0].length; n++) {
				if(arr[m][n] == null) {
					arr[m][n] = "0";
				}
				System.out.print(arr[m][n]+"\t\t");
			}
			System.out.println();
		}
		
	}
}
