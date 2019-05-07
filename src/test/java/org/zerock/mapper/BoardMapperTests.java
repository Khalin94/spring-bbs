package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	/*
	 * @Test public void testGetList() { mapper.getList().forEach(board ->
	 * log.info(board)); }
	 * 
	 * @Test public void testInsert() { BoardVO board = new BoardVO();
	 * board.setTitle("새로 작성하는 글"); board.setContent("새로운 내용");
	 * board.setWriter("newbie");
	 * 
	 * mapper.insert(board);
	 * 
	 * log.info(board);
	 * 
	 * }
	 * 
	 * @Test public void InsertSelectKey() {
	 * 
	 * BoardVO board= new BoardVO();
	 * 
	 * board.setTitle("새로 작성하는 글 selectKey");
	 * board.setContent("새로 작성하는 내용 selectKey"); board.setWriter("NewBie");
	 * 
	 * mapper.insertSelectKey(board);
	 * 
	 * log.info(board); }
	 * 
	 * @Test public void testRead() { BoardVO board = mapper.read(5L);
	 * 
	 * log.info(board);
	 * 
	 * 
	 * }
	 * 
	 * @Test public void testDelete() {
	 * 
	 * log.info("Delete count : " + mapper.delete(3L)); }
	 * 
	 * @Test public void testUpdate() { BoardVO board = new BoardVO();
	 * 
	 * board.setBno(4L); board.setTitle("수정된 제목"); board.setContent("수정된 내용");
	 * board.setWriter("수정된 user");
	 * 
	 * 
	 * int count = mapper.update(board);
	 * 
	 * log.info("UPdate Count : " + count); }
	 */
	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		
		cri.setPageNum(3);
		cri.setAmount(10);
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board.getBno()));
	}
}
