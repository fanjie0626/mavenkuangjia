package redis.clients.jedis;

import java.util.List;

import org.apache.log4j.Logger;

public class RedisListJava {
	private static Logger log = Logger.getLogger(RedisListJava.class);
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.auth("123456");
		log.info("���ӳɹ�");
		//�洢���ݵ��б���
		jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // ��ȡ�洢�����ݲ����
        List<String> list = jedis.lrange("site-list", 0, 2);
        for (int i = 0; i < list.size(); i++) {
        	log.info("�б���Ϊ: "+list.get(i));
        }
	}
}
