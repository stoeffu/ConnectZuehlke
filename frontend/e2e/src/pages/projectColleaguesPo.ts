import {by, element, ElementFinder} from 'protractor';


export class ProjectColleaguesPo {
  private rootSelector = by.css('[data-id="project-colleagues-list"]');
  private root: ElementFinder;

  constructor() {
    this.root = element(this.rootSelector);
  }

  isDisplayed() {
    return this.root.isDisplayed();
  }
}
