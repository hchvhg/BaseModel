package com.bsoft.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
 
/**
 * 
 * MyTestJob
 * @description 测试quartz定时任务
 * @author zk
 * @date 2018年11月29日 上午10:55:02
 * @version TODO
 */
public class MyTestJob implements Job{
 
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("test定时任务");
    }
}

