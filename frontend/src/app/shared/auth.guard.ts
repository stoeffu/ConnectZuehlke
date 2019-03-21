import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot} from '@angular/router';

import {PersistencyService} from './persistency.service';

@Injectable({providedIn: 'root'})
export class AuthGuard implements CanActivate {
  constructor(
    private router: Router,
    private persistencyService: PersistencyService
  ) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    const userCode = this.persistencyService.getUserCode();
    if (userCode) {
      return true;
    }

    this.router.navigate(['/login'], {queryParams: {returnUrl: state.url}});
    return false;
  }
}
