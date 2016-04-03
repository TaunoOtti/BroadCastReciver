package com.tauno.broadcastreciver;

import java.util.Date;

/**
 * Created by Tauno on 3.04.2016.
 */
public class DayStatistic {

    private int _id;
    private Date _dayStamp;
    private int _dayCounter;
    private int _operandId;

    public int getId(){
        return this._id;
    }

    public void setId(int id){
        this._id = id;
    }

    public Date getDayStamp(){
        return this._dayStamp;
    }

    public void setDayStamp(Date dayStamp){
        this._dayStamp = dayStamp;
    }

    public int getOperandId(){
        return this._operandId;
    }

    public void setOperandId(int operandId){
        this._operandId = operandId;
    }

    public int getDayCounter(){
        return this._dayCounter;
    }

    public void setDayCounter(int dayCounter){
        this._dayCounter = dayCounter;
    }
}
