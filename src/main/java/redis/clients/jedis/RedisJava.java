package redis.clients.jedis;

public class RedisJava {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
//		jedis.auth("123456");
		System.out.println("���ӳɹ�");
		System.out.println("������������: "+jedis.ping());
	}
}
