package hyjung.shop_management.service;

import hyjung.shop_management.domain.Member;
import hyjung.shop_management.response.ApiResponse;
import org.springframework.transaction.annotation.Transactional;


public interface MemberService {

    ApiResponse saveMember(String userId, String userPw, String username);

    Member findMemberById(Long memberId);

    Member findMemberByUserId(String userId);

    ApiResponse findMemberAll();

    boolean checkUserIdDuplicate(String userId);

    ApiResponse login(String userId, String userPw);
}
