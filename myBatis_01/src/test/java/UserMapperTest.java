import com.lax.domain.User;
import com.lax.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description :
 * @Author : Create By liAnXin
 * @ClassName : UserMapperTest
 */
public class UserMapperTest {
    @Test
    public void UserMapperTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryAll();
        for(User user:users)
            System.out.println(users);
        //这是个流对象，不要忘记关闭
        sqlSession.close();
    }
}
