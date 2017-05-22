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

import com.wms.ads.ddj;
import com.wms.ads.readResultBase;
import com.wms.entity.Ddj;
import com.wms.entity.LogTable;
import com.wms.serviceImpl.ClfaultService;
import com.wms.serviceImpl.DdjService;
import com.wms.serviceImpl.LogTableService;

public class DdjUpdateThread extends QuartzJobBean {

	/**
	 * 堆垛机读取地址
	 */
	// 读取到boolean
	public final static String GetDone = "GVL_COM.GetDone";
	public final static String PutDone = "GVL_COM.PutDone";
	public final static String HC_MID = "GVL_COM.HC_MID";
	public final static String Line_Pos = "GVL_COM.Line_Pos";
	public final static String GetCeng_Pos = "GVL_COM.GetCeng_Pos";
	public final static String PutCeng_Pos = "GVL_COM.PutCeng_Pos";
	public final static String ZHT_YH = "GVL_COM.ZHT_YH";
	public final static String RF_BR_L = "GVL_COM.RF_BR_L";
	public final static String RF_BR_R = "GVL_COM.RF_BR_R";

	// 读取到int
	public final static String C_Task_Hang = "GVL_COM.C_Task_Hang";
	public final static String C_Task_Line = "GVL_COM.C_Task_Line";
	public final static String C_Task_Ceng = "GVL_COM.C_Task_Ceng";
	public final static String C_Task_Station = "GVL_COM.C_Task_Station";
	public final static String C_Hang = "GVL_COM.C_Hang";
	public final static String C_Line = "GVL_COM.C_Line";
	public final static String C_Ceng = "GVL_COM.C_Ceng";
	public final static String C_Station = "GVL_COM.C_Station";
	public final static String Axis_X = "GVL_COM.Axis_X";
	public final static String Axis_Y = "GVL_COM.Axis_Y";
	public final static String Axis_Z = "GVL_COM.Axis_Z";
	public final static String C_ACT = "GVL_COM.C_ACT";

	// 数据类型待定
	public final static String L_RF_R = "GVL_COM.L_RF_R";
	public final static String R_RF_R = "GVL_COM.R_RF_R";
	/**
	 * 堆垛机和输送线都要读取的地址<br\>
	 * 读取到的是int
	 */
	public final static String WorkStatus = "GVL_COM.WorkStatus";
	public final static String ErrorCode = "GVL_COM.ErrorCode";

	private DdjService mDdjServer;
	private LogTableService mLogTableService;
	private ClfaultService mClfaultService;
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
					.println("----------------------------堆垛机更新线程：定时任务执行中…----------------");
			System.out.println(Thread.currentThread().getName());
			System.out.println("实例数量:" + mContext.getBeanDefinitionCount());
			mDdjServer = mContext.getBean(DdjService.class);
			mLogTableService = mContext.getBean(LogTableService.class);
			mClfaultService = mContext.getBean(ClfaultService.class);

			ddj plc_ddj = new ddj();

			readResultBase result;
			Ddj model_ddj = new Ddj();

