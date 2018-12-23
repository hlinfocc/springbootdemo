package hlinfo.springboot.Dao;

import java.util.List;

public interface CoreDao {
    public abstract List queryList(String mybitsSqlId, Object object);
    public abstract List queryList(String mybitsSqlId);
}
