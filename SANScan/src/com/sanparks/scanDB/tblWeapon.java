package com.sanparks.scanDB;

import com.memtrip.sqlking.base.*;
import com.memtrip.sqlking.schema.*;

public class tblWeapon extends ScanTableBase implements IModel{

	private DBForeignKey	visitor_fk;
	private E_WEAPON_TYPE	weapon_type;   
	private DBString		make;
	private	DBString		model;
	private DBString		caliber;
	private DBString		serial_number;
	private DBString		licence_number;
	private DBBoolean		b_licence_valid;
	private DBInteger		suspicion_count;
	
//	public void onCreate () {
//	sql = "create table firearm ("
//			+ "id 				integer primary key autoincrement,"
//			+ "visitor_id		integer not null,"	
//			+ "weapon_type		integer not null," E_WEAPON_TYPE
//			+ "make				text not null,"		
//			+ "model			text,"
//			+ "caliber			text,"
//			+ "serial_number	text,"
//			+ "licence_number	text,"
//			+ "b_licence_valid	boolean,"
//			+ "suspicion_count	integer";	
//	execSQL(sql);
//}
//
//@Override
//public int add() {
//	return 0;
//}
//@Override
//public int update() {
//	return 0;
//}
//@Override
//public int delete() {
//	return 0;
//}
	public DBKey getVisitor_fk() {
		return (DBKey) visitor_fk.get();
	}
	public void setVisitor_fk(DBKey visitor_fk) {
		this.visitor_fk.set(visitor_fk);
	}
	public E_WEAPON_TYPE getWeapon_type() {
		return weapon_type;
	}
	public void setWeapon_type(E_WEAPON_TYPE newVal) {
		this.weapon_type = newVal;
	}

	public String getMake() {
		return make.getVal();
	}
	public void setMake(String make) {
		this.make.setVal(make);
	}
	public String getModel() {
		return model.getVal();
	}
	public void setModel(String model) {
		this.model.setVal(model);
	}
	public String getCaliber() {
		return caliber.getVal();
	}
	public void setCaliber(String caliber) {
		this.caliber.setVal(caliber);
	}
	public String getSerial_number() {
		return serial_number.getVal();
	}
	public void setSerial_number(String serial_number) {
		this.serial_number.setVal(serial_number);
	}
	public String getLicence_number() {
		return licence_number.getVal();
	}
	public void setLicence_number(String licence_number) {
		this.licence_number.setVal(licence_number);
	}
	public boolean getB_licence_valid() {
		return b_licence_valid.isVal();
	}
	public void setB_licence_valid(boolean b_licence_valid) {
		this.b_licence_valid.setVal(b_licence_valid);
	}
	public int getSuspicion_count() {
		return suspicion_count.getVal();
	}
	public void setSuspicion_count(int suspicion_count) {
		this.suspicion_count.setVal(suspicion_count);
	}

}
