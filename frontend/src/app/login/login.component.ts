import { Component, OnInit } from '@angular/core';
import {PersistencyService} from "../persistency.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  username: string;

  constructor(private persistencyService: PersistencyService) { }

  ngOnInit() {
  }

  login() {
    this.persistencyService.setUsername(this.username);
  }
}
