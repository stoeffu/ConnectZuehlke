import { Component, OnInit } from '@angular/core';
import {PersistencyService} from '../shared/persistency.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.scss']
})
export class LogoutComponent implements OnInit {

  constructor(
    private persistencyService: PersistencyService
  ) { }

  ngOnInit() {
    this.persistencyService.deleteUsername();
  }

}
