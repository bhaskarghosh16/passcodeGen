import java.io.IOException;

import com.gameanalyzer.gameList.GameListGenerator;
import com.passcode.mains.Passcode;

public class GeneratePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Passcode passcode = new Passcode();
//		passcode.setGameName("Witcher3");
//		passcode.setYear(2018);
//		System.out.println(passcode);
		
		GameListGenerator gGenerate = new GameListGenerator();
		gGenerate.setLimit(5);
		
		try {
			gGenerate.generateListbyLimit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
