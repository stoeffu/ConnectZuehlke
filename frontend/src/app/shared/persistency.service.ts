import {Injectable} from '@angular/core';

const key = 'username';

@Injectable({
  providedIn: 'root'
})
export class PersistencyService {

  constructor() {
  }

  setUsername(username: string) {
    localStorage.setItem(key, username);
  }

  getUsername(): string {
    return localStorage.getItem(key);
  }

  deleteUsername() {
    localStorage.removeItem(key);
  }
}
