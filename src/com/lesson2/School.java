package com.lesson2;

class School {
    String name;
    int since;
    int studentCount;

    School() {
        // Пустой конструктор вызывает другой (см. ниже)
        this("Нет имени");
    }

    School(String name) {
        this.name = name;
    }



    String getName() {
        // Методы не могут вызывать конструктор!
        // Ошибка:
        //  this("Елена"):
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getSince() {
        return since;
    }

    void setSince(int since) {
        this.since = since;
    }

    int getStudentCount() {
        return studentCount;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}
