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
		
//		/*---------------------key操作-----------------------*/
//		
//		//KEYS
//		Set<String> keys = jedis.keys("*");//列出所有的key，查找特定的key如：redis.keys("foo")
//		Iterator<String> t1 = keys.iterator();
//		while(t1.hasNext()) {
//			String key = t1.next();
//			log.info(key);
//		}
//		
//		//DEL 移除给定的一个或多个key。如果key不存在，则忽略该命令。
//		jedis.del("name1");
//		
//		//TTL 返回给定key的剩余生存时间(time to live)(以秒为单位)
//		Long ttl1 = jedis.ttl("runoobkey");
//		log.info(ttl1);
//		
//		//PERSIST key 移除给定key的生存时间。
//		jedis.persist("runoobkey");
//		
//		//EXISTS 检查给定key是否存在。
//		jedis.exists("runoobkey");
//		
//		//MOVE key db  将当前数据库(默认为0)的key移动到给定的数据库db当中。
//		//如果当前数据库(源数据库)和给定数据库(目标数据库)有相同名字的给定key，或者key不存在于当前数据库，那么MOVE没有任何效果。
//		jedis.move("foo", 1);
//		
//		//RENAME key newkey  将key改名为newkey。当key和newkey相同或者key不存在时，返回一个错误。
//		//当newkey已经存在时，RENAME命令将覆盖旧值。 
//		jedis.rename("site-list", "list");
//		
//		//TYPE key 返回key所储存的值的类型。
//		String type1 = jedis.type("list");
//		log.info(type1);//none(key不存在),string(字符串),list(列表),set(集合),zset(有序集),hash(哈希表) 
//		
//		//EXPIRE key seconds 为给定key设置生存时间。当key过期时，它会被自动删除。
//		jedis.expire("foo", 5);
//		//EXPIREAT EXPIREAT的作用和EXPIRE一样，都用于为key设置生存时间。不同在于EXPIREAT命令接受的时间参数是UNIX时间戳(unix timestamp)。
//		
//		//一般SORT用法 最简单的SORT使用方法是SORT key。
//		jedis.lpush("sort", "1");
//		jedis.lpush("sort", "4");
//		jedis.lpush("sort", "6");
//		jedis.lpush("sort", "3");
//		jedis.lpush("sort", "8");
//		
//		List<String> list = jedis.sort("sort");//默认是升序
//		for (int i = 0; i < list.size(); i++) {
//			log.info(list.get(i));
//		}
	
		
		
		
		
