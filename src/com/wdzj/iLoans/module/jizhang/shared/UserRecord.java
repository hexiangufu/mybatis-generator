package com.wdzj.iLoans.module.jizhang.shared;

import java.math.BigDecimal;
import java.util.Date;

public class UserRecord {
    private Integer id;

    private BigDecimal amount;

    private Integer type;

    private String project;

    private String bizName;

    private String account;

    private String member;

    private String remark;

    private String userName;

    private Date createDate;

    private Date updateDate;

    private Integer incomePayFlag;

    private String itemName1;

    private String itemName2;

    private String payerName;

    private String toAccount;

    private String creditorName;

    private String borrowAccount;

    private Date repaymentDate;

    private Integer repaymentRemindFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName == null ? null : bizName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getIncomePayFlag() {
        return incomePayFlag;
    }

    public void setIncomePayFlag(Integer incomePayFlag) {
        this.incomePayFlag = incomePayFlag;
    }

    public String getItemName1() {
        return itemName1;
    }

    public void setItemName1(String itemName1) {
        this.itemName1 = itemName1 == null ? null : itemName1.trim();
    }

    public String getItemName2() {
        return itemName2;
    }

    public void setItemName2(String itemName2) {
        this.itemName2 = itemName2 == null ? null : itemName2.trim();
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount == null ? null : toAccount.trim();
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName == null ? null : creditorName.trim();
    }

    public String getBorrowAccount() {
        return borrowAccount;
    }

    public void setBorrowAccount(String borrowAccount) {
        this.borrowAccount = borrowAccount == null ? null : borrowAccount.trim();
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getRepaymentRemindFlag() {
        return repaymentRemindFlag;
    }

    public void setRepaymentRemindFlag(Integer repaymentRemindFlag) {
        this.repaymentRemindFlag = repaymentRemindFlag;
    }
}