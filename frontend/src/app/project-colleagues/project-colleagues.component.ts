import {Component, OnInit} from '@angular/core';
import {ProjectColleagues} from '../domain/ProjectColleagues';
import {ProjectColleaguesService} from './project-colleagues.service';
import {PersistencyService} from '../shared/persistency.service';

@Component({
  selector: 'app-project-colleagues',
  templateUrl: './project-colleagues.component.html'
})
export class ProjectColleaguesComponent implements OnInit {

  userCode: string;
  userName: string;
  projectColleagues: ProjectColleagues;

  constructor(private projectColleaguesService: ProjectColleaguesService,
              private persistencyService: PersistencyService) {
  }

  ngOnInit() {
    this.userCode = this.persistencyService.getUserCode();
    this.userName = this.persistencyService.getUserName();
    this.getProjectColleagues();
  }

  private getProjectColleagues() {
    this.projectColleaguesService
      .getProjectColleagues(this.userCode)
      .subscribe(projectColleagues => this.projectColleagues = projectColleagues);
  }

}