			/**
			 * -------------------堆垛机读取值
			 */
			// 堆垛机取货完成
			result = plc_ddj.GetDone();
			if (result.nError == 0) {
				model_ddj.setPlcname(GetDone);
				System.out.println("plcname:" + GetDone);
				String i = result.bValue ? "1" : "0";
				model_ddj.setId(1);
				model_ddj.setValue(result.bValue ? "1" : "0");
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.GetDone failed");
			}
			// 堆垛机防火完成
			result = plc_ddj.PutDone();
			if (result.nError == 0) {
				model_ddj.setPlcname(PutDone);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(2);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.PutDone failed");
			}
			// 堆垛机货叉在中点
			result = plc_ddj.HC_MID();
			if (result.nError == 0) {
				model_ddj.setPlcname(HC_MID);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(3);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.HC_MID failed");
			}
			// 堆垛机列停准
			result = plc_ddj.Line_Pos();
			if (result.nError == 0) {
				model_ddj.setPlcname(Line_Pos);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(4);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.Line_Pos failed");
			}
			// 堆垛机在放货层
			result = plc_ddj.GetCeng_Pos();
			if (result.nError == 0) {
				model_ddj.setPlcname(GetCeng_Pos);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(5);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.GetCeng_Pos failed");
			}
			// 堆垛机在取货层
			result = plc_ddj.PutCeng_Pos();
			if (result.nError == 0) {
				model_ddj.setPlcname(PutCeng_Pos);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(6);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.PutCeng_Pos failed");
			}
			// 堆垛机载货台有货
			result = plc_ddj.ZHT_YH();
			if (result.nError == 0) {
				model_ddj.setPlcname(ZHT_YH);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(7);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.ZHT_YH failed");
			}
			// 左侧开始读取RFID标签
			result = plc_ddj.RF_BR_L();
			if (result.nError == 0) {
				model_ddj.setPlcname(RF_BR_L);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(8);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.RF_BR_L failed");
			}
			// 右侧开始读取RFID标签
			result = plc_ddj.RF_BR_R();
			if (result.nError == 0) {
				model_ddj.setPlcname(RF_BR_R);
				model_ddj.setValue(result.bValue ? "1" : "0");
				model_ddj.setId(9);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.RF_BR_R failed");
			}
			// 当前任务行
			result = plc_ddj.C_Task_Hang();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Task_Hang);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(10);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Task_Hang failed");
			}
			// 当前任务列
			result = plc_ddj.C_Task_Line();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Task_Line);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(11);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Task_Line failed");
			}
			// 当前任务层
			result = plc_ddj.C_Task_Ceng();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Task_Ceng);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(12);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Task_Ceng failed");
			}
			// 当前任务站台
			result = plc_ddj.C_Task_Station();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Task_Station);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(13);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Task_Station failed");
			}
			// 当前位置行
			result = plc_ddj.C_Hang();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Hang);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(14);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Hang failed");
			}
			// 当前位置列
			result = plc_ddj.C_Line();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Line);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(15);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Line failed");
			}
			// 当前位置层
			result = plc_ddj.C_Ceng();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Ceng);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(16);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Ceng failed");
			}
			// 当前位置站台
			result = plc_ddj.C_Station();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_Station);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(17);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_Station failed");
			}
			// 堆垛机当前状态
			result = plc_ddj.WorkStatus();
			if (result.nError == 0) {
				model_ddj.setPlcname(WorkStatus);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(18);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.WorkStatus failed");
			}
			// 水平定位值
			result = plc_ddj.Axis_X();
			if (result.nError == 0) {
				model_ddj.setPlcname(Axis_X);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(19);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.Axis_X failed");
			}
			// 垂直定位值
			result = plc_ddj.Axis_Y();
			if (result.nError == 0) {
				model_ddj.setPlcname(Axis_Y);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(20);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.Axis_Y failed");
			}
			// 货叉编码器值
			result = plc_ddj.Axis_Z();
			if (result.nError == 0) {
				model_ddj.setPlcname(Axis_Z);
				model_ddj.setValue(String.valueOf(result.nValue));
				model_ddj.setId(21);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.Axis_Z failed");
			}
			// 堆垛机错误代码
			result = plc_ddj.ErrorCode();
			if (result.nError == 0) {
				model_ddj.setPlcname(ErrorCode);
				String errorCode = String.valueOf(result.nValue);
				model_ddj.setValue(errorCode);
				model_ddj.setId(22);
				mDdjServer.UpdateDdj(model_ddj);
				if (!errorCode.equals("0")) {
					System.out.println("堆垛机报警" + "错误代码" + errorCode);
					log.error("堆垛机报警" + "错误代码:" + errorCode);
					LogTable model = new LogTable();
					model.setLogTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
							.format(new Date()));
					model.setType("堆垛机报警");
					model.setTitle(mClfaultService.GetClfaultBy(errorCode, "")
							.get(0).getMeaning());
					model.setInfo("未处理");
					mLogTableService.AddLogTable(model);
				}
			} else {
				log.error("The read GVL_COM.ErrorCode failed");
			}
			// 堆垛机当前动作
			result = plc_ddj.C_ACT();
			if (result.nError == 0) {
				model_ddj.setPlcname(C_ACT);
				model_ddj.setValue(String.valueOf(2));
				model_ddj.setId(23);
				mDdjServer.UpdateDdj(model_ddj);
			} else {
				log.error("The read GVL_COM.C_ACT failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}

	}
}
