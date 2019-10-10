package cn.zcp.sso;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-10-10 17:54
 * @describe sso-parent <描述>
 */
public class AppDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1.拒绝连接上的原因[启动使用指定配置文件启动#./src/redis-server ./redis.conf &]
         * 1.1 关闭防火墙/etc/init.d/iptables stop或者service iptables stop
         * 1.2 redis.conf中修改【注释 bind 127.0.0.1】
         * 1.3[将protected-mode yes 改为no]--先试试前面两种.
         */
        JedisPool jedisPool = new JedisPool("192.168.81.240",6379);
        Jedis jedis = jedisPool.getResource();
        jedis.set("test","1111");
    }
}
