import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			br.readLine();
			HashMap<String, Integer> note1 = new HashMap<>();

			String[] arr = br.readLine().split(" ");
			for (int j = 0; j < arr.length; j++) {
				note1.put(arr[j], note1.getOrDefault(arr[j], 1));
			}

			br.readLine();
			String[] arr2 = br.readLine().split(" ");

			for (int j = 0; j < arr2.length; j++) {
				String key = arr2[j];
				if (note1.containsKey(key)) {
					bw.write("1 \n");
				} else {
					bw.write("0 \n");
				}
			}
		}
		bw.flush();
	}
}