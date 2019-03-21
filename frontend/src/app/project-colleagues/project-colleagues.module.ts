import {NgModule} from '@angular/core';
import {ProjectColleaguesComponent} from './project-colleagues.component';
import {ProjectColleaguesService} from '../project-colleagues.service';
import {MatListModule} from '@angular/material';
import {SharedModule} from '../shared/shared.module';
import {ProjectsComponent} from './projects/projects.component';
import {CommonModule} from '@angular/common';

@NgModule({
  declarations: [
    ProjectColleaguesComponent,
    ProjectsComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    MatListModule
  ],
  providers: [
    ProjectColleaguesService
  ]
})
export class ProjectColleaguesModule {
}
