import {Component, OnInit} from '@angular/core';
import {PersistencyService} from '../shared/persistency.service';
import {TeamColleaguesService} from './team-colleagues.service';
import {TeamColleagues} from '../domain/TeamColleagues';

@Component({
  selector: 'app-team-colleagues',
  templateUrl: './team-colleagues.component.html'
})
export class TeamColleaguesComponent implements OnInit {

  userCode: string;
  userName: string;
  teamColleagues: TeamColleagues;

  constructor(private teamColleaguesService: TeamColleaguesService,
              private persistencyService: PersistencyService) {
  }

  ngOnInit() {
    this.userCode = this.persistencyService.getUserCode();
    this.userName = this.persistencyService.getUserName();
    this.getTeamColleagues();
  }

  private getTeamColleagues() {
    this.teamColleaguesService
      .getTeamColleagues(this.userCode)
      .subscribe(teamColleagues => this.teamColleagues = teamColleagues);
  }

}
