import {Component, OnInit} from '@angular/core';
import {DevelopmentProposal} from '../domain/DevelopmentProposal';
import {PersonalDevelopmentService} from './personal-development.service';
import {PersistencyService} from '../shared/persistency.service';

@Component({
  selector: 'app-personal-development',
  templateUrl: './personal-development.component.html',
  styleUrls: ['./personal-development.component.scss']
})
export class PersonalDevelopmentComponent implements OnInit {

  userCode: string;
  userName: string;
  developmentProposals: DevelopmentProposal[];

  constructor(private personalDevelopmentService: PersonalDevelopmentService,
              private persistencyService: PersistencyService) {
  }

  ngOnInit() {
    this.userCode = this.persistencyService.getUserCode();
    this.userName = this.persistencyService.getUserName();
    this.getDevelopmentProposal();
  }

  private getDevelopmentProposal() {
    this.personalDevelopmentService
      .getDevelopmentProposal(this.userCode)
      .subscribe(developmentProposals => this.developmentProposals = developmentProposals);
  }

}
