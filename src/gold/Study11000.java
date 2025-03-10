package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Room {
	int startT;
	int entT;
	public Room() {}
	public Room(int startT, int entT) {
		super();
		this.startT = startT;
		this.entT = entT;
	}
	public int getStartT() {
		return startT;
	}
	public void setStartT(int startT) {
		this.startT = startT;
	}
	public int getEntT() {
		return entT;
	}
	public void setEntT(int entT) {
		this.entT = entT;
	}
}

class SortRoom implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
    	return Integer.compare(o1.getStartT(), o2.getStartT());
    }
}

public class Study11000 {

	public static void main(String[] args) throws IOException {
		// 강의실 배정 미해결
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Room r = new Room();
		List<Room> rList = new ArrayList<Room>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] strArr = br.readLine().split(" ");
			r = new Room(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
			rList.add(r);
		}
		
		Collections.sort(rList, new SortRoom());
		int count = 0;
		int lastRoomTime = 0;
		for(int i = 0; i < rList.size(); i++) {
        	if(rList.get(i).getStartT() >= lastRoomTime) {
        		count++;
        		lastRoomTime = rList.get(i).getEntT();
        	}
        }
		
//		for(Room rr : rList) System.out.println(rr.getStartT() + " " + rr.getEntT());
		
		bw.write(count + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

}
