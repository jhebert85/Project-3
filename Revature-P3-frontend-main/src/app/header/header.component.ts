import { Component, OnInit } from '@angular/core';
import { AuthService } from '../user-info/auth.service';

@Component({
  selector: 'header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private authService:AuthService) { }

  ngOnInit(): void {
  }
  hasLoggedIn(){
    return this.authService.isLoggedIn;
  }
}
