import {TestBed} from '@angular/core/testing';

import {PersistencyService} from './persistency.service';
import {SharedModule} from './shared.module';

describe('PersistencyService', () => {
  beforeEach(() => TestBed.configureTestingModule({imports: [SharedModule]}));

  it('should be created', () => {
    const service: PersistencyService = TestBed.get(PersistencyService);
    expect(service).toBeTruthy();
  });
});
