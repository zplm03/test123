package kr.or.nextit;

import java.sql.DriverManager;
import java.util.List;

public class MemberService {
	
	private MemberDAO dao = new MemberDAO();
	
	public List<MemberVO> selectMemberList() throws Exception{
		return null;
	}
	
	public MemberVO selectMember(String id) throws Exception{
		return null;
	}
	public void insertMember(MemberVO vo) throws Exception {
		dao.insertMember(vo);
	}
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}
	public void deleteMember(String id) {
		dao.deleteMember(id);
	}
}
