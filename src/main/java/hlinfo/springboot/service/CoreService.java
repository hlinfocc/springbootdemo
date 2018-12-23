package hlinfo.springboot.service;

import java.util.List;

public interface CoreService {
    /**
     * 查询列表，带参数
     * @param mybitsSqlId
     * @param object
     * @return
     */
    public abstract List queryList(String mybitsSqlId,Object object);
    /**
     * 查询列表，无参数
     * @param mybitsSqlId
     * @return
     */
    public abstract List queryList(String mybitsSqlId);
}
