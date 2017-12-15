package redis.clients.jedis;

import java.util.List;

import org.apache.log4j.Logger;

public class RedisListJava {
	private static Logger log = Logger.getLogger(RedisListJava.class);
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.auth("123456");
		log.info("连接成功");
		//存储数据到列表中
		jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0, 2);
        for (int i = 0; i < list.size(); i++) {
        	log.info("列表项为: "+list.get(i));
        }
	}
}
