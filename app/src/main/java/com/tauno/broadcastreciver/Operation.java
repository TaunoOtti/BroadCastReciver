package com.tauno.broadcastreciver;

/**
 * Created by Tauno on 3.04.2016.
 */
public class Operation {
    private int _id;
    private float _num1;
    private float _num2;
    private float _res;
    private int _timestamp;
    private int _operandId;

    public int getId(){
        return this._id;
    }

    public void setId(int id){
        this._id = id;
    }

    public int getOperandId(){
        return this._operandId;
    }

    public void  set_operandId(int operandId){
        this._operandId = operandId;
    }

    public float getNum1(){
        return this._num1;
    }

    public void setNum1(int num1){
        this._num1 = num1;
    }

    public float getNum2(){
        return this._num2;
    }

    public void setNum2(int num2){
        this._num2 = num2;
    }

    public float getRes(){
        return this._res;
    }

    public void setRes(int res){
        this._res = res;
    }

    public int getTimeStamp(){
        return this._timestamp;
    }

    public void setTimeStamp(int timestamp){
        this._timestamp = timestamp;
    }

}
