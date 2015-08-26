package net.iseteki.j2objcsample.library;

import com.google.j2objc.annotations.ObjectiveCName;

import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@ObjectiveCName("EBIAnimeProgram")
public class Program {

    private String name;
    private List<SubTitle> subTitles;

    @ObjectiveCName("initWithName:subTitles:")
    public Program(String name, List<SubTitle> subTitles) {
        this.name = name;
        this.subTitles = subTitles;
    }

    @ObjectiveCName("name")
    public String getName() {
        return name;
    }

    @ObjectiveCName("setName:")
    public void setName(String name) {
        this.name = name;
    }

    @ObjectiveCName("subTitles")
    public List<SubTitle> getSubTitles() {
        return subTitles;
    }

    @ObjectiveCName("setSubTitles:")
    public void setSubTitles(List<SubTitle> subTitles) {
        this.subTitles = subTitles;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                '}';
    }
}
