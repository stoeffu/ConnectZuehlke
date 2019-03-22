import {by, element, ElementFinder} from 'protractor';


export class TeamColleaguesPo {
  private rootSelector = by.css('#test');
  private root: ElementFinder;

  constructor() {
    this.root = element(this.rootSelector);
  }

  isDisplayed() {
    return this.root.isDisplayed();
  }
}
