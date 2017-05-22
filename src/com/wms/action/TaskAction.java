package com.wms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionContext;
import com.wms.entity.Ddj;
import com.wms.entity.Material;
import com.wms.entity.Record;
import com.wms.entity.Ssx;
import com.wms.entity.Task;
import com.wms.entity.Warehouse;
import com.wms.entity.WoodPallet;
import com.wms.service.IMaterialService;
import com.wms.service.IDdjService;
import com.wms.service.IRecordService;
import com.wms.service.ISsxService;
import com.wms.service.ITaskService;
import com.wms.service.IWarehouseService;
import com.wms.service.IWoodPalletService;

public class TaskAction {

	private Task task;
	private List<Task> tasklist;
	private Warehouse wh;
	private Material mater;
	private WoodPallet wp;
	private Record record;
	private List<Material> materlist;
	private IWoodPalletService wpservice;
	private IMaterialService materservice;
	private ITaskService taskservice;
	private IDdjService ddjservice;
	private ISsxService ssxservice;
	private IWarehouseService whservice;
	private IRecordService recordservice;
	private Ssx ssx;
	private Ddj ddj;
	private Integer id;
	private String type;
	private String state;
	private String pri;
	private String recTime;
	private String inPosition;
	private String inLine;
	private String outPosition;
	private String outLine;
	private String materStandard;
	private String materAmount;
	private String productStandard;
	private PlcadsAction plcact = new PlcadsAction();
	private MaterialAction materact = new MaterialAction();

	public List<Task> getTasklist() {
		return tasklist;
	}

