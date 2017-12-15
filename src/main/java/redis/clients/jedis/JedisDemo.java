package redis.clients.jedis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

public class JedisDemo {
	private static Logger log = Logger.getLogger(JedisDemo.class);
	
	public static void main(String[] args) {
		JedisDemo demo = new JedisDemo();
		demo.test();
	}
	
	public void test() {
		Jedis jedis = new Jedis("localhost");
//		jedis.auth("123456");
		
//		/*---------------------key����-----------------------*/
//		
//		//KEYS
//		Set<String> keys = jedis.keys("*");//�г����е�key�������ض���key�磺redis.keys("foo")
//		Iterator<String> t1 = keys.iterator();
//		while(t1.hasNext()) {
//			String key = t1.next();
//			log.info(key);
//		}
//		
//		//DEL �Ƴ�������һ������key�����key�����ڣ�����Ը����
//		jedis.del("name1");
//		
//		//TTL ���ظ���key��ʣ������ʱ��(time to live)(����Ϊ��λ)
//		Long ttl1 = jedis.ttl("runoobkey");
//		log.info(ttl1);
//		
//		//PERSIST key �Ƴ�����key������ʱ�䡣
//		jedis.persist("runoobkey");
//		
//		//EXISTS ������key�Ƿ���ڡ�
//		jedis.exists("runoobkey");
//		
//		//MOVE key db  ����ǰ���ݿ�(Ĭ��Ϊ0)��key�ƶ������������ݿ�db���С�
//		//�����ǰ���ݿ�(Դ���ݿ�)�͸������ݿ�(Ŀ�����ݿ�)����ͬ���ֵĸ���key������key�������ڵ�ǰ���ݿ⣬��ôMOVEû���κ�Ч����
//		jedis.move("foo", 1);
//		
//		//RENAME key newkey  ��key����Ϊnewkey����key��newkey��ͬ����key������ʱ������һ������
//		//��newkey�Ѿ�����ʱ��RENAME������Ǿ�ֵ�� 
//		jedis.rename("site-list", "list");
//		
//		//TYPE key ����key�������ֵ�����͡�
//		String type1 = jedis.type("list");
//		log.info(type1);//none(key������),string(�ַ���),list(�б�),set(����),zset(����),hash(��ϣ��) 
//		
//		//EXPIRE key seconds Ϊ����key��������ʱ�䡣��key����ʱ�����ᱻ�Զ�ɾ����
//		jedis.expire("foo", 5);
//		//EXPIREAT EXPIREAT�����ú�EXPIREһ����������Ϊkey��������ʱ�䡣��ͬ����EXPIREAT������ܵ�ʱ�������UNIXʱ���(unix timestamp)��
//		
//		//һ��SORT�÷� ��򵥵�SORTʹ�÷�����SORT key��
//		jedis.lpush("sort", "1");
//		jedis.lpush("sort", "4");
//		jedis.lpush("sort", "6");
//		jedis.lpush("sort", "3");
//		jedis.lpush("sort", "8");
//		
//		List<String> list = jedis.sort("sort");//Ĭ��������
//		for (int i = 0; i < list.size(); i++) {
//			log.info(list.get(i));
//		}
	
		
		
		
		
//		/*-----------------STRING ����---------------------*/
//		
//		//SET key value���ַ���ֵvalue������key��
//		jedis.set("name", "system");
//		jedis.set("password", "123456");
//		jedis.set("address", "�Ϻ�");
//		
//		//SETEX key seconds value��ֵvalue������key������key������ʱ����Ϊseconds(����Ϊ��λ)��
//		jedis.setex("foo", 5, "haha");
//		
//		//MSET key value [key value ...]ͬʱ����һ������key-value�ԡ�
//		jedis.mset("haha","1111","xixi","2222");
//		
//		//redis.flushAll();������е�key
//		
//		//dbSize�Ƕ��ٸ�key�ĸ��� 
//		Long size1 = jedis.dbSize();
//		log.info(size1);
//		
//		//APPEND key value���key�Ѿ����ڲ�����һ���ַ�����APPEND���value׷�ӵ�keyԭ����ֵ֮��
//		jedis.append("address", "������");		
//		
//		//GET key ����key���������ַ���ֵ   
//		String address1 = jedis.get("address");
//		log.info(address1);
//		
//		//MGET key [key ...] ��������(һ������)����key��ֵ 
//		List<String> list = jedis.mget("haha","xixi");
//		for (int i = 0; i < list.size(); i++) {
//			log.info(list.get(i));
//		}
//		
//		//DECR key��key�д��������ֵ��һ��
//		//DECRBY key decrement��key�������ֵ��ȥ����decrement��
//		//INCR key ��key�д��������ֵ��һ��
//		//INCRBY key increment ��key�������ֵ��������increment��
		
		
		
		
		
		
//		/*---------------------Hash ����-------------------------*/
//		
//		//HSET key field value����ϣ��key�е���field��ֵ��Ϊvalue��
//		jedis.hset("website", "google", "www.google.cn");   
//        jedis.hset("website", "baidu", "www.baidu.com");   
//        jedis.hset("website", "sina", "www.sina.com");
//        
//        //HMSET key field value [field value ...] ͬʱ�����field - value(��-ֵ)�����õ���ϣ��key�С�
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("cardid", "123456");
//        map.put("username", "jzkangta");
//        jedis.hmset("hash", map);
//        
//        //HGET key field���ع�ϣ��key�и�����field��ֵ��
//        String name1 = jedis.hget("hash", "username");
//        log.info(name1);
//        
//        //HMGET key field [field ...]���ع�ϣ��key�У�һ�������������ֵ��
//        List<String> list2 = jedis.hmget("website", "google", "baidu", "sina");
//        for (int i = 0; i < list2.size(); i++) {
//        	log.info(list2.get(i));
//        }
//        
//        //HGETALL key���ع�ϣ��key�У����е����ֵ��
//        Map<String, String> map1 = jedis.hgetAll("website");
//        for (Map.Entry<String, String> entry : map1.entrySet()) {
//        	log.info("key:" + entry.getKey() + "   value:" + entry.getValue());
//        }
//        
//        //HDEL key field [field ...]ɾ����ϣ��key�е�һ������ָ����   
//        //HLEN key ���ع�ϣ��key�����������   
//        //HEXISTS key field�鿴��ϣ��key�У�������field�Ƿ���ڡ�   
//        //HINCRBY key field incrementΪ��ϣ��key�е���field��ֵ��������increment��   
//        //HKEYS key���ع�ϣ��key�е�������   
//        //HVALS key���ع�ϣ��key�е�����ֵ��
		
		
		
		
		
		
		
		
//		/*---------------------LIST ����-------------------------*/
//		
//		//LPUSH key value [value ...]��ֵvalue���뵽�б�key�ı�ͷ��
//		jedis.lpush("list", "abc");
//		jedis.lpush("list", "def");
//		jedis.lpush("list", "ghi");
//		jedis.lpush("list", "jkl");
//		
//		//LRANGE key start stop�����б�key��ָ�������ڵ�Ԫ�أ�������ƫ����start��stopָ����
//		//�±�(index)����start��stop����0Ϊ�ף�Ҳ����˵����0��ʾ�б�ĵ�һ��Ԫ�أ���1��ʾ�б�ĵڶ���Ԫ�أ��Դ����ơ�
//		//��Ҳ����ʹ�ø����±꣬��-1��ʾ�б�����һ��Ԫ�أ�-2��ʾ�б�ĵ����ڶ���Ԫ�أ��Դ����ơ�
//		List<String> list3 = jedis.lrange("list", 0, -1);
//		for (int i = 0; i < list3.size(); i++) {
//			log.info(list3.get(i));
//		}
//		
//		//LLEN key�����б�key�ĳ��ȡ�   
//        //LREM key count value���ݲ���count��ֵ���Ƴ��б��������value��ȵ�Ԫ�ء�
		
		
		
		
		
		
//		/*---------------------SET ����-------------------------*/
//		
//		//SADD key member [member ...]��memberԪ�ؼ��뵽����key���С�
//		jedis.sadd("testSet", "s1");   
//        jedis.sadd("testSet", "s2");   
//        jedis.sadd("testSet", "s3");   
//        jedis.sadd("testSet", "s4");   
//        jedis.sadd("testSet", "s5"); 
//        
//        //SMEMBERS key���ؼ���key�е����г�Ա��
//        Set<String> set1 = jedis.smembers("testSet");
//        Iterator<String> it1 = set1.iterator();
//        while (it1.hasNext()) {
//        	Object obj1 = it1.next();
//        	log.info(obj1);
//        }
//        
//        //SREM key member�Ƴ������е�memberԪ�ء�
//        jedis.srem("testSet", "s5");        
//        set1 = jedis.smembers("testSet");
//        it1 = set1.iterator();
//        while (it1.hasNext()) {
//        	Object obj1 = it1.next();
//        	log.info(obj1);
//        }
//        
//        //SISMEMBER key member�ж�memberԪ���Ƿ��Ǽ���key�ĳ�Ա���ǣ�true��������false��
//        log.info(jedis.sismember("testSet", "s4"));
//        
//        //SCARD key���ؼ���key�Ļ���(������Ԫ�ص�����)��   
//        //SMOVE source destination member��memberԪ�ش�source�����ƶ���destination���ϡ�   
//            
//        //SINTER key [key ...]����һ�����ϵ�ȫ����Ա���ü��������и������ϵĽ�����   
//        //SINTERSTORE destination key [key ...]�������ͬ��SINTER��������������浽destination���ϣ������Ǽ򵥵ط��ؽ����   
//        //SUNION key [key ...]����һ�����ϵ�ȫ����Ա���ü��������и������ϵĲ�����   
//        //SUNIONSTORE destination key [key ...]�������ͬ��SUNION��������������浽destination���ϣ������Ǽ򵥵ط��ؽ������   
//        //SDIFF key [key ...]����һ�����ϵ�ȫ����Ա���ü��������и������ϵĲ ��   
//        //SDIFFSTORE destination key [key ...]�������ͬ��SDIFF��������������浽destination���ϣ������Ǽ򵥵ط��ؽ������ 
	}
}
