import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PersistencyService {

  constructor() { }

  setUsername(username: string) {
    localStorage.setItem('username', username);
  }

  getUsername(): string {
    return localStorage.getItem('username');
  }

}
