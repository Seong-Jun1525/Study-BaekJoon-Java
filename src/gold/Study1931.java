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
import java.util.StringTokenizer;

class MeetingTime {
	private int startTime;
	private int endTime;
	
	public MeetingTime() {}
	
	public MeetingTime(int startTime, int endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}

class SortMeeting implements Comparator<MeetingTime> {
	// 정렬 부분을 잘못하고 있었다
	// 회의가 끝나는 시간이 같을 경우 시작 시간 순으로 정렬 해줘야함
    @Override
    public int compare(MeetingTime o1, MeetingTime o2) {
        if (o1.getEndTime() == o2.getEndTime()) {
            return Integer.compare(o1.getStartTime(), o2.getStartTime()); // 시작 시간 오름차순 정렬
        }
        return Integer.compare(o1.getEndTime(), o2.getEndTime()); // 종료 시간 오름차순 정렬
    }
}

public class Study1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1931 회의실 배정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<MeetingTime> mList = new ArrayList<>();
        int count = 0;
        int lastMeetingTime = 0;
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer stk = new StringTokenizer(br.readLine());
        	mList.add(new MeetingTime(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
        }
        
        Collections.sort(mList, new SortMeeting());
        
        for(int i = 0; i < mList.size(); i++) {
        	if(mList.get(i).getStartTime() >= lastMeetingTime) {
        		count++;
        		lastMeetingTime = mList.get(i).getEndTime();
        	}
        }
        
//        for(MeetingTime mt : mList) {
//        	System.out.println(mt.getStartTime() + " " + mt.getEndTime());
//        }
        
        bw.append(count + "\n");
        
        bw.flush();
        bw.close();
        br.close();
	}

}
