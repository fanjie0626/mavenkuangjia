package redis.clients.jedis;

public class RedisStringJava {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.auth("123456");
		System.out.println("���ӳɹ�");
		jedis.set("runoobkey", "www.runoob.com");
		System.out.println("redis �洢���ַ���Ϊ: " + jedis.get("runoobkey"));
	}
}
