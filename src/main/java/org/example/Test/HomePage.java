package org.example.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{


    @FindBy(id = "style_avatar_wrapper__pEGIQ")
    private WebElement avatar;

    @FindBy(id = "email_login")
    private WebElement email_login;

    @FindBy(id="password_login")
    private WebElement password_login;

    @FindBy(id="btn_login")
    private WebElement btn_login;

    private String url ="https://ztrain-web.vercel.app/en/home";


    public void Connexion(){
        this.email_login.sendKeys("rickkhaki@gmail.com");
        this.password_login.sendKeys("rick237");
        this.btn_login.click();
    }

    public void NavigateTOhomePage(){
        this.get(url);
    }

    public void FieldEmailLogin(String email){
        this.email_login.sendKeys(email);
    }

    public void FieldPasswordLogin(String password){
        this.password_login.sendKeys(password);
    }

    public void BtnLogin(){
        this.btn_login.click();
    }

    public void clickAvatar(){
        this.avatar.click();
    }




}
