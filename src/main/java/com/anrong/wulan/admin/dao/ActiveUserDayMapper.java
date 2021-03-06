package com.anrong.wulan.admin.dao;

import java.util.List;
import java.util.Map;

import com.anrong.wulan.admin.po.ActiveUserDay;
import com.anrong.wulan.core.generic.GenericDao;

public interface ActiveUserDayMapper extends GenericDao<ActiveUserDay,Long>{
    List<ActiveUserDay> queryActiveUserDay(Map<String,Object> map);
//活跃用户（昨日）
	List<ActiveUserDay> ActiveUserYesterday(Map<String, Object> map);
}
