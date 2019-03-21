import {Component, OnInit} from '@angular/core';
import {PersonalDevelopment} from '../domain/PersonalDevelopment';
import {PersonalDevelopmentService} from './personal-development.service';
import {PersistencyService} from '../shared/persistency.service';

@Component({
  selector: 'app-personal-development',
  templateUrl: './personal-development.component.html',
  styleUrls: ['./personal-development.component.scss']
})
export class PersonalDevelopmentComponent implements OnInit {

  userCode: string;
  personalDevelopment: PersonalDevelopment;

  constructor(private personalDevelopmentService: PersonalDevelopmentService,
              private persistencyService: PersistencyService) {
  }

  ngOnInit() {
    this.userCode = this.persistencyService.getUsername();
//    this.getPersonalDevelopment();
  }

  private getPersonalDevelopment() {
    this.personalDevelopmentService
      .getPersonalDevelopment(this.userCode)
      .subscribe(personalDevelopment => this.personalDevelopment = personalDevelopment);
  }

}
