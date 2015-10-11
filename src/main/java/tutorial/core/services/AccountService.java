package tutorial.core.services;

import tutorial.core.models.entities.Account;
import tutorial.core.models.entities.Blog;
import tutorial.core.services.util.AccountList;
import tutorial.core.services.util.BlogList;

public interface AccountService {
    Account findAccount(Long id);
    Account createAccount(Account data);
    Blog createBlog(Long accountId, Blog data);
    BlogList findBlogsByAccount(Long accountId);
    AccountList findAllAccounts();
    Account findByAccountName(String name);
}
