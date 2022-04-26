package java.com.job;


import com.ruoyi.job.domain.SysJob;
import com.ruoyi.job.domain.SysJobLog;
import com.ruoyi.job.mapper.SysJobLogMapper;
import com.ruoyi.job.mapper.SysJobMapper;
import com.ruoyi.job.service.ISysJobLogService;
import com.ruoyi.job.service.ISysJobService;
import com.ruoyi.job.task.RyTask;
import com.ruoyi.job.util.CronUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.quartz.SchedulerException;

@RequiredArgsConstructor
@Slf4j
class ServiceExceptionTest {
    private final SysJobLogMapper sysJobLogMapper;
    private final SysJobMapper sysJobMapper;
    private final ISysJobLogService iSysJobLogService;
    private final ISysJobService iSysJobService;

    @BeforeEach
    void setUp() {
        System.out.println("up");
    }

    @AfterEach
    void tearDown() {
        System.out.println("down");
    }

    @Test
    void testThirdTest() {
        SysJob sj = new SysJob();
        sj.setJobName("");
        sj.setJobGroup("");
        sj.setInvokeTarget("");
        sj.setCronExpression("");
        sj.setJobId(1L);
        sj.setMisfirePolicy("");
        sj.setConcurrent("");
        SysJobLog sjl = new SysJobLog();
        sjl.setJobLogId(1L);
        sjl.setInvokeTarget("");
        log.info("{}", sjl.getInvokeTarget());
        log.info("{}", sysJobLogMapper.selectJobLogAll());
        log.info("{}", sysJobMapper.deleteJobByIds(null));
        log.info("{}", iSysJobLogService.deleteJobLogById(1L));
        try {
            log.info("{}", iSysJobService.deleteJob(null));
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        log.info("{}", iSysJobService.checkCronExpressionIsValid("1L"));
        RyTask ryTask = new RyTask();
        ryTask.ryMultipleParams("", true, 1L, 1.0, 1);
        ryTask.ryNoParams();
        ryTask.ryParams("");
        log.info("{}", CronUtils.getInvalidMessage(""));

    }
}