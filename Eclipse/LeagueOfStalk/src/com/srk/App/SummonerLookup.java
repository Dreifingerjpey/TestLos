package com.srk.App;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.league.dto.LeagueList;
import net.rithms.riot.constant.Platform;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SummonerLookup")
public class SummonerLookup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SummonerLookup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				ApiConfig config = new ApiConfig().setKey("RGAPI-7ab68fcd-66fb-4a81-ab31-28caaaa6ef5e");
				RiotApi api = new RiotApi(config);
				String name = request.getParameter("summoner");
				net.rithms.riot.constant.Platform platform = Platform.EUW; // hier noch dynamisch �nderbar
			try{
				getSummonerData(api,request,name,platform);
				
				//forward to LookupSite
				request.getRequestDispatcher("LookUp.jsp").forward(request, response);
				
			}catch(Exception e){
				response.sendRedirect("index.jsp");
			}
			
	

		
	
	}

	private void getSummonerData(RiotApi a,HttpServletRequest r, String name,net.rithms.riot.constant.Platform p ) throws RiotApiException {
		net.rithms.riot.api.endpoints.summoner.dto.Summoner summoner = a.getSummonerByName(p, name);
		List<LeagueList> league = a.getLeagueBySummonerId(p, summoner.getId());
		String devS =league.get(0).getTier()+" "+league.get(0).getEntryBySummonerId(summoner.getId()).getRank()+" "+league.get(0).getEntryBySummonerId(summoner.getId()).getLeaguePoints();
		String devF =league.get(1).getTier()+" "+league.get(1).getEntryBySummonerId(summoner.getId()).getRank()+" "+league.get(1).getEntryBySummonerId(summoner.getId()).getLeaguePoints();
		//set Data f�r Lookup
		r.setAttribute("name", name);
		r.setAttribute("lvl", summoner.getSummonerLevel());
		r.setAttribute("devS",devS );
		r.setAttribute("devF",devF );
		String iconSrc = "http://ddragon.leagueoflegends.com/cdn/6.24.1/img/profileicon/"+summoner.getProfileIconId()+".png";
		r.setAttribute("sIcon",iconSrc );	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
