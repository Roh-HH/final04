package cnav.mypage.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import cnav.main.dto.UserDTO;
import cnav.mypage.dao.MypageDAO;
import cnav.mypage.dto.TopicCommDTO;
import cnav.mypage.dto.UserInfoDTO;
import cnav.project.dto.ProjectDTO;
import cnav.reservation.dto.ReservationDTO;
import cnav.topic.dto.TopicDTO;

@Repository
public class MypageServiceImpl implements MypageService {

	@Autowired
	private MypageDAO myDAO = null;

	@Override
	public Map<String, Object> getMyPjList(String userId, String code, String pageNum) throws SQLException {
		// ** 게시글 페이지 관련 정보 세팅 ** 
		// 한페이지에 보여줄 게시글의 수 
		int pageSize = 5; 
		// 현재 페이지 번호  
		if(pageNum == null){ // list.do 라고만 요청했을때, 즉 pageNum 파라미터 안넘어왔을때.
			pageNum = "1";
		}
		// 현재 페이지에 보여줄 게시글 시작과 끝 등등 정보 세팅 
		int currentPage = Integer.parseInt(pageNum); // 계산을 위해 현재페이지 숫자로 변환하여 저장 
		int startRow = (currentPage - 1) * pageSize + 1; // 페이지 시작글 번호 
		int endRow = currentPage * pageSize; // 페이지 마지막 글번호
		
		// 프로젝트 게시판 글 가져오기 
		List<ProjectDTO> articleList = null;  	// 전체(검색된) 게시글들 담아줄 변수
		int count = 0; 							// 전체(검색된) 글의 개수 
		int number = 0; 						// 브라우저 화면에 뿌려줄 가상 글 번호  
		
		// 전체 글의 개수 가져오기 
		count = myDAO.getSearchMypjCount(userId, code); // DB에 저장되어있는 전체 글의 개수를 가져와 담기
		System.out.println("Mycount : " + count);
		// 글이 하나라도 있으면 글들을 다시 가져오기 
		if(count > 0){
			articleList = myDAO.getMypjList(userId, code, startRow, endRow);
			System.out.println("articleList" +articleList);
		}
		number = count - (currentPage-1) * pageSize; 	// 게시판 목록에 뿌려줄 가상의 글 번호  
	
		// Controller에게 전달해야되는 데이터가 많으니 HashMap에 넘겨줄 데이터를 저장해서 한번에 전달 
		Map<String, Object> result = new HashMap<>(); 
		result.put("pageSize", pageSize);
		result.put("pageNum", pageNum);
		result.put("currentPage", currentPage);
		result.put("startRow", startRow);
		result.put("endRow", endRow);
		result.put("articleList", articleList);
		result.put("count", count);
		result.put("number", number);
				
		return result;
	}

	@Override
	public Map<String, Object> getMyTopicList(String userId, String code, String pageNum) throws SQLException {
		System.out.println("topic service");
		// ** 게시글 페이지 관련 정보 세팅 ** 
		// 한페이지에 보여줄 게시글의 수 
		int pageSize = 5; 
		// 현재 페이지 번호  
		if(pageNum == null){ // list.do 라고만 요청했을때, 즉 pageNum 파라미터 안넘어왔을때.
			pageNum = "1";
		}
		// 현재 페이지에 보여줄 게시글 시작과 끝 등등 정보 세팅 
		int currentPage = Integer.parseInt(pageNum); // 계산을 위해 현재페이지 숫자로 변환하여 저장 
		int startRow = (currentPage - 1) * pageSize + 1; // 페이지 시작글 번호 
		int endRow = currentPage * pageSize; // 페이지 마지막 글번호
		
		// 프로젝트 게시판 글 가져오기 
		List<TopicDTO> articleList = null;  	// 전체(검색된) 게시글들 담아줄 변수
		int count = 0; 							// 전체(검색된) 글의 개수 
		int number = 0; 						// 브라우저 화면에 뿌려줄 가상 글 번호  
		
		// 전체 글의 개수 가져오기 
		count = myDAO.getSearchMytopicCount(userId, code); // DB에 저장되어있는 전체 글의 개수를 가져와 담기
		System.out.println("Mycount : " + count);
		// 글이 하나라도 있으면 글들을 다시 가져오기 
		if(count > 0){
			articleList = myDAO.getMytopicList(userId, code, startRow, endRow);
			System.out.println("articleList" +articleList);
		}
		number = count - (currentPage-1) * pageSize; 	// 게시판 목록에 뿌려줄 가상의 글 번호  
	
		// Controller에게 전달해야되는 데이터가 많으니 HashMap에 넘겨줄 데이터를 저장해서 한번에 전달 
		Map<String, Object> result = new HashMap<>(); 
		result.put("pageSize", pageSize);
		result.put("pageNum", pageNum);
		result.put("currentPage", currentPage);
		result.put("startRow", startRow);
		result.put("endRow", endRow);
		result.put("articleList", articleList);
		result.put("count", count);
		result.put("number", number);
				
		return result;
	}

