package kr.or.nextit.memo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.or.nextit.MemberVO;

public class MemoDAO {
	public List<MemoVO> selectMemoList() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","oracle");
		PreparedStatement statment = connection.prepareStatement("SELECT * FROM MEMO");
		
		ResultSet resultSet = statment.executeQuery();
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		while(resultSet.next()) {
			long memoId = resultSet.getLong("memo_id");
			String memoContents = resultSet.getString("memo_contents");
			Date memoCreateDate = resultSet.getDate("memo_create_date");
			Date memoModifyDate = resultSet.getDate("memo_modify_date");
			list.add(new MemoVO(memoId,memoContents,memoCreateDate,memoModifyDate));
		}
		resultSet.close();
		statment.close();
		connection.close();
		return list;
	}
	
	public MemoVO selectMemoList(int id) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","oracle");
		PreparedStatement statment = connection.prepareStatement("SELECT * FROM MEMO WHERE MEMO_ID = ?");
		statment.setInt(1, id);
		ResultSet resultSet = statment.executeQuery();
		MemoVO vo =null;
		while(resultSet.next()) {
			long memoId = resultSet.getLong("memo_id");
			String memoContents = resultSet.getString("memo_contents");
			Date memoCreateDate = resultSet.getDate("memo_create_date");
			Date memoModifyDate = resultSet.getDate("memo_modify_date");
			vo = new MemoVO(memoId,memoContents,memoCreateDate,memoModifyDate);
		}
		resultSet.close();
		statment.close();
		connection.close();
		return vo;
	}
	public int insertMemoList(MemoVO vo) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","oracle");
		PreparedStatement statment = connection.prepareStatement("INSERT INTO MEMO(MEMO_ID,MOMO_CONTENTS) VALUES (SEQ_MEMO.NEXTVAL,?)");
		statment.setString(1, vo.getMemoContents());
		int insert = statment.executeUpdate();
		
		statment.close();
		connection.close();		
		return insert;
	}
	public int updateMemoList(MemoVO vo) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","oracle");
		PreparedStatement statment = connection.prepareStatement("UPDATE MEMO SET MEMO_CONTENTS = ?,MEMO_MODIFY_DATE = SYSDATE WHERE MEMO_ID=?");
		statment.setString(1, vo.getMemoContents());
		statment.setLong(2, vo.getMemoId());
		int update = statment.executeUpdate();
		
		statment.close();
		connection.close();		
		return update;
	}
	public int deleteMemoList(int id) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","oracle");
		PreparedStatement statment = connection.prepareStatement("DELTE FROM MEMO WHERE MEM_ID =?");
		statment.setLong(1, id);
		int delete = statment.executeUpdate();
		
		statment.close();
		connection.close();		
		return delete;
	}
}
