package kr.or.nextit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	public List<MemberVO> selectMemberList() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("oracle:thin:@localhost:1521:xe","oracle","java");
		PreparedStatement statment = connection.prepareStatement("SELECT * FROM MEMBER");
		
		ResultSet resultSet = statment.executeQuery();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		MemberVO vo = null;
		while(resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			list.add(new MemberVO(memId,memName,memHp,memMail));
		}
		resultSet.close();
		statment.close();
		connection.close();
		return list;
	}
	
	public MemberVO selectMember(String id) {
		return null;
	}
	public void insertMember(MemberVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("oracle:thin:@localhost:1521:xe","oracle","java");
		String sql = "insert into member (mem_id,mem_pass,mam_name,mem_regno1,mem_regno2,mem_bir,mem_zip,mem_add1,mem_add2, mem_hometel,mem_comtel,mem_hp,mem_mail) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statment = connection.prepareStatement(sql);
		statment.setString(1,vo.getMemId());
		statment.setString(2,vo.getMemPass());
		statment.setString(3,vo.getMemName());
		statment.setString(4,vo.getMemReg01());
		statment.setString(5,vo.getMemReg02());
		statment.setString(6,vo.getMemBir());
		statment.setString(7,vo.getMemZip());
		statment.setString(8,vo.getMemAdd1());
		statment.setString(9,vo.getMemAdd2());
		statment.setString(10,vo.getMemHometel());
		statment.setString(11,vo.getMemComtel());
		statment.setString(12,vo.getMemHp());
		statment.setString(13,vo.getMemMail());
		
		statment.close();
		connection.close();
	}
	public void updateMember(MemberVO vo) {
		
	}
	public void deleteMember(String id) {
		
	}
}
