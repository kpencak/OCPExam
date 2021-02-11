package kpencak;

//#1
import java.util.*; // compiles first
import java.sql.*; // won't compile - reference too ambiguous

//#2
import java.util.Date; //compiles first - zdefiniowana konkretna klasa, co ma zawsze pierwszeństwo nad wildcard
import java.sql.*; //compiles without error

//#3
import java.util.Date; //both will compile with error - reference is too ambiguos
import java.sql.Date;

//#4
import java.util.Date;

public class ImportDate {
    Date date;
    java.sql.Date sqlDate;
}
