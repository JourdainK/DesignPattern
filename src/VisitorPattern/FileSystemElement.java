package VisitorPattern;

public interface FileSystemElement {
    String getName();

    void accept(Visitor visitor);
}
