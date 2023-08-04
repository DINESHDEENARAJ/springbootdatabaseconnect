package companydetails.jsw;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
		@RunWith(SpringRunner.class)
class JswApplicationTests {

	@Autowired
	companydetailrepository crep;
	@Autowired
	companydetailrepository crepchecking;

	@Autowired
	companydetailservice cser;
	@Test
	public void testing1() {

	companydetail com1=new companydetail(1,"ZINC","DISHA",110,140,30);

//		Assert.assertEquals(com1,cser.listallcompanydetails()).get().getusername());
//		Assert.assertSame(com1,cser.listallcompanydetails().get(0).getUsageweight());

	}

}
