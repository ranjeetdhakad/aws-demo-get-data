package now.aws.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import now.aws.demo.entity.Account;
import now.aws.demo.repository.GetApiRepository;

@Service
public class GetApiService {

	Account acct = null;
	private final GetApiRepository getAcctRepo;
	
	  @Autowired
	    public GetApiService(GetApiRepository getAcctRepo) {
	        this.getAcctRepo = getAcctRepo;
	    }
	public Account getAccount(Long accountId)
	{
		acct = getAcctRepo.getAccount(accountId);
		return acct;
	}
}
