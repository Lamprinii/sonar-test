package io.github.oliviernt;

import java.time.LocalDate;
import java.time.YearMonth;

public final class GetterSetter {

    private String myValue;
    
    private LocalDate fromDate;

    public String getMyValue() {
        return myValue;
    }

    public void setMyValue(String myValue) {
        this.myValue = myValue;
    }

    public YearMonth getFromMonth() {
  
        return YearMonth.of(fromDate.getYear(), fromDate.getMonth());
    }

    public void setFromMonth(final YearMonth fromMonth) {

        this.fromDate = LocalDate.of(fromMonth.getYear(), fromMonth.getMonth(), 1);
    }
}
