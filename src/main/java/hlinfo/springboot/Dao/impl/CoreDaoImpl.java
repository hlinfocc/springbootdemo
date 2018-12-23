package hlinfo.springboot.Dao.impl;

import hlinfo.springboot.Dao.CoreDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoreDaoImpl implements CoreDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List queryList(String mybitsSqlId) {
        return this.sqlSessionTemplate.selectList(mybitsSqlId);
    }
    public List queryList(String mybitsSqlId, Object object) {
        return this.sqlSessionTemplate.selectList(mybitsSqlId, object);
    }

}
