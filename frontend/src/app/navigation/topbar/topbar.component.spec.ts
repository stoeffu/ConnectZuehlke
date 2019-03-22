import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {TopbarComponent} from './topbar.component';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {MatIconModule, MatToolbarModule} from '@angular/material';
import {LazyLoadImageModule} from 'ng-lazyload-image';
import {PersistencyService} from '../../shared/persistency.service';

describe('TopbarComponent', () => {
  let component: TopbarComponent;
  let fixture: ComponentFixture<TopbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [TopbarComponent],
      imports: [
        NoopAnimationsModule,
        MatToolbarModule,
        MatIconModule,
        LazyLoadImageModule
      ],
      providers: [PersistencyService]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TopbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
