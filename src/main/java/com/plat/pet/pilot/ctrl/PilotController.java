package com.plat.pet.pilot.ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plat.pet.pilot.Maru;
import com.plat.pet.pilot.RespObjt;
import com.plat.pet.pilot.ResponseObject;
import com.plat.pet.pilot.dao.MaruDao;

@Controller
@RequestMapping("/pilot")
public class PilotController {
	/**
	 * now pilot project
	 * we need follow infra. 
	 * 1. WAS(tomcat - replication : active/active)
	 * 2. DB (mysql? - duplication : master/slave)
	 * 3. Storage (I think, using linux(1. WAS) file system. but it's available another storage to image file.)
	 * 4. L4 (Loadbalancer)
	 * ... ??? i need more study.
	 * maybe, we don't using many transaction => WAS + DB has 1 OS.
	 */
	/**
	 * develop
	 * - transaction processing
	 * - session manager
	 * - security
	 * - filter
	 * - business logic
	 * - OAuth?
	 */
	
	/**
	 * Test DAO
	 */
	@Autowired
	private MaruDao maruDao;
	
	/**
	 * pilot controller for test
	 * request GET
	 * return Map<String, String>
	 */
	@RequestMapping(value="pMaruStringGet", method=RequestMethod.GET)
	public @ResponseBody Map<String, String> pMaru(HttpServletRequest req
												, @RequestParam(value="fstParam", required = false) String paramFirst){
		Map<String, String> rtn = new HashMap<String, String>();
		rtn.put("fst", paramFirst);
		return rtn;
	}
	
	/**
	 * request GET
	 * return List<class>
	 */
	@RequestMapping(value="pMaruList", method=RequestMethod.GET)
	public @ResponseBody List<RespObjt> maruList(HttpServletRequest req){
		ArrayList<RespObjt> rtnList = new ArrayList<RespObjt>();
		RespObjt respFst = new RespObjt();
		respFst.setCode("200");
		respFst.setData("Fst Data");
		rtnList.add(respFst);
		RespObjt respSnd = new RespObjt();
		respSnd.setCode("200");
		respSnd.setData("Snd Data");
		rtnList.add(respSnd);
		
		return rtnList;
	}
	
	/**
	 * responseObject Test
	 */
	@RequestMapping(value="pMaruObjt", method=RequestMethod.GET)
	public @ResponseBody ResponseObject<List<Maru>> maruObjt(HttpServletRequest req){
		Maru objtMaru = new Maru();
		ArrayList<Maru> mr = new ArrayList<Maru>();
		
		ResponseObject<List<Maru>> rtnList = new ResponseObject<List<Maru>>();
		
		String rtnVal = maruDao.selectTest();
		objtMaru.setId(rtnVal);
		objtMaru.setLoc("Query Test");
		mr.add(objtMaru);
		
		rtnList.setCode("20200");
		rtnList.setData(mr);
		return rtnList;
	}
	
	
}