	@Override
	public Map<String, Object> getMyTopCommList(String userId, String code, String pageNum) throws SQLException {
		System.out.println("topComm service");
		// ** 게시글 페이지 관련 정보 세팅 ** 
		// 한페이지에 보여줄 게시글의 수 
		int pageSize = 5; 
		// 현재 페이지 번호  
		if(pageNum == null){ // list.do 라고만 요청했을때, 즉 pageNum 파라미터 안넘어왔을때.
			pageNum = "1";
		}
		// 현재 페이지에 보여줄 게시글 시작과 끝 등등 정보 세팅 
		int currentPage = Integer.parseInt(pageNum); // 계산을 위해 현재페이지 숫자로 변환하여 저장 
		int startRow = (currentPage - 1) * pageSize + 1; // 페이지 시작글 번호 
		int endRow = currentPage * pageSize; // 페이지 마지막 글번호
		
		// 프로젝트 게시판 글 가져오기 
		List<TopicCommDTO> articleList = null;  	// 전체(검색된) 댓글들 담아줄 변수
		int count = 0; 							// 전체(검색된) 댓글의 개수 
		int number = 0; 						// 브라우저 화면에 뿌려줄 가상 글 번호  
		
		// 전체 글의 개수 가져오기 
		count = myDAO.getTopicCommCount(userId, code); // DB에 저장되어있는 전체 글의 개수를 가져와 담기
		System.out.println("My comm count : " + count);
		// 글이 하나라도 있으면 글들을 다시 가져오기 
		if(count > 0){
			articleList = myDAO.getMytopicCommList(userId, code, startRow, endRow);
			System.out.println("articleList" +articleList);
		}
		number = count - (currentPage-1) * pageSize; 	// 게시판 목록에 뿌려줄 가상의 글 번호  
	
		// Controller에게 전달해야되는 데이터가 많으니 HashMap에 넘겨줄 데이터를 저장해서 한번에 전달 
		Map<String, Object> result = new HashMap<>(); 
		result.put("pageSize", pageSize);
		result.put("pageNum", pageNum);
		result.put("currentPage", currentPage);
		result.put("startRow", startRow);
		result.put("endRow", endRow);
		result.put("articleList", articleList);
		result.put("count", count);
		result.put("number", number);
				
		return result;
		
	}

	@Override
	public UserInfoDTO getUserInfo(String userId, String code) throws SQLException {
		return myDAO.getUserInfo(userId, code);
	}

	@Override
	public int updateUserInfo(String userId, String code, UserDTO dto) throws SQLException {
		return myDAO.updateUserInfo(userId, code, dto);
	}
	// 세션 삭제 
	@Override
	public void removeSessionAttr(String sessionName) {
		RequestContextHolder.getRequestAttributes().removeAttribute(sessionName, RequestAttributes.SCOPE_SESSION);
		
	}

	@Override
	public int pwChenge(String nowPw, String newPw, String userId) throws SQLException {
		// id, pw 체크하고 맞으면 삭제, 틀리면 삭제 안함
		int result = myDAO.idPwCheck(userId, nowPw);
		if(result == 1) {
			myDAO.updatePw(userId, newPw);
		}
		return result;
	}

	@Override
	public int deleteUser(String userId, String pw) throws SQLException {
		// id, pw 체크하고 맞으면 삭제, 틀리면 삭제 안함
		int result = myDAO.idPwCheck(userId, pw);
		System.out.println("회원탈퇴 result" + result);
		if(result == 1) {
			myDAO.deleteUser(userId);
			removeSessionAttr("sid"); // 위에서 세션삭제 메소드 만든것 있으니 활용
		}
		return result;
	}
	

}
