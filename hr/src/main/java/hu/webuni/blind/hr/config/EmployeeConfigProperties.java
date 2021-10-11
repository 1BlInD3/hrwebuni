package hu.webuni.blind.hr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hr")
@Component
public class EmployeeConfigProperties {

    private Employee employee = new Employee();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public static class Employee{
        private Raise raise = new Raise();
        private Years years = new Years();

        public Years getYears() {
            return years;
        }

        public void setYears(Years years) {
            this.years = years;
        }

        public Raise getRaise() {
            return raise;
        }

        public void setRaise(Raise raise) {
            this.raise = raise;
        }
    }

    public static class Raise{
        private int def;
        private int min;
        private int mid;
        private int max;


        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Years{
        private Double min;
        private int mid;
        private int max;

        public Double getMin() {
            return min;
        }

        public void setMin(Double min) {
            this.min = min;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }
}
