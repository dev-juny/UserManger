import java.util.Iterator;
import java.util.List;

public interface UserService {
    //회원정보 등록
    public void addUser(User user);
    //회원정보 수정 user.getEmail()에 해당하는 회원정보를 수정한다.
    public boolean updateUser(User user);
    //회원정보 삭제
    public boolean deleteUser(String email);
    //모든 회원정보 반환.
    public Iterator<User> getUsers();

    // email에 해당하는 회원정보가 있을 경우 true 아니면 false
    public boolean exists(String email);
}
