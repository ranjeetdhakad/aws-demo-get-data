package now.aws.demo.repository;

import org.springframework.stereotype.Repository;

import now.aws.demo.entity.Account;

@Repository
public class GetApiRepositoryImpl implements GetApiRepository {

	Account acct = null;
	@Override
	public Account getAccount(Long accountId) {
		// TODO Auto-generated method stub
		acct = new Account();
		acct.setAccountId(1);
		acct.setAccountName("SNOW");
		return acct;
	}

}
