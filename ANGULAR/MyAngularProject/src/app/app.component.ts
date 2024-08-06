import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name:string;
  age:number;
  email:string;
  txtColor:string;
  img:string;
  fname:string='';
  constructor()
  {
    this.name="value";
    this.age=25;
    this.email="kabi@gmail.com";
    this.txtColor="green";
    this.fname="";
    this.img="c:\Users\DELL\Desktop\m.webp";
  }
    getAddition(a:number,b:number){
      let sum=a+b;
      return sum;
    }
    changeName()
    {
      this.name="harry";
    }
    changeAge()
    {
      this.age=30;
    }
    changeEmail()
    {
      this.email="harry@gmail.com";
    }
    changeImage()
    {
      this.img="c:\Users\DELL\Desktop\WhatsApp Image 2024-07-31 at 12.33.03_717900ac.jpg";
    }
}

// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrl: './app.component.css'
// })
// export class AppComponent 
// {
//   flag:boolean;
//   vehicles:string[];
//   selectedVehicle:string=" ";
//   myStyle:{};
//   myClass:string;
//   constructor() 
//   {
//     this.flag = true;
//     this.vehicles=["TwoWheeler","ThreeWheeler","FourWheeler"];
//     this.myStyle={'width':'40%','border':'2px solid green'}
//     this.myClass="MyClass1";
//   }
//   changeFlag()
//   {
//     this.flag = !this.flag;
//   }
//   setSelectedItem(vec : string)
//   {
//     this.selectedVehicle = vec;
//   }
//   ChangeClass()
//   {
//     this.myClass="MyClass2";
//   }
// }