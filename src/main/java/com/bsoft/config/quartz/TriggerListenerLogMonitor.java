package com.bsoft.config.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;
import org.springframework.stereotype.Component;

/**
 * 
 * TriggerListenerLogMonitor
 * @description 任务调度监听类
 * @author zk
 * @date 2018年11月29日 上午10:40:20
 * @version 1.0
 */
@Component
class TriggerListenerLogMonitor implements TriggerListener {

    @Override
    public String getName() {
        return "TriggerListenerLogMonitor";
    }

    // 当与监听器相关联的 Trigger 被触发，Job 上的 execute() 方法将要被执行时，Scheduler 就调用这个方法。
    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println("TriggerListenerLogMonitor类:" + context.getTrigger().getKey().getName() + " 被执行");
    }

    /**
     * 在 Trigger 触发后，Job 将要被执行时由 Scheduler 调用这个方法。 TriggerListener 给了一个选择去否决 Job 的执行。 假如这个方法返回 true，这个 Job 将不会为此次
     * Trigger 触发而得到执行。
     */
    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        return false;
    }

    /**
     * Scheduler 调用这个方法是在 Trigger 错过触发时。 如这个方法的 JavaDoc 所指出的，你应该关注此方法中持续时间长的逻辑： 在出现许多错过触发的 Trigger 时， 长逻辑会导致骨牌效应。
     * 你应当保持这上方法尽量的小。
     */
    @Override
    public void triggerMisfired(Trigger trigger) {
        System.out.println("Job错过触发");
    }

    /**
     * Trigger 被触发并且完成了 Job 的执行时，Scheduler 调用这个方法。 这不是说这个 Trigger 将不再触发了，而仅仅是当前 Trigger 的触发(并且紧接着的 Job 执行) 结束时。 这个
     * Trigger 也许还要在将来触发多次的。
     */
    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context,
        Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println("Job执行完毕,Trigger完成");
    }
}
