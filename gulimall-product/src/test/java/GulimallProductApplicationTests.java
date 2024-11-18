import com.atguigu.gulimall.product.GulimallPoductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallPoductApplication.class)
public class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    public void test(){
        List<BrandEntity> list = brandService.list();
        System.out.println(list);
        }
}
