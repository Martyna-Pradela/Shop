package com.company;

public class Customer {

    private String first_name;
    private String last_name;
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }
    public Account getAccount()
    {
        return account;
    }

    public Customer(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }


    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }
    public String getFirst_name()
    {
        return first_name;
    }

    public void setLast_name (String last_name)
    {
        this.first_name = last_name;
    }
    public String getLast_name()
    {
        return last_name;
    }
}
