package kr.or.nextit.memo;

import java.sql.Date;

public class MemoVO {

	private long memoId;
	private String memoContents;
	private Date memoCreateDate;
	private Date memModifyDate;
	
	
	public MemoVO(long memId, String memoContents, Date memoCreateDate, Date memModifyDate) {
		super();
		this.memoId = memId;
		this.memoContents = memoContents;
		this.memoCreateDate = memoCreateDate;
		this.memModifyDate = memModifyDate;
	}
	public MemoVO() {

	}
	public long getMemoId() {
		return memoId;
	}
	public void setMemoId(long memId) {
		this.memoId = memId;
	}
	public String getMemoContents() {
		return memoContents;
	}
	public void setMemoContents(String memoContents) {
		this.memoContents = memoContents;
	}
	public Date getMemoCreateDate() {
		return memoCreateDate;
	}
	public void setMemoCreateDate(Date memoCreateDate) {
		this.memoCreateDate = memoCreateDate;
	}
	public Date getMemModifyDate() {
		return memModifyDate;
	}
	public void setMemModifyDate(Date memModifyDate) {
		this.memModifyDate = memModifyDate;
	}

	
}
