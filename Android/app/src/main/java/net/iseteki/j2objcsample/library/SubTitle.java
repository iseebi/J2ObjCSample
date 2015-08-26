package net.iseteki.j2objcsample.library;

import com.google.j2objc.annotations.ObjectiveCName;

@SuppressWarnings("UnusedDeclaration")
@ObjectiveCName("EBIAnimeSubTitle")
public class SubTitle {

    public int countNumber;
    public String name;

    @ObjectiveCName("initWithCountNumber:name:")
    public SubTitle(int countNumber, String name) {
        this.countNumber = countNumber;
        this.name = name;
    }

    @ObjectiveCName("countNumber")
    public int getCountNumber() {
        return countNumber;
    }

    @ObjectiveCName("setCountNumber:")
    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    @ObjectiveCName("name")
    public String getName() {
        return name;
    }

    @ObjectiveCName("setName:")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubTitle{" +
                "countNumber=" + countNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
