package com.example.harshitbansal.selectcategory;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class checkup extends AppCompatActivity {
    String[] hospital ={"Sanjeevan Speciality Hospital, Pahar Ganj","Muni Maya Ram Jain Hospital, Pitampura","Phoenix Hospital, Greater Kailash","Ayushmaan Hospital, Sector-12 Dwarka","Sir Ganga Ram Hospital, Rajinder Nagar","Sri Balaji Action Medical Institute, Paschim Vihar","B.L.Kapur Memorial Hospital, Pusa Road","R.G.Stone Urology & Laparoscopy Hospital, 195 Deepali Pritam Pura", "R.B.Seth Jessaram & Bros. Charitable Hospital Trust, W.E.A.,Karoal Bagh","Arya Hospital, Janakpuri","Avantika Hospital, Rohini", "Delhi Heart And Lung Institute, Panchkuian Road","amily Hospital Pvt. Ltd, Opp Crpf Camp Tilak Nagar","Vinayak Hospital, Near Model Town","Pushpanjali Medical Centre, Pushpankali","Jeewan Mala Hospital Pvt. Ltd, New Rohtak Road","Maharaja Agrasen Hospital, Punjabi Bagh","Moolchand Hospital, Near Moolchand Flyover","Aggarwal Nursing Home, Tri Nagar","Holy Child Nursing Home, Swami Daya Nand Marg","Jain Child & Maternity Hospital Pvt Ltd, Ae-7 Shalimar Bag","Jeewan Hospital & Nursing Home, Jeewan Nagar","National Heart Institute, East Of Kailash","Singhal Hospital, Mangalapuri","Fortis Health Management (North) Ltd.(Fhmni), New Delhi","Vardaan Hospital, Malviya Nagar","Virmani Hospital, L.S.C Mayur Vihar","A-One Hospital, Main Rohtak Road","Anand Hospital, Vikashpuri","Chawla Nursing Home, Rajouri Garden","Delhi Heart Hospital, Vikas Marg Extension","Gambhir Hospital, Rajouri Garden","Gupta Medical Centre, Pashim Vihar","J.K.Hospital, Janak Puri","Jeevan Jyoti Hospital, Uttam Nagar","Kesar Hospital, Shalimar Bagh","Kherarpal Nursing Home, Near Shivaji College","Kuber Hospital, 12, Chanserlok Enclave Pitampura","Medfirst Health Care Pvt Ltd, Vasant Vihar","Vasan Eye Care Hospital, Karol Bagh","Indraprastha Apollo Hospital, Sarita Vihar","Bensups Hospital, Dwarka","Dharmashila Cancer Hospital & Research Centre, East Delhi","Fortis Health Management (North) Ltd.(Fhmni), Okhla Road","Fortis Flt.Lt.Rajan Dhali Hospital, Vasany Kunj","Saroj Hospital & Heart Institute, Rohini","Healing Touch Hospital, Opp.Laxman Public School","K.K.Surgical & Maternity Centre, Shadara","Bhatia Global Hospital & Endosurgery Institute, Paschim Vihar","Metro Hospital & Cancer Institute, Preet Vihar","Goyal Hospital & Urology Centre, Krishna Nagar","Max Hospital, Pitampura","Medical & Diagnostic Research Centre, Patparganj","Max Healthcare Institute Limited, Saket","Jeevan Anmol Hospital, Mayur Vihar Phase-1","Lotus Hospital, Harinagar","Sanjeevan Medical Research Centre, Daryaganj","Shroff Eye Centre, New Delhi","Prashant Hospital, Rohini","Rashmi Hospital, Pitampura","Spring Dales Medical Centre, Prashant Vihar","Vashishta Clinics & Hospital For Orthopaedics, Malviya Nagar","Nova Medical Center, Kailash Colony","Max Devki Devi Heart & Vascular Institute,Saket","Amar Leela Hospitals, Janakpuri","Jeevan Jyothi Clinic & Hospital, Dilshad Garden","Pushpawati Singhania Research Institute, Seikh Sarai-li","Sant Parmanand Hospital, Civil Lines","Family Hospital Pvt Ltd, Rohini","Aastha Hospital, New Mahavir Nagar","Central Hospital, Ganesh Nagar","Durga Hospital P Ltd, Mukherji Nagar","East Delhi Medical Centre, Shahdara","Banarasidas Chandiwala Inst Of Medical Sciences, Kalkaji","Dr.Roshan Lal Hospital, Naveen Shahdara","St.Stephen’s Hospital, Tis Hazari"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkup);
        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,hospital);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.DKGRAY);

    }
}
