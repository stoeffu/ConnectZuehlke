import {Component, OnInit} from '@angular/core';
import {PersistencyService} from '../shared/persistency.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  username: string;
  returnUrl: string;

  constructor(
    private persistencyService: PersistencyService,
    private router: Router,
    private activatedRoute: ActivatedRoute) {
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(params => {
      this.returnUrl = params.returnUrl;
    });
  }

  login() {
    if (this.username) {
      this.persistencyService.setUsername(this.username);
      if (this.returnUrl) {
        this.goTo(this.returnUrl);
      } else {
        this.goTo('/');
      }
    }
  }

  private goTo(url) {
    this.router.navigate([url]);
  }
}
