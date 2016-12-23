package ua.pp.iserf.util;

import ua.pp.iserf.entity.Role;
import ua.pp.iserf.entity.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ualex
 */
public class Helper {

    public static String getAllUserRoles(User user) {
        String allUserRoles = "";
        List<Role> userRoleList = user.getRoles();
        for (Role role : userRoleList) {
            allUserRoles += role.getRoleName() + " ";
        }
        return allUserRoles;
    }

    public static String getBaseUrl(HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        String baseURL = url.substring(0, url.length() - request.getRequestURI().length()) + request.getContextPath();
        return baseURL;
    }

    public static boolean isUserHasRole(String roleName, User user) {
        List<Role> userRoleList = user.getRoles();
        for (Role userRole : userRoleList) {
            if (userRole.getRoleName().equals(roleName)) {
                return true;
            }
        }
        return false;
    }


    public static void clearNotification(HttpSession session) {

        session.removeAttribute("successNotification");
        session.removeAttribute("errorNotification");

    }

}
