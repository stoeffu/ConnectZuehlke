import {browser, by, element} from 'protractor';
import {ToolbarFragment} from '../fragments/toolbar.fragment';
import {SidebarFragment} from '../fragments/sidebar.fragment';
import {ProjectColleaguesPo} from './projectColleaguesPo';
import {TeamColleaguesPo} from './teamColleaguesPo';

export class AppPage {
  private toolbarFragment = new ToolbarFragment();
  private sidebarFragment = new SidebarFragment();
  private projectColleaguesPage = new ProjectColleaguesPo();
  private teamColleaguesPage = new TeamColleaguesPo();

  async navigateTo() {
    return await browser.get(browser.baseUrl) as Promise<any>;

  }

  getTitleText() {
    return element(by.css('app-root h1')).getText() as Promise<string>;
  }

  toolbar() {
    return this.toolbarFragment;
  }

  sidebar() {
    return this.sidebarFragment;
  }

  projectColleagues() {
    return this.projectColleaguesPage;
  }

  teamColleagues() {
    return this.teamColleaguesPage;
  }
}
