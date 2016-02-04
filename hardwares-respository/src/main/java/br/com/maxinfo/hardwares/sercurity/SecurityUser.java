package br.com.maxinfo.hardwares.sercurity;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.maxinfo.hardwares.model.Usuario;
 
 
public class SecurityUser implements UserDetails {
 
        private static final long serialVersionUID = 1L;
 
        private Usuario user;
        private List<SimpleGrantedAuthority> authorities = null;
 
        public SecurityUser(Usuario user, List<SimpleGrantedAuthority> authorities) {
                this.user = user;
                this.authorities = authorities;
        } 
   
        public Collection<? extends GrantedAuthority> getAuthorities() {
                return authorities;
        } 
      
        public String getPassword() {
                return user.getPassword();
        } 
       
        public String getUsername() {
                return user.getUsername();
        } 
        
        public boolean isAccountNonExpired() {
                return true;
        }
 
       
        public boolean isAccountNonLocked() {
                return true;
        }
 
      
        public boolean isCredentialsNonExpired() {
                return true;
        }
 
       
        public boolean isEnabled() {
                return true;
        }
 
        /**
         * @return Usuario
         */
        public Usuario getUser() {
                return user;
        }
 
}