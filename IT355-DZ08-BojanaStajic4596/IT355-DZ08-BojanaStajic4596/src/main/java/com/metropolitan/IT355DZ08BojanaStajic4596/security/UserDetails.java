package com.metropolitan.IT355DZ08BojanaStajic4596.security;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Arrays;
import java.util.Collection;
public class UserDetails implements
        org.springframework.security.core.userdetails.UserDetails {
    private final User user;
    public UserDetails(User user) {
        this.user = user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority(user.getRole()));
    }
    @Override
    public String getPassword() {
        return user.getPassword();
    }
    @Override
    public String getUsername() {
        return user.getUsername();
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return user.getEnabled() == 0 ? true : false;
    }
}
