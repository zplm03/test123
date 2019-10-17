package kr.or.nextit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;

import org.junit.Test;

import kr.or.nextit.memo.MemoDAO;
import kr.or.nextit.memo.MemoVO;

public class MemoDAOTest {

	@Test
	public void test() throws Exception{
		MemoDAO dao = new MemoDAO();
		List<MemoVO> list = dao.selectMemoList();
		assertThat(list.size(), is(0));
		
		MemoVO vo = new MemoVO();
		vo.setMemoContents("두번째 메모");
		dao.insertMemoList(vo);
		assertThat(vo, is(not(dao.selectMemoList((int)vo.getMemoId()))));
		
		
	}
	@Test
	public void testUpdateMemo() throws Exception{
		MemoDAO dao = new MemoDAO();
		MemoVO vo = new MemoVO();
		vo.setMemoId(2);
		vo.setMemoContents("바뀐데이터");
		dao.updateMemoList(vo);
		
		MemoVO memo = dao.selectMemoList((int)vo.getMemoId());
		assertThat(memo.getMemoContents(), is("바뀐 데이터"));
	}
}







