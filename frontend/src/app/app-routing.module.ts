import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';
import {ProjectColleaguesComponent} from './project-colleagues/project-colleagues.component';
import {LoginComponent} from './login/login.component';
import {AuthGuard} from './shared/auth.guard';
import {LogoutComponent} from './logout/logout.component';
import {PersonalDevelopmentComponent} from './personal-development/personal-development.component';

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'welcome', component: HackathonHeadlineComponent, canActivate: [AuthGuard]},
  {path: 'project-colleagues', component: ProjectColleaguesComponent, canActivate: [AuthGuard]},
  {path: 'personal-development', component: PersonalDevelopmentComponent, canActivate: [AuthGuard]},

  {path: '', redirectTo: '/welcome', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
