package com.anrong.wulan.admin.service;

import java.util.List;
import java.util.Map;
import com.anrong.wulan.admin.po.OperateSystemData;
import com.anrong.wulan.core.generic.GenericService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface OperateSystemDataService extends GenericService<OperateSystemData, Long> {
	List<OperateSystemData> getOperateSystemData(Map<String, Object> params,PageBounds pageBounds);
}
