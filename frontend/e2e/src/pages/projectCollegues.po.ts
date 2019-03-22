import {browser, by, element, ElementFinder} from 'protractor';


export class ProjectColleguesPo {
  private rootSelector = by.css('[data-id="projectCollegues-list"]');
  private root: ElementFinder;

  constructor() {
    this.root = element(this.rootSelector);
  }

  navigateTo() {
    return browser.get('${browser.baseUrl}/employees') as Promise<any>;
  }

  isDisplayed() {
    return this.root.isDisplayed();
  }
}
