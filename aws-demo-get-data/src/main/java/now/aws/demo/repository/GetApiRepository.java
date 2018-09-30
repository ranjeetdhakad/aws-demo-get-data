package now.aws.demo.repository;

import now.aws.demo.entity.Account;

public interface GetApiRepository {

	Account getAccount(Long accountId);
}
