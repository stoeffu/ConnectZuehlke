import {browser, by, element} from 'protractor';


export class LoginPage {

  async navigateTo() {
    return await browser.get(browser.baseUrl) as Promise<any>;

  }

  async assertLoginShownAndLogin() {
    expect(this.getLoginTitleText()).toBe('Welcome!');
    await element(by.css('[data-id="username-input"]')).sendKeys('kmu');
    return await element(by.css('[data-id="login-button"]')).click();
  }

  getLoginTitleText() {
    return element(by.css('app-login h2')).getText() as Promise<string>;
  }

}
