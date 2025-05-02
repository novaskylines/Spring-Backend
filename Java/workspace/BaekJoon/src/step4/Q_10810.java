package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_10810 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int box = Integer.parseInt(st.nextToken());
//			System.out.println(box);
			int count = Integer.parseInt(st.nextToken());
//			System.out.println(count);
			ArrayList<Integer>[] boxArray = new ArrayList[box];
			for(int i=0; i<box; i++) {
				boxArray[i] = new ArrayList<Integer>();
			}
//			System.out.println(boxArray);
			for(int i=0; i<count; i++) {
				String input = br.readLine();
				System.out.println(input);
				StringTokenizer inputSt = new StringTokenizer(input);
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				for(int j=start-1; j<=end-1; j++) {
					boxArray[j].add(num);
				}
			}
			for(int i=0; i<box; i++) {
				bw.write(boxArray[i]+" ");
			}
			bw.newLine();
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
