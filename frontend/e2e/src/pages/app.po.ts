import {browser, by, element} from 'protractor';
import {ToolbarFragment} from '../fragments/toolbar.fragment';
import {SidebarFragment} from '../fragments/sidebar.fragment';
import {ProjectColleguesPo} from './projectCollegues.po';

export class AppPage {
  private toolbarFragment = new ToolbarFragment();
  private sidebarFragment = new SidebarFragment();
  private projectColleguesPage = new ProjectColleguesPo();

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

  projectColleguesList() {
    return this.projectColleguesPage;
  }
}
