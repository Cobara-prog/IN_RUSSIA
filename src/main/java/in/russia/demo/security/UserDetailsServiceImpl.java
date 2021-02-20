package in.russia.demo.security;

import in.russia.demo.entity.User;
import in.russia.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User myUser = userRepository.getByUsername(s);

        if (myUser == null){
            throw new UsernameNotFoundException("User not found");
        }
        return myUser;
    }
}
