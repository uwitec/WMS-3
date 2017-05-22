package com.wms.action;

import java.util.List;

import com.wms.entity.Ddj;
import com.wms.entity.Ssx;
import com.wms.entity.Task;
import com.wms.service.IDdjService;
import com.wms.service.ISsxService;
import com.wms.service.ITaskService;

public class PlcadsAction {

	private Ddj ddj;
	private Ssx ssx;
	private IDdjService ddjservice;
	private ISsxService ssxservice;
	private ITaskService taskservice;
	private Integer id;
	private String plcname;
	private String value;
	private List<Ddj> ddjlist;
	private List<Ssx> ssxlist;
	private List<Task> tasklist;
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
	public ITaskService getTaskservice() {
		return taskservice;
	}
	public void setTaskservice(ITaskService taskservice) {
		this.taskservice = taskservice;
	}
	public List<Ddj> getDdjlist() {
		return ddjlist;
	}
	public void setDdjlist(List<Ddj> ddjlist) {
		this.ddjlist = ddjlist;
	}
	public List<Ssx> getSsxlist() {
		return ssxlist;
	}
	public void setSsxlist(List<Ssx> ssxlist) {
		this.ssxlist = ssxlist;
	}
	public List<Task> getTasklist() {
		return tasklist;
	}
	public void setTasklist(List<Task> tasklist) {
		this.tasklist = tasklist;
	}
	public Ddj getDdj() {
		return ddj;
	}
	public void setDdj(Ddj ddj) {
		this.ddj = ddj;
	}
	public Ssx getSsx() {
		return ssx;
	}
	public void setSsx(Ssx ssx) {
		this.ssx = ssx;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlcname() {
		return plcname;
	}
	public void setPlcname(String plcname) {
		this.plcname = plcname;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 1s更新状态
	 * 启动后后台自动启动线程
	 * @return
	 */
	public String workStatus() {
		tasklist=taskservice.GetAllTask();
        ddjlist=ddjservice.GetAllDdj();
        ssxlist=ssxservice.GetAllSsx();
        
		return "workstatus";
	}
    /*发送PLC-ddj指令*/
	public void writeDdj(String plcname,String value){
		
	}
	/*发送PLC-ssx指令*/
	public void writeSsx(String plcname,String value){
		
	}
	/*ADS发送库管系统指令*/
	public void writeKg(String code){
		
	}
	/*ADS收到库管系统指令*/
	public String getKg(String code){
		String task="";
		return task;
	}
	
}
