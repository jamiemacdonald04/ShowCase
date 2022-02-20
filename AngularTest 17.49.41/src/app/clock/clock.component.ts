import { Component } from "@angular/core"

@Component({
  selector: 'app-clock',
  templateUrl: './clock.component.html',
  styleUrls: ['./css/gmt.clock.component.css',
              './css/australiasia.clock.component.css',
              './css/central-europe.clock.component.css',
              './css/general.clock.component.css']
})


export class ClockComponent {

  GetTime(plusHrs:number){
    var today = new Date();
    today.setHours(today.getHours() + plusHrs);
    return String(today.getHours()).padStart(2, "0") + ":" + String(today.getMinutes()).padStart(2, "0");
  }
  sydney_time = this.GetTime(11);
  london_time = this.GetTime(0)
  paris_time = this.GetTime(1)

}


