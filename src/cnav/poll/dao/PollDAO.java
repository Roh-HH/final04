package cnav.poll.dao;

import java.sql.SQLException;
import java.util.List;

import cnav.main.dto.CategoryDTO;
import cnav.poll.dto.PollDTO;

public interface PollDAO {

	//투표저장
	public void insertArticle(PollDTO dto) throws SQLException;
	//모든 투표글 개수
	public int getArticleCount(String code) throws SQLException;
	//모든 투표글 불러오기
	public List<PollDTO> getArticles(int startRow, int endRow,String code) throws SQLException;
	//내용 검색 투표글 개수
	public int getArticleCount2(String sel, String search, String code) throws SQLException;
	//내용 검색 투표글 불러오기
	public List<PollDTO> getArticles2(int startRow, int endRow, String sel, String search, String code) throws SQLException; 
	//진행중 완료 투표글
	public int getArticleCount3(String sort,String code) throws SQLException;
	//진행중 완료 투표글
	public List<PollDTO> getArticles3(int startRow, int endRow, String sort, String code) throws SQLException; 
	
	//투표글 하나 불러오기
	public PollDTO getPollArticle(int pollNum) throws SQLException;
	//해당 id의 부서정보
	public String getUserDept(String userId) throws SQLException;
	//투표 기록 유무
	public int recordPoll(int pollNum,String userId) throws SQLException;
	//투표시
	public void plusPoll(String pollNum,String obj_value) throws SQLException;
	//투표시 기록남기기
	public void plusPollUser(String pollNum,String userId)throws SQLException;
	//투표후에 결과 컬럼
	public PollDTO getPollArticleRes(String pollNum) throws SQLException;
	
	//투표글 삭제
	public void pollDelete(String pollNum) throws SQLException;
	
	//**카테고리 가져오기
	public CategoryDTO takeCategory(String code) throws SQLException;
}
