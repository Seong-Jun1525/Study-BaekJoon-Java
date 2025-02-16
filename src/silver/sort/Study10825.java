package silver.sort;

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

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}

class SortArr implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	    if (o1.getKor() != o2.getKor()) {
	        return Integer.compare(o2.getKor(), o1.getKor());
	    } else if (o1.getEng() != o2.getEng()) {
	        return Integer.compare(o1.getEng(), o2.getEng());
	    } else if (o1.getMath() != o2.getMath()) {
	        return Integer.compare(o2.getMath(), o1.getMath());
	    } else return o1.getName().compareTo(o2.getName());
	}
}

public class Study10825 {

	public static void main(String[] args) throws IOException {
		// 국영수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<Student> stdList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			stdList.add(new Student(stk.nextToken(), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
		}
		
		Collections.sort(stdList, new SortArr());
		
		for(int i = 0; i < stdList.size(); i++) {
			bw.write(stdList.get(i).getName() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
