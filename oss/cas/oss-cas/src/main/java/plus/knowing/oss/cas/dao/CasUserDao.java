package plus.knowing.oss.cas.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import plus.knowing.oss.cas.entity.CasUser;

@Mapper
@Repository
public interface CasUserDao {

    @Select("select * from cas_user where mobile = #{mobile} and password = #{password}")
    CasUser getByMobileAndPwd(String mobile, String password);
}
