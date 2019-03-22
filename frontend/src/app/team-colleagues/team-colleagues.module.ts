import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {SharedModule} from '../shared/shared.module';
import {MatListModule} from '@angular/material';
import {TeamColleaguesService} from './team-colleagues.service';
import {TeamColleaguesComponent} from './team-colleagues.component';

@NgModule({
  declarations: [
    TeamColleaguesComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    MatListModule
  ],
  providers: [
    TeamColleaguesService
  ]
})
export class TeamColleaguesModule {
}
