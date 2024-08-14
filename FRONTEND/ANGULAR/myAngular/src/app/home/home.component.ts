import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  sum: number;

  constructor(private calc: CalculatorService) {
    this.sum = calc.getAddition(10, 20);
  }
}
