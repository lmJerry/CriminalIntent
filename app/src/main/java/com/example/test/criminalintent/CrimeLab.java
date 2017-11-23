package com.example.test.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/11/23.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;
    public static CrimeLab get(Context context){
        if (sCrimeLab == null){                 //如果存在单列直接调用，不存在，创建单列
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for (int i=0;i<100;i++){        //添加100个crime
            Crime crime = new Crime();
            crime.setmTitle("crime #"+i);
            crime.setmSolved(i%2==0);
            mCrimes.add(crime);
        }
    }
    public List<Crime> getmCrimes(){
        return mCrimes;
    }
    public Crime getCrime(UUID id){         //调用指定id的crime
        for (Crime crime:mCrimes){
            if (crime.getmId()==id){
                return crime;
            }
        }
        return null;
    }
}
