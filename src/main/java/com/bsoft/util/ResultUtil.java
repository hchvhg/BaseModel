package com.bsoft.util;

/**
 * ResultUtil
 * 
 * @description 结果处理工具
 * @author zk
 * @date 2018年12月3日 下午3:27:48
 * @version 1.0
 */
public final class ResultUtil {

    /**
     * 操作成功,并返回数据
     * 
     * @param data 需要返回的数据
     * @return
     */
    public static final Result SUCCESS(Object data) {
        Result result = new Result();
        result.put(Result.code, ResultDic.SUCCESS.getCode());
        result.put(Result.msg, ResultDic.SUCCESS.getMsg());
        result.put(Result.data, data);
        return result;
    }

    /**
     * 操作成功,无返回数据
     * 
     * @return
     */
    public static final Result SUCCESS() {
        Result result = new Result();
        result.put(Result.code, ResultDic.SUCCESS.getCode());
        result.put(Result.msg, ResultDic.SUCCESS.getMsg());
        return result;
    }

    /**
     * 操作错误,并返回数据
     * 
     * @param dic 错误字典
     * @param error 需要返回的数据
     * @return
     */
    public static final Result ERROR(ResultDic dic, Object error) {
        Result result = new Result();
        result.put(Result.code, dic.getCode());
        result.put(Result.msg, dic.getMsg());
        result.put(Result.data, error);
        return result;
    }

    /**
     * 操作错误,无返回数据
     * 
     * @param dic 错误字典
     * @return
     */
    public static final Result ERROR(ResultDic dic) {
        Result result = new Result();
        result.put(Result.code, dic.getCode());
        result.put(Result.msg, dic.getMsg());
        return result;
    }

    /**
     * 自定义返回结果
     * 
     * @param code 编码
     * @param msg 信息
     * @param data 返回的数据
     * @return
     */
    public static final Result DIY_RESULT(ResultCode code, String msg, Object data) {
        Result result = new Result();
        result.put(Result.code, code.getCode());
        result.put(Result.msg, msg);
        result.put(Result.data, data);
        return result;
    }

}
