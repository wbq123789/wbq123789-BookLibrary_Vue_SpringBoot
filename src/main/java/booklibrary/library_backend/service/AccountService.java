package booklibrary.library_backend.service;

import booklibrary.library_backend.entity.database_obj.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends IService<Account>, UserDetailsService {
    public Account findAccountByNameOrEmail(String Text);
}