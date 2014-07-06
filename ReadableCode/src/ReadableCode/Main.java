package ReadableCode;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.print("読み込むファイル名を入力してください>");//
			BufferedReader br_filename = new BufferedReader(new InputStreamReader(System.in));
			File file = new File(br_filename.readLine());

			BufferedReader br_file = new BufferedReader(new FileReader(file));
			String recipiNAME;
			int count =1;
			
			FileWriter filewriter = new FileWriter("recipi.txt");//ファイル名の入力データをここに入れたかった
			
			while((recipiNAME = br_file.readLine()) != null){

				filewriter.write(count+":"+br_filename.readLine());
				filewriter.close();
				System.out.println(recipiNAME);
			}

		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}
	}
}
