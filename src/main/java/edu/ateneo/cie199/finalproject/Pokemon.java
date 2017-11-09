package edu.ateneo.cie199.finalproject;

/**
 * Created by John on 11/5/2017.
 */

public class Pokemon {
    private int mDexNumber = 0;
    private String mName = "";
    private StatSet mBase = new StatSet();
    private int mType = 0;
    private int mFrontImage = 0;
    private int mIcon = 0;
    private int mBackImage = 0;
    private int mCatchRate = 0;
    private int mMaleRatio = 0;
    private int mFemaleRatio = 0;

    public Pokemon(int mDexNumber, String mName, StatSet mBase, int mType, int mFrontImage,
                   int mIcon, int mBackImage, int mCatchRate, int mMaleRatio, int mFemaleRatio) {
        this.mDexNumber = mDexNumber;
        this.mName = mName;
        this.mBase = mBase;
        this.mType = mType;
        this.mFrontImage = mFrontImage;
        this.mIcon = mIcon;
        this.mBackImage = mBackImage;
        this.mCatchRate = mCatchRate;
        this.mMaleRatio = mMaleRatio;
        this.mFemaleRatio = mFemaleRatio;
    }

    public Pokemon() {
    }

    public int getMaleRatio() {
        return mMaleRatio;
    }
    public void setMaleRatio(int mMaleRatio) {
        this.mMaleRatio = mMaleRatio;
    }

    public int getFemaleRatio() {
        return mFemaleRatio;
    }
    public void setFemaleRatio(int mFemaleRatio) {
        this.mFemaleRatio = mFemaleRatio;
    }

    public int getDexNumber() {
        return mDexNumber;
    }
    public void setDexNumber(int mDexNumber) {
        this.mDexNumber = mDexNumber;
    }

    public String getName() {
        return mName;
    }
    public void setName(String mName) {
        this.mName = mName;
    }

    public StatSet getBase() {
        return mBase;
    }
    public void setBase(StatSet mBase) {
        this.mBase = mBase;
    }

    public int getType() {
        return mType;
    }
    public void setType(int mType) {
        this.mType = mType;
    }

    public int getFrontImage() {
        return mFrontImage;
    }
    public void setFrontImage(int mFrontImage) {
        this.mFrontImage = mFrontImage;
    }

    public int getIcon() {
        return mIcon;
    }
    public void setIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public int getBackImage() {
        return mBackImage;
    }
    public void setBackImage(int mBackImage) {
        this.mBackImage = mBackImage;
    }

    public int getCatchRate() {
        return mCatchRate;
    }
    public void setCatchRate(int mCatchRate) {
        this.mCatchRate = mCatchRate;
    }
}
