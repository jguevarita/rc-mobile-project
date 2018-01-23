package pe.com.rc.mobile.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.rc.mobile.core.exception.ServiceException;
import pe.com.rc.mobile.model.Clan;
import pe.com.rc.mobile.model.User;
import pe.com.rc.mobile.service.clan.ClanService;
import pe.com.rc.mobile.web.util.Constants;

@RestController
@RequestMapping(Constants.URL_BASE)
public class ClanController {

	@Autowired
	private ClanService clanService;

	@RequestMapping(value = Constants.URL_CLAN + Constants.URL_GET_CLAN_MEMBERS, method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody List<User> listarLugaresDefault(
			@RequestBody Clan clan) throws ServiceException {

		List<User> members = clanService.getMembersByClan(clan);

		return members;

	}
}
