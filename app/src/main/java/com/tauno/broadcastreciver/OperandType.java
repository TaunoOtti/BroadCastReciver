package com.tauno.broadcastreciver;

/**
 * Created by Tauno on 3.04.2016.
 */
public class OperandType {
    private int _id;
    private String _operand;
    private int _lifeTimeCounter;

   /* public OperandType(){}

    public OperandType(int id, String operand, int Counter){
        this._id = id;
        this._operand = operand;
        this._lifeTimeCounter = Counter;
    }

    public OperandType(String operand, int counter){
        this._operand = operand;
        this._lifeTimeCounter = counter;
    }
*/
    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getOperand(){
        return this._operand;
    }

    public void setOperand(String operand){
        this._operand = operand;
    }

    public int getCounter(){
        return this._lifeTimeCounter;
    }

    public void setCounter(int counter){
        this._lifeTimeCounter = counter;
    }


}
