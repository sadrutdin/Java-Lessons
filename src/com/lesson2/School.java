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

    int getSince() {
        return since;
    }

    int getStudentCount() {
        return studentCount;
    }

    School setName(String name) {
        this.name = name;
        return this;
    }

    School setSince(int since) {
        this.since = since;
        return this;
    }

    School setStudentCount(int studentCount) {
        this.studentCount = studentCount;
        return this;
    }
}
