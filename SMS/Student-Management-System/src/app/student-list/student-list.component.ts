import { Component, OnInit } from '@angular/core';
import {  HttpClient } from "@angular/common/http";
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students:any;
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8585/students').subscribe((res)=>{
      this.students=res;
    })
  }


}
