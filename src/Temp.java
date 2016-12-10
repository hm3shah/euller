import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Temp {
	
	static volatile boolean isStopped = false;
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * Scanner scanner = new Scanner(System.in); long n =
		 * scanner.nextLong(); long m = scanner.nextLong(); long sale = 0;
		 * 
		 * //Map<Long,List<Long>> ticketWindowMap = new
		 * TreeMap<>(Collections.reverseOrder()); Map<Long,List<Long>>
		 * ticketWindowMap = new HashMap<>(); List<Long> tickets = new
		 * ArrayList<>(); for(long i=0;i<n;i++) { List<Long> windows; long
		 * ticketCount = scanner.nextLong();
		 * if(ticketWindowMap.containsKey(ticketCount)) { windows =
		 * ticketWindowMap.get(ticketCount);
		 * 
		 * } else { windows = new ArrayList<>(); } windows.add(i);
		 * ticketWindowMap.put(ticketCount, windows); }
		 * 
		 * while(m!=0) {
		 * 
		 * Entry<Long,List<Long>> maxEntry = null;
		 * 
		 * for(Entry<Long,List<Long>> entry : ticketWindowMap.entrySet()) { if
		 * (maxEntry == null || entry.getKey() > maxEntry.getKey()) {
		 * if(ticketWindowMap.get(entry.getKey()).size()==0) { continue; }
		 * maxEntry = entry; } } List<Long> windows =
		 * ticketWindowMap.get(maxEntry.getKey()); long noTickets =
		 * maxEntry.getKey(); sale+=noTickets; long window = windows.get(0);
		 * windows.remove(0); ticketWindowMap.put(noTickets, windows);
		 * if(noTickets==0) { m--; continue; } windows=
		 * ticketWindowMap.get(noTickets-1); if(windows==null) { windows = new
		 * ArrayList<Long>(); } windows.add(window);
		 * ticketWindowMap.put(noTickets-1, windows); m--; }
		 * System.out.println(sale);
		 */
		
		
		Thread temp = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				while (!isStopped) {
					i++;
				}
			}
		});
		
		temp.start();
		Thread.sleep(1000);
		isStopped=true;
	}
	
	private static synchronized boolean isStopped() {
		return isStopped;
	}

}
