import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class test {
	
	public static void main(String[] args) throws RiotApiException {
		ApiConfig config = new ApiConfig().setKey("RGAPI-d48d7941-8c57-4919-a09c-3fddf97ba074");
		RiotApi api = new RiotApi(config);

		try{
			Summoner summoner = api.getSummonerByName(Platform.EUW, "Dreifingerjoey");
			System.out.println("Name: " + summoner.getName());
			System.out.println("Summoner ID: " + summoner.getId());
			System.out.println("Account ID: " + summoner.getAccountId());
			System.out.println("Summoner Level: " + summoner.getSummonerLevel());
			System.out.println("Profile Icon ID: " + summoner.getProfileIconId());
		}
		
		catch(Exception e){
		
		}
	}
}
