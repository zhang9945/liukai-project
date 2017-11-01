import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.owner.dao.MusicDao;
import com.owner.model.MusicInfo;

public class Test {
//	private Log logger = new ;
	public static void main(String[] args){
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("classpath:config/spring/*.xml");
		try {
			MusicDao dao = (MusicDao) ctx.getBean("MusicDao");
			List<MusicInfo> musicList = dao.queryData();
			System.out.println("Begin to query data from mysql");
			for(MusicInfo info : musicList)
			{
				System.out.println(info.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
