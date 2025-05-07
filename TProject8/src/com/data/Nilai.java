package com.data;
import com.actions.manageNilai;

public class Nilai implements manageNilai {
    private int nilai1, nilai2, nilai3, nilai4, nilai5, nilai6, nilai7;
    private double ipk;
    private int bobotNilai;
    private char grade;

    public Nilai(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, int nilai6, int nilai7) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.nilai6 = nilai6;
        this.nilai7 = nilai7;
    }


    public double hitungIpk() {
        
        return ipk;
    }

    public int hitungBobot() {
        if (grade == 'A') {
            bobotNilai = 4;
        } else if (grade == 'B') {
            bobotNilai = 3;
        } else if (grade == 'C') {
            bobotNilai = 2;
        } else if (grade == 'D') {
            bobotNilai = 1;
        } else if (grade == 'E') {
            bobotNilai = 0;
            
        }
        return bobotNilai;
    }

    public char getGrade(int inputnilai) {
            if (inputnilai >= 85) {
                grade = 'A';
            } else if (inputnilai >= 70) {
                grade = 'B';
            } else if (inputnilai >= 60) {
                grade = 'C';
            } else if (inputnilai >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }
           return grade;
        }

    @Override
    public char getGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrade'");
    }
}
