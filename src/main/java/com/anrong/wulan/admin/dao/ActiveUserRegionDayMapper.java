package com.anrong.wulan.admin.dao;

import java.util.List;
import java.util.Map;
import com.anrong.wulan.admin.po.ActiveUserRegionDay;
import com.anrong.wulan.core.generic.GenericDao;

public interface ActiveUserRegionDayMapper extends GenericDao<ActiveUserRegionDay, Long> {
	
	List<ActiveUserRegionDay> queryActtiveUserByRegion(Map<String, Object> map);
}
