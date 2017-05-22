package com.wms.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.wms.ads.readResultBase;
import com.wms.ads.ssx;
import com.wms.entity.LogTable;
import com.wms.entity.Ssx;
import com.wms.serviceImpl.LogTableService;
import com.wms.serviceImpl.SsxService;
import com.wms.serviceImpl.StockerFaultService;

public class SsxUpdateThread extends QuartzJobBean {

	/**
	 * 输送线读取地址
	 */
	// 读取到Byte
	public final static String RKX_STATE = "GVL_COM.RKX_STATE";
	public final static String YLX1_STATE = "GVL_COM.YLX1_STATE";
	public final static String CPX1_STATE = "GVL_COM.CPX1_STATE";
	public final static String YLX2_STATE = "GVL_COM.YLX2_STATE";
	public final static String CPX2_STATE = "GVL_COM.CPX2_STATE";
	public final static String CKX_STATE = "GVL_COM.CKX_STATE";
	// 读取到int
	public final static String Unit_Task = "GVL_COM.Unit_Task";

	/**
	 * 堆垛机和输送线都要读取的地址<br\>
	 * 读取到的是int
	 */
	public final static String WorkStatus = "GVL_COM.WorkStatus";
	public final static String ErrorCode = "GVL_COM.ErrorCode";

	private SsxService mSsxServer;
	private StockerFaultService mStockerFaultService;
	private LogTableService mLogTableService;
	private WebApplicationContext mContext;
	Log log;

	// 调度工厂实例化后，经过timeout时间开始执行调度
	public void setTimeout(int timeout) {
	}

	// 初始化
	public void init() {
		mContext = ContextLoader.getCurrentWebApplicationContext();
		log = LogFactory.getLog(this.getClass());
	}

	// 任务调用
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		init();
		try {

			System.out
					.println("-----------------输送线更新线程：定时任务执行中…---------------------------");
			System.out.println(Thread.currentThread().getName());
			System.out.println("实例数量:" + mContext.getBeanDefinitionCount());
			mSsxServer = mContext.getBean(SsxService.class);
			mStockerFaultService = mContext.getBean(StockerFaultService.class);
			mLogTableService = mContext.getBean(LogTableService.class);

			ssx plc_ssx = new ssx();

			readResultBase result;
			Ssx model_ssx = new Ssx();
			/**
			 * -------------------输送线读取值
			 */
			// 入库输送线状态
			result = plc_ssx.RKX_STATE();
			if (result.nError == 0) {
				model_ssx.setPlcname(RKX_STATE);
				model_ssx.setValue(byteToBit(result.btValue));
				model_ssx.setId(1);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.RKX_STATE failed");
			}
			// 1#切割机原料线状态
			result = plc_ssx.YLX1_STATE();
			if (result.nError == 0) {
				model_ssx.setPlcname(YLX1_STATE);
				model_ssx.setValue(byteToBit(result.btValue));
				model_ssx.setId(2);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.YLX1_STATE failed");
			}
			// 1#切割机成品线状态
			result = plc_ssx.CPX1_STATE();
			if (result.nError == 0) {
				model_ssx.setPlcname(CPX1_STATE);
				model_ssx.setValue(byteToBit(result.btValue));
				model_ssx.setId(3);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.CPX1_STATE failed");
			}
			// 2#切割机原料线状态
			result = plc_ssx.YLX2_STATE();
			if (result.nError == 0) {
				model_ssx.setPlcname(RKX_STATE);
				model_ssx.setValue(byteToBit(result.btValue));
				model_ssx.setId(4);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.RKX_STATE failed");
			}
			// 2#切割机成品线状态
			result = plc_ssx.CPX2_STATE();
			if (result.nError == 0) {
				model_ssx.setPlcname(CPX2_STATE);
				model_ssx.setValue(byteToBit(result.btValue));
				model_ssx.setId(5);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.CPX2_STATE failed");
			}
			// 出库输送线状态
			result = plc_ssx.CKX_STATE();
			if (result.nError == 0) {
				model_ssx.setPlcname(CKX_STATE);
				model_ssx.setValue(byteToBit(result.btValue));
				model_ssx.setId(6);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("---------------------------------------");
				log.error("---The read GVL_COM.CKX_STATE failed---");
				log.error("---------------------------------------");
			}
			// 输送线当前工作状态
			result = plc_ssx.WorkStatus();
			if (result.nError == 0) {
				model_ssx.setPlcname(WorkStatus);
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(7);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.WorkStatus failed");
			}
			// 当前输送错误代码
			result = plc_ssx.ErrorCode();
			if (result.nError == 0) {
				model_ssx.setPlcname(ErrorCode);
				String errorCode = String.valueOf(result.nValue);
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(8);
				mSsxServer.UpdateSsx(model_ssx);
				if (!errorCode.equals("0")) {
					log.error("输送线报警代码：" + errorCode);
					LogTable model = new LogTable();
					model.setLogTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
							.format(new Date()));
					model.setType("输送线报警");
					model.setTitle(mStockerFaultService
							.GetStockerFaultBy(errorCode, "").get(0)
							.getMeaning());
					model.setInfo("未处理");
					mLogTableService.AddLogTable(model);
				}
			} else {
				log.error("The read GVL_COM.ErrorCode failed");
			}
			// 当前输送单元任务ID
			result = plc_ssx.Unit_Task(1);
			if (result.nError == 0) {
				model_ssx.setPlcname(Unit_Task + "[1]");
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(9);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.Unit_Task failed");
			}
			result = plc_ssx.Unit_Task(2);
			if (result.nError == 0) {
				model_ssx.setPlcname(Unit_Task + "[2]");
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(10);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.Unit_Task failed");
			}
			result = plc_ssx.Unit_Task(3);
			if (result.nError == 0) {
				model_ssx.setPlcname(Unit_Task + "[3]");
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(11);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.Unit_Task failed");
			}
			result = plc_ssx.Unit_Task(4);
			if (result.nError == 0) {
				model_ssx.setPlcname(Unit_Task + "[4]");
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(12);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.Unit_Task failed");
			}
			result = plc_ssx.Unit_Task(5);
			if (result.nError == 0) {
				model_ssx.setPlcname(Unit_Task + "[5]");
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(13);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				log.error("The read GVL_COM.Unit_Task failed");
			}
			result = plc_ssx.Unit_Task(6);
			if (result.nError == 0) {
				model_ssx.setPlcname(Unit_Task + "[6]");
				model_ssx.setValue(String.valueOf(result.nValue));
				model_ssx.setId(14);
				mSsxServer.UpdateSsx(model_ssx);
			} else {
				System.err.println("---------------------------------------");
				System.err.println("---The read GVL_COM.Unit_Task failed---");
				System.err.println("---------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	/**
	 * byte转化成bit类型字符串
	 * 
	 * @param b
	 *            被转化byte
	 * @return String类型的bit
	 */
	public String byteToBit(byte b) {
		return "" + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)
				+ (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)
				+ (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)
				+ (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);
	}
}