//		/*-----------------STRING 操作---------------------*/
//		
//		//SET key value将字符串值value关联到key。
//		jedis.set("name", "system");
//		jedis.set("password", "123456");
//		jedis.set("address", "上海");
//		
//		//SETEX key seconds value将值value关联到key，并将key的生存时间设为seconds(以秒为单位)。
//		jedis.setex("foo", 5, "haha");
//		
//		//MSET key value [key value ...]同时设置一个或多个key-value对。
//		jedis.mset("haha","1111","xixi","2222");
//		
//		//redis.flushAll();清空所有的key
//		
//		//dbSize是多少个key的个数 
//		Long size1 = jedis.dbSize();
//		log.info(size1);
//		
//		//APPEND key value如果key已经存在并且是一个字符串，APPEND命令将value追加到key原来的值之后。
//		jedis.append("address", "奉贤区");		
//		
//		//GET key 返回key所关联的字符串值   
//		String address1 = jedis.get("address");
//		log.info(address1);
//		
//		//MGET key [key ...] 返回所有(一个或多个)给定key的值 
//		List<String> list = jedis.mget("haha","xixi");
//		for (int i = 0; i < list.size(); i++) {
//			log.info(list.get(i));
//		}
//		
//		//DECR key将key中储存的数字值减一。
//		//DECRBY key decrement将key所储存的值减去减量decrement。
//		//INCR key 将key中储存的数字值增一。
//		//INCRBY key increment 将key所储存的值加上增量increment。
		
		
		
		
		
		
//		/*---------------------Hash 操作-------------------------*/
//		
//		//HSET key field value将哈希表key中的域field的值设为value。
//		jedis.hset("website", "google", "www.google.cn");   
//        jedis.hset("website", "baidu", "www.baidu.com");   
//        jedis.hset("website", "sina", "www.sina.com");
//        
//        //HMSET key field value [field value ...] 同时将多个field - value(域-值)对设置到哈希表key中。
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("cardid", "123456");
//        map.put("username", "jzkangta");
//        jedis.hmset("hash", map);
//        
//        //HGET key field返回哈希表key中给定域field的值。
//        String name1 = jedis.hget("hash", "username");
//        log.info(name1);
//        
//        //HMGET key field [field ...]返回哈希表key中，一个或多个给定域的值。
//        List<String> list2 = jedis.hmget("website", "google", "baidu", "sina");
//        for (int i = 0; i < list2.size(); i++) {
//        	log.info(list2.get(i));
//        }
//        
//        //HGETALL key返回哈希表key中，所有的域和值。
//        Map<String, String> map1 = jedis.hgetAll("website");
//        for (Map.Entry<String, String> entry : map1.entrySet()) {
//        	log.info("key:" + entry.getKey() + "   value:" + entry.getValue());
//        }
//        
//        //HDEL key field [field ...]删除哈希表key中的一个或多个指定域。   
//        //HLEN key 返回哈希表key中域的数量。   
//        //HEXISTS key field查看哈希表key中，给定域field是否存在。   
//        //HINCRBY key field increment为哈希表key中的域field的值加上增量increment。   
//        //HKEYS key返回哈希表key中的所有域。   
//        //HVALS key返回哈希表key中的所有值。
		
		
		
		
		
		
		
		
//		/*---------------------LIST 操作-------------------------*/
//		
//		//LPUSH key value [value ...]将值value插入到列表key的表头。
//		jedis.lpush("list", "abc");
//		jedis.lpush("list", "def");
//		jedis.lpush("list", "ghi");
//		jedis.lpush("list", "jkl");
//		
//		//LRANGE key start stop返回列表key中指定区间内的元素，区间以偏移量start和stop指定。
//		//下标(index)参数start和stop都以0为底，也就是说，以0表示列表的第一个元素，以1表示列表的第二个元素，以此类推。
//		//你也可以使用负数下标，以-1表示列表的最后一个元素，-2表示列表的倒数第二个元素，以此类推。
//		List<String> list3 = jedis.lrange("list", 0, -1);
//		for (int i = 0; i < list3.size(); i++) {
//			log.info(list3.get(i));
//		}
//		
//		//LLEN key返回列表key的长度。   
//        //LREM key count value根据参数count的值，移除列表中与参数value相等的元素。
		
		
		
		
		
		
//		/*---------------------SET 操作-------------------------*/
//		
//		//SADD key member [member ...]将member元素加入到集合key当中。
//		jedis.sadd("testSet", "s1");   
//        jedis.sadd("testSet", "s2");   
//        jedis.sadd("testSet", "s3");   
//        jedis.sadd("testSet", "s4");   
//        jedis.sadd("testSet", "s5"); 
//        
//        //SMEMBERS key返回集合key中的所有成员。
//        Set<String> set1 = jedis.smembers("testSet");
//        Iterator<String> it1 = set1.iterator();
//        while (it1.hasNext()) {
//        	Object obj1 = it1.next();
//        	log.info(obj1);
//        }
//        
//        //SREM key member移除集合中的member元素。
//        jedis.srem("testSet", "s5");        
//        set1 = jedis.smembers("testSet");
//        it1 = set1.iterator();
//        while (it1.hasNext()) {
//        	Object obj1 = it1.next();
//        	log.info(obj1);
//        }
//        
//        //SISMEMBER key member判断member元素是否是集合key的成员。是（true），否则（false）
//        log.info(jedis.sismember("testSet", "s4"));
//        
//        //SCARD key返回集合key的基数(集合中元素的数量)。   
//        //SMOVE source destination member将member元素从source集合移动到destination集合。   
//            
//        //SINTER key [key ...]返回一个集合的全部成员，该集合是所有给定集合的交集。   
//        //SINTERSTORE destination key [key ...]此命令等同于SINTER，但它将结果保存到destination集合，而不是简单地返回结果集   
//        //SUNION key [key ...]返回一个集合的全部成员，该集合是所有给定集合的并集。   
//        //SUNIONSTORE destination key [key ...]此命令等同于SUNION，但它将结果保存到destination集合，而不是简单地返回结果集。   
//        //SDIFF key [key ...]返回一个集合的全部成员，该集合是所有给定集合的差集 。   
//        //SDIFFSTORE destination key [key ...]此命令等同于SDIFF，但它将结果保存到destination集合，而不是简单地返回结果集。 
	}
}
