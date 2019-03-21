import {Component, OnInit} from '@angular/core';
import {ProjectColleagues} from '../domain/ProjectColleagues';
import {ProjectColleaguesService} from '../project-colleagues.service';

@Component({
  selector: 'app-project-colleagues-list',
  templateUrl: './project-colleagues.component.html'
})
export class ProjectColleaguesComponent implements OnInit {

  projectColleagues: ProjectColleagues;

  constructor(private service: ProjectColleaguesService) {
  }

  ngOnInit() {
    this.getProjectColleagues();
  }

  private getProjectColleagues() {
    this.service
      .getProjectColleagues('dummy')
      .subscribe(projectColleagues => this.projectColleagues = projectColleagues);
  }

}
