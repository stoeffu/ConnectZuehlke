import {Injectable} from '@angular/core';

const KEY_USER_CODE = 'user_code';
const KEY_USER_NAME = 'user_name';

@Injectable()
export class PersistencyService {

  setUser(code: string, name: string) {
    localStorage.setItem(KEY_USER_CODE, code);
    localStorage.setItem(KEY_USER_NAME, name);
  }

  getUserCode(): string {
    return localStorage.getItem(KEY_USER_CODE);
  }

  getUserName(): string {
    return localStorage.getItem(KEY_USER_NAME);
  }

  deleteUsername() {
    localStorage.removeItem(KEY_USER_CODE);
    localStorage.removeItem(KEY_USER_NAME);
  }

}
