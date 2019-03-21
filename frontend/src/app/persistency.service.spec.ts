import { TestBed } from '@angular/core/testing';

import { PersistencyService } from './persistency.service';

describe('PersistencyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PersistencyService = TestBed.get(PersistencyService);
    expect(service).toBeTruthy();
  });
});
