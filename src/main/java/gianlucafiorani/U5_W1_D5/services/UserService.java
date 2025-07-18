package gianlucafiorani.U5_W1_D5.services;

import gianlucafiorani.U5_W1_D5.entities.User;
import gianlucafiorani.U5_W1_D5.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    UserDAO userDAO;

    public void save(User user) {
        userDAO.save(user);
    }

}
