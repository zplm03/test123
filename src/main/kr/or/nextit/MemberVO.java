package kr.or.nextit;

import java.util.List;

public class MemberVO {

	private String memId;
	private String memPass;
	private String memName;
	private String memReg01;
	private String memReg02;
	private String memBir;
	private String memZip;
	private String memAdd1;
	private String memAdd2;
	private String memHometel;
	private String memComtel;
	private String memHp;
	private String memMail;
	
	
	public MemberVO(String memId, String memName, String memHp, String memMail) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memHp = memHp;
		this.memMail = memMail;
	}
	public MemberVO(String memId, String memPass, String memName, String memReg01, String memReg02, String memBir,
			String memZip, String memAdd1, String memAdd2, String memHometel, String memComtel, String memHp,
			String memMail) {
		super();
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memReg01 = memReg01;
		this.memReg02 = memReg02;
		this.memBir = memBir;
		this.memZip = memZip;
		this.memAdd1 = memAdd1;
		this.memAdd2 = memAdd2;
		this.memHometel = memHometel;
		this.memComtel = memComtel;
		this.memHp = memHp;
		this.memMail = memMail;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemReg01() {
		return memReg01;
	}
	public void setMemReg01(String memReg01) {
		this.memReg01 = memReg01;
	}
	public String getMemReg02() {
		return memReg02;
	}
	public void setMemReg02(String memReg02) {
		this.memReg02 = memReg02;
	}
	public String getMemBir() {
		return memBir;
	}
	public void setMemBir(String memBir) {
		this.memBir = memBir;
	}
	public String getMemZip() {
		return memZip;
	}
	public void setMemZip(String memZip) {
		this.memZip = memZip;
	}
	public String getMemAdd1() {
		return memAdd1;
	}
	public void setMemAdd1(String memAdd1) {
		this.memAdd1 = memAdd1;
	}
	public String getMemAdd2() {
		return memAdd2;
	}
	public void setMemAdd2(String memAdd2) {
		this.memAdd2 = memAdd2;
	}
	public String getMemHometel() {
		return memHometel;
	}
	public void setMemHometel(String memHometel) {
		this.memHometel = memHometel;
	}
	public String getMemComtel() {
		return memComtel;
	}
	public void setMemComtel(String memComtel) {
		this.memComtel = memComtel;
	}
	public String getMemHp() {
		return memHp;
	}
	public void setMemHp(String memHp) {
		this.memHp = memHp;
	}
	public String getMemMail() {
		return memMail;
	}
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}


}
