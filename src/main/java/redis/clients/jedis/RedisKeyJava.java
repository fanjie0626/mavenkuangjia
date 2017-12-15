package redis.clients.jedis;

import java.util.Iterator;
import java.util.Set;

public class RedisKeyJava {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.auth("123456");
		Set<String> keys = jedis.keys("*");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
