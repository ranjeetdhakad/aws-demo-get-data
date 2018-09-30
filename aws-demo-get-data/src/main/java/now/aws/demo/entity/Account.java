package now.aws.demo.entity;


public class Account {

	private long accountId;
	private String accountName;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
    @Override
    public String toString() {
        return "Account{" + "accountId=" + accountId + ", AccountName=" + accountName
                + "}";
    }
}
