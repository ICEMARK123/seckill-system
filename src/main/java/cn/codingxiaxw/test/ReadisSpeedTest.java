package cn.codingxiaxw.test;

import cn.codingxiaxw.dao.cache.RedisDao;
import cn.codingxiaxw.entity.Seckill;

import java.util.Date;

/**
 * @author ICEMARK
 * @date 2018/1/17 14:20
 * @email 1541914268@qq.com
 * @description
 */
public class ReadisSpeedTest {
    public static void main(String[] args) {
        Seckill seckill = new Seckill();
        seckill.setCreateTime(new Date());
        seckill.setEndTime(new Date());
        seckill.setName("李红利");
        seckill.setNumber(100);
        seckill.setSeckillId(123213);
        seckill.setStartTime(new Date());
        RedisDao redisDao = new RedisDao("127.0.0.1", 6379);
        long startTime = System.currentTimeMillis();
        redisDao.putSeckill(seckill);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
