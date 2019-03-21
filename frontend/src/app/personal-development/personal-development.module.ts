import {NgModule} from '@angular/core';
import {PersonalDevelopmentComponent} from './personal-development.component';
import {PersonalDevelopmentService} from './personal-development.service';
import {CommonModule} from '@angular/common';
import {SharedModule} from '../shared/shared.module';
import {MatListModule} from '@angular/material';


@NgModule({
  declarations: [
    PersonalDevelopmentComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    MatListModule
  ],
  providers: [
    PersonalDevelopmentService
  ]
})
export class PersonalDevelopmentModule {
}
