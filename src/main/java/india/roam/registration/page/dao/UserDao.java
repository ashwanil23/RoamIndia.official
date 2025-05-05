package india.roam.registration.page.dao;

import java.util.List;
import java.util.Map;

public interface UserDao {
//    boolean addUser(User user);
Map<String, String> fetchUserDetails(String username, String password);
    boolean isValidUser(String username, String password);
}
