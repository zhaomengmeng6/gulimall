import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    BrandService brandService;

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("小米");
        brandEntity.setName("mi");
        brandService.save(brandEntity);
        System.out.println("success");
    }
}
