package silver.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Study1764 {

    public static void main(String[] args) throws IOException {
        // 듣보잡
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> nSet = new HashSet<>();
        Set<String> resultSet = new TreeSet<>();
        /*
         * TreeSet은 Set 인터페이스를 구현하며, 요소를 정렬된 상태로 유지하는 특징이 있다.
         * 
         * TreeSet의 중요한 특징
         * 정렬된 순서 유지: TreeSet은 내부적으로 요소를 이진 검색 트리인 Red-Black Tree로 저장하여 요소들을 자동으로 오름차순으로 정렬
         * 
         * 중복 허용 안 함: Set 인터페이스를 구현하므로 중복된 요소를 허용하지 않음
         * 
         * 빠른 검색 및 조작: TreeSet은 이진 검색 트리 구조를 사용하여 요소의 추가, 제거, 검색 등의 작업을 평균적으로 O(log n)의 시간 복잡도로 처리함
         * */
        
        // 듣보잡 수 각각 입력
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]); // 듣도 못한 사람 수
        int m = Integer.parseInt(str[1]); // 보도 못한 사람 수
        
        for (int i = 0; i < n; i++) {
            nSet.add(br.readLine());
        }
        
        for (int j = 0; j < m; j++) {
            String name = br.readLine();
            if (nSet.contains(name)) { // 입력받은 이름이 존재하는 경우는 듣도보도 못한 사람이므로 추가
                resultSet.add(name);
            }
        }
        
        bw.write(resultSet.size() + "\n");
        for (String s : resultSet) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
