import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }
  name: string;
  age: number;
  email: string;
  imgPath: string;
  fname: string;
  flag: boolean;
  vehicles: string[];
  selectedVehicle: string;
  myStyle: {};

  myClass: string;

  constructor() {
    this.myClass = 'color';

    this.fname = '';
    this.name = 'Suje';
    this.age = 22;
    this.email = 'suje@gmail';
    this.imgPath =
      'https://img.freepik.com/free-photo/still-life-colored-transparent-sunglasses_52683-107576.jpg?ga=GA1.1.458012288.1718383004';

    this.flag = true;
    this.vehicles = ['TwoWheeler', 'FourWheeler'];

    this.selectedVehicle = '';

    this.myStyle = {
      width: '40%',
      border: '2px solid',
      'border-radius': '10px',
    };
  }

  changeStyle() {
    this.myStyle = {
      width: '50%',
      border: '1px solid red',
      'border-radius': '25px',
    };
  }

  changeName() {
    this.name = 'HI';
  }
  changeEmail() {
    this.email = 'doit@gmail.com';
  }
  changeImage() {
    this.imgPath =
      'https://img.freepik.com/premium-photo/compositions-food-canadian-symbol_23-2151509960.jpg?ga=GA1.1.458012288.1718383004';
  }

  changeFlag() {
    this.flag = !this.flag;
  }

  setSelectedItem(vec: string) {
    this.selectedVehicle = vec;
  }
}
