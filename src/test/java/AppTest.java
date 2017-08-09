import cn.xyz.mbs.mapper.ImUserMapper;
import cn.xyz.mbs.po.ImUserCustom;
import cn.xyz.mbs.po.ImUserVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by fanchengwei on 2017/7/27.
 */
public class AppTest {
    private ApplicationContext applicationContext = null;
    @Before
    public void setup(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
    }
    @Test
    public void testQueryImUser()throws Exception{
        ImUserVo imUserVo = new ImUserVo();
        ImUserCustom imUserCustom = new ImUserCustom();
        imUserCustom.setName("超");
        imUserVo.setImUserCustom(imUserCustom);
        ImUserMapper imUserMapper = (ImUserMapper)applicationContext.getBean("imUserMapper");
        List<ImUserCustom> imUserCustomList = imUserMapper.selectImUserByIdAndName(imUserVo);
        System.out.println(imUserCustomList);
    }
}
