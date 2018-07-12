package cn.codingxiaxw.exception;

/**
 * 重复秒杀异常，是一个运行期异常，不需要我们手动try catch
 * Mysql只支持运行期异常的回滚操作
 * Created by codingBoy on 16/11/27.
 */
public class RepeatKillException extends SeckillException {

	//秒杀信息
    public RepeatKillException(String message) {
        super(message);
    }

	//重复秒杀异常
    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
