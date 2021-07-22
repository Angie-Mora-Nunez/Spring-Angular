package com.example.Support.Model.Model;

import javax.persistence.*;


    @Entity
    @Table(name="Issues")
    public class Issues {
        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int Id;
        private String Report_Number;
        private String Classification;
        private String Status;

        public Issues() {

        }
        public Issues(int id, String report_number, String classification, String status) {
            setId(id);
            setReport_Number(report_number);
            setClassification(classification);
            setStatus(status);
        }


        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getReport_Number() {
            return Report_Number;
        }

        public void setReport_Number(String report_Number) {
            Report_Number = report_Number;
        }

        public String getClassification() {
            return Classification;
        }

        public void setClassification(String classification) {
            Classification = classification;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }
    }



