import {AppPage} from './pages/app.po';
import {browser, logging} from 'protractor';
import {LoginPage} from './pages/login.po';

describe('Main App Page', () => {
  let appPage: AppPage;
  let loginPage: LoginPage;

  beforeEach(() => {
    appPage = new AppPage();
    loginPage = new LoginPage();
  });

  it('should display welcome message on login page and log in', async () => {
    await loginPage.navigateTo();
    await loginPage.assertLoginShownAndLogin();
    expect(appPage.getTitleText()).toEqual('Welcome to Zühlke Connect!');
  });

  it('should show sidebar when clicking on navigation header', () => {
    appPage.navigateTo();
    expect(appPage.sidebar().isDisplayed()).toBeFalsy();
    appPage.toolbar().toggleSidebar();
    expect(appPage.sidebar().isDisplayed()).toBeTruthy();
  });

  it('should go to project collegues', () => {
    appPage.navigateTo();
    appPage.toolbar().toggleSidebar();
    expect(appPage.sidebar().isDisplayed()).toBeTruthy();

    appPage.sidebar().clickOn('My Project Colleagues');
    const projectColleguesPage = appPage.projectColleguesList();

//    expect(projectColleguesPage.isDisplayed()).toBeTruthy();
  });


  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    }));
  });
});
