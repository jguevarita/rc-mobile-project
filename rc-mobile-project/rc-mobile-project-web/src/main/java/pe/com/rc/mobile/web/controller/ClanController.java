package pe.com.rc.mobile.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.rc.mobile.core.exception.ServiceException;
import pe.com.rc.mobile.model.User;
import pe.com.rc.mobile.model.clan.BuildClanRequest;
import pe.com.rc.mobile.model.clan.Clan;
import pe.com.rc.mobile.model.clan.ClanMembersResponse;
import pe.com.rc.mobile.model.clan.ListClanResponse;
import pe.com.rc.mobile.model.clan.TeamSearch.AcceptMemberRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.CandidatesRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.CandidatesResponse;
import pe.com.rc.mobile.model.clan.TeamSearch.DropMemberRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.PostularRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.RecruitRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.TeamBuildRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.TeamDeleteRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.TeamSearchRequest;
import pe.com.rc.mobile.model.clan.TeamSearch.TeamSearchResponse;
import pe.com.rc.mobile.service.clan.ClanService;
import pe.com.rc.mobile.web.util.Constants;

@RestController
@RequestMapping(Constants.URL_BASE)
public class ClanController {

	@Autowired
	private ClanService clanService;

	// GET MEMBERS BY CLAN
	@RequestMapping(value = Constants.URL_CLAN + Constants.URL_GET_CLAN_MEMBERS, method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody List<ClanMembersResponse> listarLugaresDefault(
			@RequestParam Integer clanId) throws ServiceException {
		System.out.println("clanId :: " + clanId);
		return clanService.getMembersByClan(new Long(clanId));
	}

	// CREAR CLAN
	@RequestMapping(value = Constants.URL_CLAN + Constants.URL_BUILD, method = RequestMethod.POST, produces = { "application/json" })
	public void buildClan(@RequestBody BuildClanRequest request)
			throws ServiceException {
		clanService.buildClan(request);
	}

	@RequestMapping(value = Constants.URL_CLAN + "/list", method = RequestMethod.POST, produces = { "application/json" })
	public List<ListClanResponse> listClan() throws ServiceException {
		return clanService.listClanes();
	}

	@RequestMapping(value = "/team/search", method = RequestMethod.POST, produces = { "application/json" })
	public TeamSearchResponse getTeam(@RequestBody TeamSearchRequest request)
			throws ServiceException {
		return clanService.getTeam(request);
	}

	@RequestMapping(value = "/team/build", method = RequestMethod.POST, produces = { "application/json" })
	public void buildTeam(@RequestBody TeamBuildRequest request)
			throws ServiceException {
		clanService.buildTeam(request);
	}

	@RequestMapping(value = "/team/eliminar", method = RequestMethod.POST, produces = { "application/json" })
	public void deleteTeam(@RequestBody TeamDeleteRequest request)
			throws ServiceException {
		System.out.println("DELETE TEAM :: ");
		clanService.deleteTeam(request);
	}

	// POSTULAR
	@RequestMapping(value = "/team/postular", method = RequestMethod.POST, produces = { "application/json" })
	public void getCandidates(@RequestBody PostularRequest request)
			throws ServiceException {
		clanService.postular(request);
	}
	
	// RECLUTAR
	@RequestMapping(value = "/team/recruit", method = RequestMethod.POST, produces = { "application/json" })
	public void recruit(@RequestBody RecruitRequest request)
			throws ServiceException {
		clanService.recruitPlayer(request);
	}

	// ACCEPT CLAN MEMBER
	@RequestMapping(value = "/team/acceptMember", method = RequestMethod.POST, produces = { "application/json" })
	public void acceptMember(@RequestBody AcceptMemberRequest request)
			throws ServiceException {
		clanService.acceptPlayer(request);
	}

	// DROP CLAN MEMBER
	@RequestMapping(value = "/team/dropMember", method = RequestMethod.POST, produces = { "application/json" })
	public void dropMember(@RequestBody DropMemberRequest request) throws ServiceException {
		clanService.dropMember(request);
	}
	
	// GET CANDIDATES
	@RequestMapping(value = "/team/candidates", method = RequestMethod.POST, produces = { "application/json" })
	public List<CandidatesResponse> getCandidates(@RequestBody CandidatesRequest request)
			throws ServiceException {
		return clanService.getCandidates(request);
	}
}
