import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClockComponent } from './clock.component';


describe('ClockComponent', () => {
  let component: ClockComponent;
  let fixture: ComponentFixture<ClockComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClockComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it(`has the correct length for a time and colon'`, () => {

    let internationalTime : string[] = [component.london_time, component.sydney_time, component.paris_time];
    for (var time of internationalTime) {
      expect(time.length).toEqual(5);
      expect(time).toContain(":");

    }
  });
});
