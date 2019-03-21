import {NgModule} from '@angular/core';
import {EmployeeComponent} from './employee/employee.component';
import {CommonModule} from '@angular/common';
import {PersistencyService} from './persistency.service';
import {MatExpansionModule} from '@angular/material';
import {intersectionObserverPreset, LazyLoadImageModule} from 'ng-lazyload-image';

@NgModule({
  declarations: [
    EmployeeComponent
  ],
  imports: [
    CommonModule,
    MatExpansionModule,
    LazyLoadImageModule.forRoot({
      preset: intersectionObserverPreset
    }),
  ],
  exports: [
    EmployeeComponent
  ],
  providers: [
    PersistencyService
  ]
})
export class SharedModule {
}
