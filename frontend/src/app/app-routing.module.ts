import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {EmployeeListComponent} from './employee-list/employee-list.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';
import {EmployeeDetailComponent} from './employee-detail/employee-detail.component';
import {MapComponent} from './map/map.component';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {ProjectColleaguesComponent} from './project-colleagues/project-colleagues.component';
import {LoginComponent} from './login/login.component';
import {AuthGuard} from './shared/auth.guard';
import {LogoutComponent} from './logout/logout.component';

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'employees', component: EmployeeListComponent, canActivate: [AuthGuard]},
  {path: 'customers', component: CustomerListComponent, canActivate: [AuthGuard]},
  {path: 'employee/:code', component: EmployeeDetailComponent, canActivate: [AuthGuard]},
  {path: 'welcome', component: HackathonHeadlineComponent, canActivate: [AuthGuard]},
  {path: 'map', component: MapComponent, canActivate: [AuthGuard]},
  {path: 'project-colleagues', component: ProjectColleaguesComponent, canActivate: [AuthGuard]},

  {path: '', redirectTo: '/welcome', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
