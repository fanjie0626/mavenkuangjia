package redis.clients.jedis;

public class RedisStringJava {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.auth("123456");
		System.out.println("连接成功");
		jedis.set("runoobkey", "www.runoob.com");
		System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));
	}
}
