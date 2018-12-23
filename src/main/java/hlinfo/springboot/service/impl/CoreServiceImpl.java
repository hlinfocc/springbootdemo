package hlinfo.springboot.service.impl;

import hlinfo.springboot.Dao.CoreDao;
import hlinfo.springboot.service.CoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoreServiceImpl implements CoreService {
    @Resource
    private CoreDao coreDao;

    public List queryList(String mybitsSqlId) {
        return this.coreDao.queryList(mybitsSqlId);
    }

    public List queryList(String mybitsSqlId, Object object) {
        return this.coreDao.queryList(mybitsSqlId, object);
    }
}