	public void setTasklist(List<Task> tasklist) {
		this.tasklist = tasklist;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public IRecordService getRecordservice() {
		return recordservice;
	}

	public void setRecordservice(IRecordService recordservice) {
		this.recordservice = recordservice;
	}

	public WoodPallet getWp() {
		return wp;
	}

	public void setWp(WoodPallet wp) {
		this.wp = wp;
	}

	public Material getMater() {
		return mater;
	}

	public void setMater(Material mater) {
		this.mater = mater;
	}

	public IDdjService getDdjservice() {
		return ddjservice;
	}

	public void setDdjservice(IDdjService ddjservice) {
		this.ddjservice = ddjservice;
	}

	public ISsxService getSsxservice() {
		return ssxservice;
	}

	public void setSsxservice(ISsxService ssxservice) {
		this.ssxservice = ssxservice;
	}

	public IWoodPalletService getWpservice() {
		return wpservice;
	}

	public void setWpservice(IWoodPalletService wpservice) {
		this.wpservice = wpservice;
	}

	public Warehouse getWh() {
		return wh;
	}

	public void setWh(Warehouse wh) {
		this.wh = wh;
	}

	public IMaterialService getMaterservice() {
		return materservice;
	}

	public void setMaterservice(IMaterialService materservice) {
		this.materservice = materservice;
	}

	public List<Material> getMaterlist() {
		return materlist;
	}

	public void setMaterlist(List<Material> materlist) {
		this.materlist = materlist;
	}

	public Warehouse getWarehouse() {
		return wh;
	}

	public void setWarehouse(Warehouse wh) {
		this.wh = wh;
	}

	public IWarehouseService getWhservice() {
		return whservice;
	}

	public void setWhservice(IWarehouseService whservice) {
		this.whservice = whservice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPri() {
		return pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}

	public String getRecTime() {
		return recTime;
	}

	public void setRecTime(String recTime) {
		this.recTime = recTime;
	}

	public String getInPosition() {
		return inPosition;
	}

	public void setInPosition(String inPosition) {
		this.inPosition = inPosition;
	}

	public String getInLine() {
		return inLine;
	}

	public void setInLine(String inLine) {
		this.inLine = inLine;
	}

	public String getOutPosition() {
		return outPosition;
	}

	public void setOutPosition(String outPosition) {
		this.outPosition = outPosition;
	}

	public String getOutLine() {
		return outLine;
	}

	public void setOutLine(String outLine) {
		this.outLine = outLine;
	}

	public String getMaterStandard() {
		return materStandard;
	}

	public void setMaterStandard(String materStandard) {
		this.materStandard = materStandard;
	}

	public String getMaterAmount() {
		return materAmount;
	}

	public void setMaterAmount(String materAmount) {
		this.materAmount = materAmount;
	}

	public String getProductStandard() {
		return productStandard;
	}

	public void setProductStandard(String productStandard) {
		this.productStandard = productStandard;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public ITaskService getTaskservice() {
		return taskservice;
	}

	public void setTaskservice(ITaskService taskservice) {
		this.taskservice = taskservice;
	}

	public Ssx getSsx() {
		return ssx;
	}

	public void setSsx(Ssx ssx) {
		this.ssx = ssx;
	}

	public Ddj getDdj() {
		return ddj;
	}

	public void setDdj(Ddj ddj) {
		this.ddj = ddj;
	}

	/**
	 * 任务暂停
	 */
	public void pauseTask() {

	}

	/**
	 * 删除任务
	 * 
	 * @return
	 */
	public String deleteTask() {
		return "deleteTask";
	}

	/**
	 * 任务查询
	 * 
	 * @return
	 */
	public String queryTask() {

		return "queryTask";
	}

	/**
	 * 任务上移
	 * 
	 * @return
	 */
	public String taskMoveUp() {
		return "taskMoveUp";
	}

	/**
	 * 任务下移
	 * 
	 * @return
	 */
	public String taskMoveDown() {
		return "taskMoveDown";
	}

	// 任务列表，传值到tasklist.jsp
	@Action("update_task")
	public String tasklist() {
		tasklist = taskservice.GetAllTask();
		System.out.println("///////////////////--------------"+tasklist.get(0).getInPosition()+"--------///////////////////////////-------------------////////////////////");
		return "tasklist";
	}
	

	/**
	 * 添加任务
	 */
	public String addTask() {
		taskservice.AddTask(task);
		return "addTask";
		// 虚拟任务
		/*
		 * if(type.equals("入库")){
		 * if(!ssxservice.GetSsxById(1).getValue().equals("00000001")){
		 * ActionContext.getContext().getSession().put("error", "上料口无货"); return
		 * "error"; }else if(!ssxservice.GetSsxById(9).getValue().equals("0")){
		 * ActionContext.getContext().getSession().put("error", "入库线占用"); return
		 * "error"; } else{ taskservice.AddTask(task); return "addTask"; // }
		 * 
		 * }else if(type.equals("出库")){
		 * if(!ssxservice.GetSsxById(14).getValue().equals("0")){
		 * ActionContext.getContext().getSession().put("error", "出库线占用"); return
		 * "error"; } else{ wh.setState(1); whservice.UpdateWarehouse(wh);
		 * taskservice.AddTask(task); return "addTask"; } }else
		 * 
		 * //切割任务条件：切割机空闲-原材料足够-材料库位锁定 if(type.equals("切割")){
		 * materlist=materservice.GetMaterialBy("", "", "", "", "", 2.0, 2.0,
		 * 0.2, 0, 100, "", "", materStandard, "", "", "", "", "", "", "", "");
		 * int amount=0,index; for(int i=0;i<materlist.size();i++){
		 * amount+=materlist.get(i).getAmount(); index=i;
		 * if(amount>=Integer.parseInt("materAmount")){ break; } }
		 * if(inLine.equals("2")){//1#切割机
		 * if(!(ssxservice.GetSsxById(2).getValue(
		 * ).equals("0")&&ssxservice.GetSsxById(3).getValue().equals("0"))){
		 * ActionContext.getContext().getSession().put("error", "1#切割机占用");
		 * return "error"; }else if(amount<Integer.parseInt("materAmount")){
		 * ActionContext.getContext().getSession().put("error", "原材料不足"); return
		 * "error"; } else{//库位锁定
		 * whservice.GetWarehouseByhouseId(wh.getId()).setState(2);
		 * taskservice.AddTask(task); return "addTask"; } }else{//2#切割机
		 * if(!(ssxservice
		 * .GetSsxById(3).getValue().equals("0")&&ssxservice.GetSsxById
		 * (4).getValue().equals("0"))){
		 * ActionContext.getContext().getSession().put("error", "2#切割机占用");
		 * return "error"; }else if(amount<Integer.parseInt("materAmount")){
		 * ActionContext.getContext().getSession().put("error", "原材料不足"); return
		 * "error"; } else{
		 * whservice.GetWarehouseByhouseId(wh.getId()).setState(2);
		 * taskservice.AddTask(task); return "addTask"; } }
		 * 
		 * }else // if(type.equals("虚拟任务")){ // taskservice.AddTask(task); //
		 * return "addTask"; // }else {//堆垛任务 taskservice.AddTask(task); return
		 * "addTask"; }
		 */
	}

	/**
	 * 
	 * 
	 * 执行任务
	 * 
	 * @throws InterruptedException
	 * 
	 * */
	public String startTask() {

		System.out.println(id);
		task = taskservice.GetTaskById(id);
		String result;
		// 执行入库任务
		if (task.getType().equals("入库")) {
			RKTask rktask = new RKTask(task);
			new Thread(rktask).start();
			return "starttask";
			/*
			 * result=RKTask(task); if(result.equals("error1")){//超限
			 * ActionContext.getContext().getSession().put("error", "超限，任务已删除");
			 * taskservice.DeleteTask(task); }
			 * if(result.equals("error2")){//标签无信息
			 * ActionContext.getContext().getSession().put("error",
			 * "标签无信息，任务已删除"); taskservice.DeleteTask(task); }
			 * if(result.equals("error3")){//托盘物料与任务不符
			 * ActionContext.getContext().getSession().put("error",
			 * "托盘物料与任务不符"); taskservice.DeleteTask(task); }
			 * if(result.equals("ok")){//
			 * ActionContext.getContext().getSession().put("ok", "完成"); } return
			 * result;
			 */
		} else if (task.getType().equals("切割") || task.getType().equals("出库")) {
			CKTask cktask = new CKTask(task);
			new Thread(cktask).start();
			return "starttask";
		} else {
			// 执行盘库任务
			result = PKTask(task);

			return result;
		}
	}

	/*
	 * //入库任务 private String RKTask(Task task) throws InterruptedException{ int
	 * inline=Integer.parseInt(task.getInLine()); int
	 * inwh=Integer.parseInt(task.getInPosition()); int
	 * hang=whservice.GetWarehouseByhouseId(inwh).getRow(); int
	 * line=whservice.GetWarehouseByhouseId(inwh).getLine(); int
	 * ceng=whservice.GetWarehouseByhouseId(inwh).getFloor();
	 * 
	 * while(ssxservice.GetSsxById(inline+8).getValue().equals("1")){
	 * ActionContext.getContext().getSession().put("wait", "输送线占用");
	 * TimeUnit.SECONDS.sleep(1);
	 * testssx=ssxservice.GetSsxById(inline+8);ssx.setValue
	 * ("0");ssxservice.UpdateSsx(ssx); }
	 * while(!(ddjservice.GetDdjById(18).getValue().equals("3")&&
	 * ddjservice.GetDdjById(23).getValue().equals("0")&&
	 * ddjservice.GetDdjById(22).getValue().equals("0")&&
	 * ddjservice.GetDdjById(7).getValue().equals("False"))){
	 * ActionContext.getContext().getSession().put("wait", "堆垛机占用");
	 * TimeUnit.SECONDS.sleep(1);
	 * testddj=ddjservice.GetDdjById(18);ddj.setValue(
	 * "3");ddjservice.UpdateDdj(ddj);
	 * testddj=ddjservice.GetDdjById(23);ddj.setValue
	 * ("0");ddjservice.UpdateDdj(ddj);
	 * testddj=ddjservice.GetDdjById(22);ddj.setValue
	 * ("0");ddjservice.UpdateDdj(ddj);
	 * testddj=ddjservice.GetDdjById(7);ddj.setValue
	 * ("False");ddjservice.UpdateDdj(ddj); } plcact.writeSsx("Start_Node",
	 * inline*2-1+""); plcact.writeSsx("End_Node", inline*2+"");
	 * plcact.writeDdj("RK_Hang", hang+""); plcact.writeDdj("RK_Line", line+"");
	 * plcact.writeDdj("RK_Ceng", ceng+""); plcact.writeDdj("GetStation",
	 * inline+""); testssxservice.GetSsxById(inline+8).setValue("1");
	 * TimeUnit.SECONDS.sleep(1); int time=0; String state="00000000";
	 * while(ssxservice.GetSsxById(inline+8).getValue().equals("1")){//输送线处于工作状态
	 * if(ssxservice.GetSsxById(8).getValue().equals("3")||
	 * ssxservice.GetSsxById(8).getValue().equals("4")||
	 * ssxservice.GetSsxById(8).getValue().equals("5")||
	 * ssxservice.GetSsxById(8).getValue().equals("6")||
	 * ssxservice.GetSsxById(8).getValue().equals("7")){
	 * plcact.writeSsx("Start_Node", inline*2+""); plcact.writeSsx("End_Node",
	 * inline*2-1+""); plcact.writeKg("A1,YLRK,01");
	 * taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "超限，任务已删除");放在上级调用方法
	 * return "error1"; } if(time>300){
	 * ActionContext.getContext().getSession().put("wait", "输送线工作超时"); return
	 * "wait1"; }
	 * if(!ssxservice.GetSsxById(inline).getValue().equals("00000000")){
	 * state=ssxservice.GetSsxById(inline).getValue(); } Thread.sleep(1000);
	 * time++; } //输送线到载货台空闲 //读RFID条件 String leftR = null,rightR=null;
	 * 
	 * if(inline==1&&state.equals("00000111")){//入库线入库，读RFID boolean
	 * flag1=false,flag2=false;
	 * if(ddjservice.GetDdjById(7).getValue().equals("true"
	 * )&&ddjservice.GetDdjById(22).getValue().equals("0")){ time=0;
	 * while(ddjservice.GetDdjById(8).getValue().equals("true")){
	 * leftR=ddjservice.GetDdjById(24).getValue(); ddj=ddjservice.GetDdjById(8);
	 * ddj.setValue("false");
	 * ddjservice.UpdateDdj(ddj);//GetDdjById(8).getValue() :false flag1=true; }
	 * while(ddjservice.GetDdjById(9).getValue().equals("true")){
	 * if(ddjservice.GetDdjById(25).getValue().equals("")){
	 * plcact.writeSsx("Start_Node", "2"); plcact.writeSsx("End_Node","1");
	 * plcact.writeKg("A1,YLRK,01"); taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "RFID标签无信息"); return
	 * "error3"; } rightR=ddjservice.GetDdjById(25).getValue();
	 * ddj=ddjservice.GetDdjById(9); ddj.setValue("false");
	 * ddjservice.UpdateDdj(ddj);//GetDdjById(9).getValue() :false flag2=true; }
	 * while(!(flag1||flag2)){ Thread.sleep(1000); time++; if(time>120){
	 * ActionContext.getContext().getSession().put("wait", "RFID读超时"); return
	 * "wait2"; } } if(leftR.equals("")&&rightR.equals("")){
	 * plcact.writeSsx("Start_Node", inline*2+""); plcact.writeSsx("End_Node",
	 * inline*2-1+""); ActionContext.getContext().getSession().put("error",
	 * "RFID标签无信息"); return "error2"; } } if(flag1&&flag2){
	 * 
	 * TimeUnit.SECONDS.sleep(1);
	 * while(ddjservice.GetDdjById(23).getValue().equals("1")){//等待堆垛机完成
	 * TimeUnit.SECONDS.sleep(1); time++; } Material mater;
	 * if(leftR.equals("")){ mater=materact.RFID2Material(rightR); }else{
	 * mater=materact.RFID2Material(leftR); }
	 * materservice.AddMaterial(mater);//材料新增
	 * wp=wpservice.GetWoodPalletByHouseId(task.getInPosition());
	 * wp.setMaterNum(mater.getMaterNum()); wp.setState("1");
	 * wpservice.UpdateWoodPallet(wp);//木托盘更新 task.setState("完成");
	 * taskservice.UpdateTask(task);//任务更新 wh.setState(2);
	 * whservice.UpdateWarehouse(wh);//库位更新
	 * record=recordservice.GetRecordByTaskId(task.getId()); Date date=new
	 * Date(); DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * String nowtime=format.format(date); record.setExeDate(nowtime);
	 * record.setInMaterNum(mater.getMaterNum());
	 * recordservice.UpdateRecord(record);//记录更新
	 * ActionContext.getContext().getSession().put("ok", "入库任务完成"); return "ok";
	 * }
	 * 
	 * } else{//空木托盘入库；成品入库或返库；余料返库；写rfid //空铁托盘入库 int flag=0;
	 * if(ddjservice.GetDdjById
	 * (7).getValue().equals("true")&&ddjservice.GetDdjById
	 * (22).getValue().equals("0")){ //原料 String rfid="";
	 * if(Integer.parseInt(task.getMaterAmount())!=0){ //余料返库
	 * if(!state.equals("00000111")){
	 * ActionContext.getContext().getSession().put("error", "托盘物料与任务不符"); return
	 * "error3"; } rfid=task.getMaterStandard();
	 * mater=materact.RFID2Material(rfid); flag=1; }else
	 * if(Integer.parseInt(task.getProductAmount())!=0){ //成品入库
	 * if(!(state.equals
	 * ("00011111")||state.equals("00010111")||state.equals("00001111"))){
	 * ActionContext.getContext().getSession().put("error", "托盘物料与任务不符"); return
	 * "error3"; } rfid=task.getProductStandard();
	 * mater=materact.RFID2Material(rfid); flag=1; }else{//空木托盘返库
	 * if(!((inline==1
	 * ||inline==2||inline==4)&&state.equals("00000011")||(inline==
	 * 3||inline==5||inline==6)&&state.equals("00000111"))){
	 * ActionContext.getContext().getSession().put("error", "托盘物料与任务不符"); return
	 * "error3"; } rfid=""; flag=0; } time=0; plcact.writeDdj("GVL_COM.RF_BW_L",
	 * "true"); plcact.writeDdj("GVL_COM.RF_BW_R", "true");
	 * plcact.writeDdj("GVL_COM.L_RF_W", rfid);
	 * plcact.writeDdj("GVL_COM.R_RF_W", rfid);
	 * while(ddjservice.GetDdjById(8).getValue
	 * ().equals("true")||ddjservice.GetDdjById(9).getValue().equals("true")){
	 * Thread.sleep(1000); time++; if(time>120){
	 * ActionContext.getContext().getSession().put("wait", "RFID读超时"); return
	 * "wait2"; } } } TimeUnit.SECONDS.sleep(1);
	 * while(ddjservice.GetDdjById(23).getValue().equals("1")){//等待堆垛机完成
	 * TimeUnit.SECONDS.sleep(1); time++; } if(flag==1){
	 * materservice.AddMaterial(mater);//材料新增
	 * wp=wpservice.GetWoodPalletByHouseId(task.getInPosition());
	 * wp.setMaterNum(mater.getMaterNum()); wp.setState("1");
	 * wpservice.UpdateWoodPallet(wp);//木托盘更新 task.setState("完成");
	 * taskservice.UpdateTask(task);//任务更新
	 * wh=whservice.GetWarehouseByhouseId(inwh); wh.setState(2);
	 * whservice.UpdateWarehouse(wh);//库位更新
	 * record=recordservice.GetRecordByTaskId(task.getId()); Date date=new
	 * Date(); DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * String nowtime=format.format(date); record.setExeDate(nowtime);
	 * record.setInMaterNum(mater.getMaterNum());
	 * recordservice.UpdateRecord(record);//记录更新 }else{
	 * wp=wpservice.GetWoodPalletByHouseId(task.getInPosition());
	 * wp.setMaterNum(""); wp.setState("0");
	 * wpservice.UpdateWoodPallet(wp);//木托盘更新 task.setState("完成");
	 * taskservice.UpdateTask(task);//任务更新
	 * wh=whservice.GetWarehouseByhouseId(inwh); wh.setState(1);
	 * whservice.UpdateWarehouse(wh);//库位更新
	 * record=recordservice.GetRecordByTaskId(task.getId()); Date date=new
	 * Date(); DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * String nowtime=format.format(date); record.setExeDate(nowtime);
	 * record.setInMaterNum(""); recordservice.UpdateRecord(record);//记录更新 }
	 * ActionContext.getContext().getSession().put("ok", "入库任务完成"); return "ok";
	 * } return null; }
	 * 
	 * 
	 * //出库任务 private String CKTask(Task task) throws InterruptedException{ int
	 * outline=Integer.parseInt(task.getOutLine()); int
	 * outwh=Integer.parseInt(task.getOutPosition()); int
	 * hang=whservice.GetWarehouseByhouseId(outwh).getRow(); int
	 * line=whservice.GetWarehouseByhouseId(outwh).getLine(); int
	 * ceng=whservice.GetWarehouseByhouseId(outwh).getFloor();
	 * wh=whservice.GetWarehouseByhouseId(outwh); int time=0;
	 * while(ssxservice.GetSsxById(outline+8).getValue().equals("1")){
	 * ActionContext.getContext().getSession().put("wait", "出库线占用");
	 * TimeUnit.SECONDS.sleep(1); }
	 * while(!(ddjservice.GetDdjById(18).getValue().equals("3")&
	 * ssxservice.GetSsxById(23).getValue().equals("0")&
	 * ssxservice.GetSsxById(22).getValue().equals("0")&
	 * ssxservice.GetSsxById(7).getValue().equals("False"))){
	 * ActionContext.getContext().getSession().put("wait", "堆垛机占用");
	 * TimeUnit.SECONDS.sleep(1); }
	 * 
	 * plcact.writeDdj("CK_Hang", hang+""); plcact.writeDdj("CK_Line", line+"");
	 * plcact.writeDdj("CK_Ceng", ceng+""); plcact.writeDdj("PutStation",
	 * outline+""); plcact.writeSsx("Start_Node", 2*outline-1+"");
	 * plcact.writeSsx("End_Node", 2*outline+""); TimeUnit.SECONDS.sleep(1);
	 * while(!ddjservice.GetDdjById(23).getValue().equals("0")){//堆垛机执行
	 * TimeUnit.SECONDS.sleep(1); }
	 * while(!ssxservice.GetSsxById(14).getValue().equals("0")){//输送线处于工作状态
	 * TimeUnit.SECONDS.sleep(1); } Thread.sleep(1000); //输送线到载货台，空闲 //读RFID条件
	 * boolean flag1=false,flag2=false;
	 * if(outline==1||outline==3||outline==5){//135出库空木
	 * if(ddjservice.GetDdjById(
	 * 7).getValue().equals("true")&&ddjservice.GetDdjById
	 * (22).getValue().equals("0")){
	 * while(ddjservice.GetDdjById(8).getValue().equals("true")){
	 * ddj=ddjservice.GetDdjById(8); ddj.setValue("false");
	 * ddjservice.UpdateDdj(ddj);//GetDdjById(8).getValue() :false flag1=true; }
	 * while(ddjservice.GetDdjById(9).getValue().equals("true")){
	 * ddj=ddjservice.GetDdjById(9); ddj.setValue("false");
	 * ddjservice.UpdateDdj(ddj);//GetDdjById(9).getValue() :false flag2=true; }
	 * while(!(flag1&&flag2)){ Thread.sleep(1000); time++; if(time>120){
	 * ActionContext.getContext().getSession().put("wait", "RFID读超时"); return
	 * "wait2"; } } }
	 * 
	 * if(flag1&&flag2){ plcact.writeSsx("Start_Node", 2*outline+"");
	 * plcact.writeSsx("End_Node", 2*outline-1+""); Thread.sleep(1000); time=0;
	 * while
	 * (ssxservice.GetSsxById(outline+8).getValue().equals("1")){//输送线处于工作状态
	 * Thread.sleep(1000); time++; if(time>600){
	 * ActionContext.getContext().getSession().put("wait", "出库线线工作超时"); } }
	 * //输送线执行完毕 //更新数据库
	 * 
	 * wp=wpservice.GetWoodPalletByHouseId(task.getInPosition());
	 * wp.setState("-1"); wpservice.UpdateWoodPallet(wp);//木托盘更新
	 * task.setState("完成"); taskservice.UpdateTask(task);//任务更新 wh.setState(0);
	 * whservice.UpdateWarehouse(wh);//库位更新
	 * record=recordservice.GetRecordByTaskId(task.getId()); Date date=new
	 * Date(); DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * String nowtime=format.format(date); record.setExeDate(nowtime);
	 * recordservice.UpdateRecord(record);//记录更新
	 * ActionContext.getContext().getSession().put("ok", "出库任务完成"); return "ok";
	 * } }else{ boolean read=false;
	 * if(ddjservice.GetDdjById(7).getValue().equals
	 * ("true")&&ddjservice.GetDdjById(22).getValue().equals("0")){
	 * while(ddjservice.GetDdjById(8).getValue().equals("true")){
	 * if(!ddjservice.
	 * GetDdjById(24).getValue().equals(materact.Material2RFID(mater
	 * ))){//与库位材料不相符 read=false; }else{ read=true; }
	 * ddj=ddjservice.GetDdjById(8); ddj.setValue("false");
	 * ddjservice.UpdateDdj(ddj);//GetDdjById(8).getValue() :false flag1=true; }
	 * while(ddjservice.GetDdjById(9).getValue().equals("true")){
	 * if(!ddjservice.
	 * GetDdjById(25).getValue().equals(materact.Material2RFID(mater))){
	 * read=false; }else{ read=true; } ddj=ddjservice.GetDdjById(9);
	 * ddj.setValue("false");
	 * ddjservice.UpdateDdj(ddj);//GetDdjById(9).getValue() :false flag2=true; }
	 * while(!(flag1&&flag2)){ Thread.sleep(1000); time++; if(time>120){
	 * ActionContext.getContext().getSession().put("wait", "RFID读超时"); return
	 * "wait2"; } } if(!read){
	 * 
	 * taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "RFID标签不符"); return
	 * "error"; } }
	 * 
	 * if(flag1&&flag2){ plcact.writeSsx("Start_Node", 2*outline+"");
	 * plcact.writeSsx("End_Node", 2*outline-1+""); Thread.sleep(1000); time=0;
	 * while
	 * (ssxservice.GetSsxById(outline+8).getValue().equals("1")){//输送线处于工作状态
	 * Thread.sleep(1000); time++; if(time>600){
	 * ActionContext.getContext().getSession().put("wait", "出库线线工作超时"); } }
	 * //输送线执行完毕 //更新数据库
	 * mater=materservice.GetMaterialByMaterialNum(wpservice.GetWoodPalletByHouseId
	 * (task.getOutPosition()).getMaterNum()); mater.setAmount(0);
	 * materservice.UpdateMaterial(mater);//材料更新
	 * wp=wpservice.GetWoodPalletByHouseId(task.getInPosition());
	 * wp.setMaterNum(""); wp.setState("-1");
	 * wpservice.UpdateWoodPallet(wp);//木托盘更新 task.setState("完成");
	 * taskservice.UpdateTask(task);//任务更新 wh.setState(0);
	 * whservice.UpdateWarehouse(wh);//库位更新
	 * record=recordservice.GetRecordByTaskId(task.getId()); Date date=new
	 * Date(); DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * String nowtime=format.format(date); record.setExeDate(nowtime);
	 * record.setOutMaterNum(mater.getMaterNum());
	 * recordservice.UpdateRecord(record);//记录更新
	 * ActionContext.getContext().getSession().put("ok", "出库任务完成"); return "ok";
	 * } } return null; }
	 */

	// 切割任务
	/*
	 * private String QGTask(Task task) throws InterruptedException{ Task task1
	 * = new Task(); task1.setInLine(inLine); task1.setInPosition(inPosition);
	 * task1.setMaterAmount(materAmount); task1.setMaterStandard(materStandard);
	 * task1.setOutLine(outLine); task1.setOutPosition(outPosition);
	 * task1.setPri(pri); task1.setProductStandard(productStandard);
	 * task1.setRecTime(recTime); task1.setState(state); task1.setType(type);
	 * 
	 * Task task2 = new Task(); task2.setInLine(inLine);
	 * task2.setInPosition(inPosition); task2.setMaterAmount(materAmount);
	 * task2.setMaterStandard(materStandard); task2.setOutLine(outLine);
	 * task2.setOutPosition(outPosition); task2.setPri(pri);
	 * task2.setProductStandard(productStandard); task2.setRecTime(recTime);
	 * task2.setState(state); task2.setType(type);
	 * 
	 * Task task3 = new Task(); task3.setInLine(inLine);
	 * task3.setInPosition(inPosition); task3.setMaterAmount(materAmount);
	 * task3.setMaterStandard(materStandard); task3.setOutLine(outLine);
	 * task3.setOutPosition(outPosition); task3.setPri(pri);
	 * task3.setProductStandard(productStandard); task3.setRecTime(recTime);
	 * task3.setState(state); task3.setType(type);
	 * 
	 * Task task4 = new Task(); task4.setInLine(inLine);
	 * task4.setInPosition(inPosition); task4.setMaterAmount(materAmount);
	 * task4.setMaterStandard(materStandard); task4.setOutLine(outLine);
	 * task4.setOutPosition(outPosition); task4.setPri(pri);
	 * task4.setProductStandard(productStandard); task4.setRecTime(recTime);
	 * task4.setState(state); task4.setType(type);
	 * 
	 * int time=0; CKTask(task1); Thread.sleep(1000); time++;
	 * while(!CKTask(task1).equals("ok")){ if(CKTask(task1).equals("error1")){
	 * taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "RFID标签信息与库位材料不相符");
	 * return "error"; } Thread.sleep(1000); time++;
	 * ActionContext.getContext().getSession().put("wait",
	 * "正在运输空木托盘到成品线"+time+"秒"); } CKTask(task2);
	 * while(!CKTask(task2).equals("ok")){ if(CKTask(task2).equals("error1")){
	 * taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "RFID标签信息与库位材料不相符");
	 * return "error"; } Thread.sleep(1000); time++;
	 * ActionContext.getContext().getSession().put("wait",
	 * "正在运输原料到原料线"+time+"秒"); } RKTask(task3);
	 * while(!RKTask(task3).equals("ok")){ if(RKTask(task3).equals("error1")){
	 * taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "超限，任务已删除"); return
	 * "error"; } Thread.sleep(1000); time++;
	 * ActionContext.getContext().getSession().put("wait", "成品正在入库"+time+"秒"); }
	 * RKTask(task4); while(!RKTask(task4).equals("ok")){
	 * if(RKTask(task4).equals("error")){ plcact.writeKg("A1,YLRK,01");
	 * taskservice.DeleteTask(task);
	 * ActionContext.getContext().getSession().put("error", "超限，任务已删除"); return
	 * "error"; } Thread.sleep(1000); time++;
	 * ActionContext.getContext().getSession().put("wait", "余料正在返库"+time+"秒"); }
	 * return "ok"; }
	 */

	// 出库任务

	/*
	 * //2#切割机任务 private String QG2Task() throws InterruptedException{ int
	 * time=0; CKTask(3); Thread.sleep(1000); time++;
	 * while(!CKTask(3).equals("ok")){ if(CKTask(3).equals("error")){ return
	 * "error"; } Thread.sleep(1000); time++;
	 * ActionContext.getContext().getSession().put("wait",
	 * "正在运输空木托盘到成品线"+time+"秒"); } CKTask(2); while(!CKTask(2).equals("ok")){
	 * if(CKTask(2).equals("error")){ return "error"; } Thread.sleep(1000);
	 * time++; ActionContext.getContext().getSession().put("wait",
	 * "正在运输原料到原料线"+time+"秒"); } RKTask(3); while(!RKTask(3).equals("ok")){
	 * if(RKTask(3).equals("error")){ return "error"; } Thread.sleep(1000);
	 * time++; ActionContext.getContext().getSession().put("wait",
	 * "成品正在入库"+time+"秒"); } RKTask(2); while(!RKTask(2).equals("ok")){
	 * if(RKTask(2).equals("error")){ return "error"; } Thread.sleep(1000);
	 * time++; ActionContext.getContext().getSession().put("wait",
	 * "余料正在返库"+time+"秒"); } return "ok"; }
	 */
	// 盘库
	public String PKTask(Task task) {
		return "ok";
	}

	public char[] addTask(String cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ssx(int id, String value) {
		ssx = ssxservice.GetSsxById(id);
		ssx.setValue(value);
		ssxservice.UpdateSsx(ssx);
	}

	public void ddj(int id, String value) {
		ddj = ddjservice.GetDdjById(id);
		ddj.setValue(value);
		ddjservice.UpdateDdj(ddj);
	}

}

// 入库任务
class RKTask implements Runnable {
	Task task;

	public RKTask(Task task) {
		this.task = task;
	}

	private IWarehouseService whservice;
	private ISsxService ssxservice;
	private Ssx ssx;
	private IDdjService ddjservice;
	private Ddj ddj;
	private PlcadsAction plcact;
	private TaskAction ta;
	private ITaskService taskservice;
	private MaterialAction materact;
	private IMaterialService materservice;
	private IWoodPalletService wpservice;
	private WoodPallet wp;
	private Warehouse wh;
	private IRecordService recordservice;
	private Record record;
	private Material mater;

	public void run() {
		int inline = Integer.parseInt(task.getInLine());
		int inwh = Integer.parseInt(task.getInPosition());

		int hang = whservice.GetWarehouseByhouseId(inwh).getRow();
		int line = whservice.GetWarehouseByhouseId(inwh).getLine();
		int ceng = whservice.GetWarehouseByhouseId(inwh).getFloor();
		try {
			while (ssxservice.GetSsxById(inline + 8).getValue().equals("1")) {
				ActionContext.getContext().getSession().put("wait", "输送线占用");

				TimeUnit.SECONDS.sleep(2);
				ta.ssx(inline + 8, "0");// test
			}
			while (!(ddjservice.GetDdjById(18).getValue().equals("3")
					&& ddjservice.GetDdjById(23).getValue().equals("0")
					&& ddjservice.GetDdjById(22).getValue().equals("0") && ddjservice
					.GetDdjById(7).getValue().equals("False"))) {
				ActionContext.getContext().getSession().put("wait", "堆垛机占用");
				TimeUnit.SECONDS.sleep(2);
				/* test */ta.ddj(18, "3");
				/* test */ta.ddj(23, "0");
				/* test */ta.ddj(22, "0");
				/* test */ta.ddj(7, "false");
			}
			plcact.writeSsx("Start_Node", inline * 2 - 1 + "");
			plcact.writeSsx("End_Node", inline * 2 + "");

			plcact.writeDdj("RK_Hang", hang + "");
			plcact.writeDdj("RK_Line", line + "");
			plcact.writeDdj("RK_Ceng", ceng + "");
			plcact.writeDdj("GetStation", inline + "");
			/* test */ta.ssx(inline + 8, "1");
			TimeUnit.SECONDS.sleep(2);
			int time = 0;
			String state = "00000000";

			while (ssxservice.GetSsxById(inline + 8).getValue().equals("1")) {// 输送线处于工作状态
				/* test */ta.ssx(8, "0");
				if (ssxservice.GetSsxById(8).getValue().equals("3")
						|| ssxservice.GetSsxById(8).getValue().equals("4")
						|| ssxservice.GetSsxById(8).getValue().equals("5")
						|| ssxservice.GetSsxById(8).getValue().equals("6")
						|| ssxservice.GetSsxById(8).getValue().equals("7")) {
					plcact.writeSsx("Start_Node", inline * 2 + "");
					plcact.writeSsx("End_Node", inline * 2 - 1 + "");
					plcact.writeKg("A1,YLRK,01");
					taskservice.DeleteTask(task);
					ActionContext.getContext().getSession()
							.put("error", "超限，任务已删除");
					return;
					/* return "error1"; */
				}
				/* test */ta.ssx(inline, "00000111");
				if (time > 300) {
					ActionContext.getContext().getSession()
							.put("wait", "输送线工作超时");
					/* return "wait1"; */
				}
				if (!ssxservice.GetSsxById(inline).getValue()
						.equals("00000000")) {
					state = ssxservice.GetSsxById(inline).getValue();
				}
				/* test */ta.ssx(inline + 8, "0");
				Thread.sleep(2000);
				time++;

			}
			// 输送线到载货台空闲
			// 读RFID条件
			String leftR = null, rightR = null;
			/* test */ta.ddj(7, "true");
			/* test */ta.ddj(22, "0");
			/* test */ta.ddj(23, "1");
			if (inline == 1 && state.equals("00000111")) {// 入库线入库，读RFID
				boolean flag1 = false, flag2 = false;
				if (ddjservice.GetDdjById(7).getValue().equals("true")
						&& ddjservice.GetDdjById(22).getValue().equals("0")) {
					time = 0;
					/* test */ta.ddj(8, "true");
					/* test */ta.ddj(9, "true");
					Thread.sleep(2000);
					while (ddjservice.GetDdjById(8).getValue().equals("true")) {
						leftR = ddjservice.GetDdjById(24).getValue();
						ddj = ddjservice.GetDdjById(8);
						ddj.setValue("false");
						ddjservice.UpdateDdj(ddj);// GetDdjById(8).getValue()
													// :false
						flag1 = true;
					}
					while (ddjservice.GetDdjById(9).getValue().equals("true")) {
						/*
						 * if(ddjservice.GetDdjById(25).getValue().equals("")){
						 * plcact.writeSsx("Start_Node", "2");
						 * plcact.writeSsx("End_Node","1");
						 * plcact.writeKg("A1,YLRK,01");
						 * taskservice.DeleteTask(task);
						 * ActionContext.getContext().getSession().put("error",
						 * "RFID标签无信息"); return "error3"; }
						 */
						rightR = ddjservice.GetDdjById(25).getValue();
						ddj = ddjservice.GetDdjById(9);
						ddj.setValue("false");
						ddjservice.UpdateDdj(ddj);// GetDdjById(9).getValue()
													// :false
						flag2 = true;
					}
					while (!(flag1 || flag2)) {
						Thread.sleep(1000);
						time++;
						if (time > 120) {
							ActionContext.getContext().getSession()
									.put("wait", "RFID读超时");
							/* return "wait2"; */
						}
					}
					if (leftR.equals("") && rightR.equals("")) {
						plcact.writeSsx("Start_Node", inline * 2 + "");
						plcact.writeSsx("End_Node", inline * 2 - 1 + "");
						plcact.writeKg("A1,YLRK,01");
						taskservice.DeleteTask(task);
						ActionContext.getContext().getSession()
								.put("error", "RFID标签无信息");
						return;
					}
				}
				if (flag1 && flag2) {
					TimeUnit.SECONDS.sleep(1);
					while (ddjservice.GetDdjById(23).getValue().equals("1")) {// 等待堆垛机完成
						TimeUnit.SECONDS.sleep(1);
						time++;
						Thread.sleep(3000);
						/* test */ta.ddj(23, "0");
						/* test */ta.ddj(7, "false");
					}
					if (leftR.equals("")) {
						mater = materact.RFID2Material(rightR);
					} else {
						mater = materact.RFID2Material(leftR);
					}
					materservice.AddMaterial(mater);// 材料新增
					wp = wpservice.GetWoodPalletByHouseId(task.getInPosition());
					wp.setMaterNum(mater.getMaterNum());
					wp.setState("1");
					wpservice.UpdateWoodPallet(wp);// 木托盘更新
					task.setState("完成");
					taskservice.UpdateTask(task);// 任务更新
					wh.setState(2);
					whservice.UpdateWarehouse(wh);// 库位更新
					record = recordservice.GetRecordByTaskId(task.getId());
					Date date = new Date();
					DateFormat format = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					String nowtime = format.format(date);
					record.setExeDate(nowtime);
					record.setInMaterNum(mater.getMaterNum());
					recordservice.UpdateRecord(record);// 记录更新
					ActionContext.getContext().getSession().put("ok", "入库任务完成");
					return;
				}

			} else {// 空木托盘入库；成品入库或返库；余料返库；写rfid
					// 空铁托盘入库
				int flag = 0;
				if (ddjservice.GetDdjById(7).getValue().equals("true")
						&& ddjservice.GetDdjById(22).getValue().equals("0")) {
					// 原料
					/* test */ta.ddj(8, "true");
					/* test */ta.ddj(9, "true");
					String rfid = "";
					if (Integer.parseInt(task.getMaterAmount()) != 0) {
						// 余料返库
						if (!state.equals("00000111")) {
							ActionContext.getContext().getSession()
									.put("error", "托盘物料与任务不符");
							return;
						}
						rfid = task.getMaterStandard();
						mater = materact.RFID2Material(rfid);
						flag = 1;
					} else if (Integer.parseInt(task.getProductAmount()) != 0) {
						// 成品入库
						if (!(state.equals("00011111")
								|| state.equals("00010111") || state
									.equals("00001111"))) {
							ActionContext.getContext().getSession()
									.put("error", "托盘物料与任务不符");
							return;
						}
						rfid = task.getProductStandard();
						mater = materact.RFID2Material(rfid);
						flag = 1;
					} else {// 空木托盘返库
						if (!((inline == 1 || inline == 2 || inline == 4)
								&& state.equals("00000011") || (inline == 3
								|| inline == 5 || inline == 6)
								&& state.equals("00000111"))) {
							ActionContext.getContext().getSession()
									.put("error", "托盘物料与任务不符");
							return;
						}
						rfid = "";
						flag = 0;
					}
					time = 0;
					plcact.writeDdj("GVL_COM.RF_BW_L", "true");
					plcact.writeDdj("GVL_COM.RF_BW_R", "true");
					plcact.writeDdj("GVL_COM.L_RF_W", rfid);
					plcact.writeDdj("GVL_COM.R_RF_W", rfid);
					/* test */ta.ddj(8, "false");
					/* test */ta.ddj(9, "false");
					while (ddjservice.GetDdjById(8).getValue().equals("true")
							|| ddjservice.GetDdjById(9).getValue()
									.equals("true")) {
						Thread.sleep(1000);
						time++;
						if (time > 120) {
							ActionContext.getContext().getSession()
									.put("wait", "RFID读超时");
							/* return "wait2"; */
						}
					}
				}
				TimeUnit.SECONDS.sleep(1);
				while (ddjservice.GetDdjById(23).getValue().equals("1")) {// 等待堆垛机完成
					TimeUnit.SECONDS.sleep(3);
					time++;
					/* test */ta.ddj(23, "0");
					/* test */ta.ddj(7, "false");
				}
				if (flag == 1) {
					materservice.AddMaterial(mater);// 材料新增
					wp = wpservice.GetWoodPalletByHouseId(task.getInPosition());
					wp.setMaterNum(mater.getMaterNum());
					wp.setState("1");
					wpservice.UpdateWoodPallet(wp);// 木托盘更新
					task.setState("完成");
					taskservice.UpdateTask(task);// 任务更新
					wh = whservice.GetWarehouseByhouseId(inwh);
					wh.setState(2);
					whservice.UpdateWarehouse(wh);// 库位更新
					record = recordservice.GetRecordByTaskId(task.getId());
					Date date = new Date();
					DateFormat format = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					String nowtime = format.format(date);
					record.setExeDate(nowtime);
					record.setInMaterNum(mater.getMaterNum());
					recordservice.UpdateRecord(record);// 记录更新
				} else {
					wp = wpservice.GetWoodPalletByHouseId(task.getInPosition());
					wp.setMaterNum("");
					wp.setState("0");
					wpservice.UpdateWoodPallet(wp);// 木托盘更新
					task.setState("完成");
					taskservice.UpdateTask(task);// 任务更新
					wh = whservice.GetWarehouseByhouseId(inwh);
					wh.setState(1);
					whservice.UpdateWarehouse(wh);// 库位更新
					record = recordservice.GetRecordByTaskId(task.getId());
					Date date = new Date();
					DateFormat format = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					String nowtime = format.format(date);
					record.setExeDate(nowtime);
					record.setInMaterNum("");
					recordservice.UpdateRecord(record);// 记录更新
				}
				ActionContext.getContext().getSession().put("ok", "入库任务完成");
				return;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}

// 出库任务
class CKTask implements Runnable {
	private Task task;

	public CKTask(Task task) {
		this.task = task;
	}

	private IWarehouseService whservice;
	private Warehouse wh;
	private ISsxService ssxservice;
	private IDdjService ddjservice;
	private PlcadsAction plcact;
	private Ddj ddj;
	private IWoodPalletService wpservice;
	private WoodPallet wp;
	private ITaskService taskservice;
	private IRecordService recordservice;
	private Record record;
	private IMaterialService materservice;
	private Material mater;
	private MaterialAction materact;

	public void run() {
		try {
			int outline = Integer.parseInt(task.getOutLine());
			int outwh = Integer.parseInt(task.getOutPosition());
			int hang = whservice.GetWarehouseByhouseId(outwh).getRow();
			int line = whservice.GetWarehouseByhouseId(outwh).getLine();
			int ceng = whservice.GetWarehouseByhouseId(outwh).getFloor();
			wh = whservice.GetWarehouseByhouseId(outwh);
			int time = 0;
			while (ssxservice.GetSsxById(outline + 8).getValue().equals("1")) {
				ActionContext.getContext().getSession().put("wait", "出库线占用");

				TimeUnit.SECONDS.sleep(1);

			}
			while (!(ddjservice.GetDdjById(18).getValue().equals("3")
					& ssxservice.GetSsxById(23).getValue().equals("0")
					& ssxservice.GetSsxById(22).getValue().equals("0") & ssxservice
					.GetSsxById(7).getValue().equals("False"))) {
				ActionContext.getContext().getSession().put("wait", "堆垛机占用");
				TimeUnit.SECONDS.sleep(1);
			}

			plcact.writeDdj("CK_Hang", hang + "");
			plcact.writeDdj("CK_Line", line + "");
			plcact.writeDdj("CK_Ceng", ceng + "");
			plcact.writeDdj("PutStation", outline + "");
			plcact.writeSsx("Start_Node", 2 * outline - 1 + "");
			plcact.writeSsx("End_Node", 2 * outline + "");
			TimeUnit.SECONDS.sleep(1);
			while (!ddjservice.GetDdjById(23).getValue().equals("0")) {// 堆垛机执行
				TimeUnit.SECONDS.sleep(1);
			}
			while (!ssxservice.GetSsxById(14).getValue().equals("0")) {// 输送线处于工作状态
				TimeUnit.SECONDS.sleep(1);
			}
			Thread.sleep(1000);
			// 输送线到载货台，空闲
			// 读RFID条件
			boolean flag1 = false, flag2 = false;
			if (outline == 1 || outline == 3 || outline == 5) {// 135出库空木
				if (ddjservice.GetDdjById(7).getValue().equals("true")
						&& ddjservice.GetDdjById(22).getValue().equals("0")) {
					while (ddjservice.GetDdjById(8).getValue().equals("true")) {
						ddj = ddjservice.GetDdjById(8);
						ddj.setValue("false");
						ddjservice.UpdateDdj(ddj);// GetDdjById(8).getValue()
													// :false
						flag1 = true;
					}
					while (ddjservice.GetDdjById(9).getValue().equals("true")) {
						ddj = ddjservice.GetDdjById(9);
						ddj.setValue("false");
						ddjservice.UpdateDdj(ddj);// GetDdjById(9).getValue()
													// :false
						flag2 = true;
					}
					while (!(flag1 && flag2)) {
						Thread.sleep(1000);
						time++;
						if (time > 120) {
							ActionContext.getContext().getSession()
									.put("wait", "RFID读超时");
							/* return "wait2"; */
						}
					}
				}

				if (flag1 && flag2) {
					plcact.writeSsx("Start_Node", 2 * outline + "");
					plcact.writeSsx("End_Node", 2 * outline - 1 + "");
					Thread.sleep(1000);
					time = 0;
					while (ssxservice.GetSsxById(outline + 8).getValue()
							.equals("1")) {// 输送线处于工作状态
						Thread.sleep(1000);
						time++;
						if (time > 600) {
							ActionContext.getContext().getSession()
									.put("wait", "出库线线工作超时");
						}
					}
					// 输送线执行完毕
					// 更新数据库

					wp = wpservice.GetWoodPalletByHouseId(task.getInPosition());
					wp.setState("-1");
					wpservice.UpdateWoodPallet(wp);// 木托盘更新
					task.setState("完成");
					taskservice.UpdateTask(task);// 任务更新
					wh.setState(0);
					whservice.UpdateWarehouse(wh);// 库位更新
					record = recordservice.GetRecordByTaskId(task.getId());
					Date date = new Date();
					DateFormat format = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					String nowtime = format.format(date);
					record.setExeDate(nowtime);
					recordservice.UpdateRecord(record);// 记录更新
					ActionContext.getContext().getSession().put("ok", "出库任务完成");
					return;
				}
			} else {
				boolean read = false;
				if (ddjservice.GetDdjById(7).getValue().equals("true")
						&& ddjservice.GetDdjById(22).getValue().equals("0")) {
					while (ddjservice.GetDdjById(8).getValue().equals("true")) {
						if (!ddjservice.GetDdjById(24).getValue()
								.equals(materact.Material2RFID(mater))) {// 与库位材料不相符
							read = false;
						} else {
							read = true;
						}
						ddj = ddjservice.GetDdjById(8);
						ddj.setValue("false");
						ddjservice.UpdateDdj(ddj);// GetDdjById(8).getValue()
													// :false
						flag1 = true;
					}
					while (ddjservice.GetDdjById(9).getValue().equals("true")) {
						if (!ddjservice.GetDdjById(25).getValue()
								.equals(materact.Material2RFID(mater))) {
							read = false;
						} else {
							read = true;
						}
						ddj = ddjservice.GetDdjById(9);
						ddj.setValue("false");
						ddjservice.UpdateDdj(ddj);// GetDdjById(9).getValue()
													// :false
						flag2 = true;
					}
					while (!(flag1 && flag2)) {
						Thread.sleep(1000);
						time++;
						if (time > 120) {
							ActionContext.getContext().getSession()
									.put("wait", "RFID读超时");
							/* return "wait2"; */
						}
					}
					if (!read) {
						taskservice.DeleteTask(task);
						ActionContext.getContext().getSession()
								.put("error", "RFID标签不符");
						return;
					}
				}

				if (flag1 && flag2) {
					plcact.writeSsx("Start_Node", 2 * outline + "");
					plcact.writeSsx("End_Node", 2 * outline - 1 + "");
					Thread.sleep(1000);
					time = 0;
					while (ssxservice.GetSsxById(outline + 8).getValue()
							.equals("1")) {// 输送线处于工作状态
						Thread.sleep(1000);
						time++;
						if (time > 600) {
							ActionContext.getContext().getSession()
									.put("wait", "出库线线工作超时");
						}
					}
					// 输送线执行完毕
					// 更新数据库
					mater = materservice.GetMaterialByMaterialNum(wpservice
							.GetWoodPalletByHouseId(task.getOutPosition())
							.getMaterNum());
					mater.setAmount(0);
					materservice.UpdateMaterial(mater);// 材料更新
					wp = wpservice.GetWoodPalletByHouseId(task.getInPosition());
					wp.setMaterNum("");
					wp.setState("-1");
					wpservice.UpdateWoodPallet(wp);// 木托盘更新
					task.setState("完成");
					taskservice.UpdateTask(task);// 任务更新
					wh.setState(0);
					whservice.UpdateWarehouse(wh);// 库位更新
					record = recordservice.GetRecordByTaskId(task.getId());
					Date date = new Date();
					DateFormat format = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					String nowtime = format.format(date);
					record.setExeDate(nowtime);
					record.setOutMaterNum(mater.getMaterNum());
					recordservice.UpdateRecord(record);// 记录更新
					ActionContext.getContext().getSession().put("ok", "出库任务完成");
					return;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
