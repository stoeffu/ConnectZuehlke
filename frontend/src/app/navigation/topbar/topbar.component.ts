import {Component, EventEmitter, Output} from '@angular/core';
import {PersistencyService} from '../../shared/persistency.service';

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.scss']
})
export class TopbarComponent {
  @Output() toggleSidbar = new EventEmitter();


  constructor(private persistencyService: PersistencyService) {
  }

  isLoggedIn() {
    return this.getEmployeeCode() !== undefined
      && this.getEmployeeCode() !== null;
  }

  getEmployeeCode(): string {
    return this.persistencyService.getUserCode();
  }

  toggle() {
    this.toggleSidbar.emit();
  }
}
