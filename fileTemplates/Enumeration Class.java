#parse("File Header.java")

package ${PACKAGE_NAME};
#parse("Type description javadoc.java")
public class ${Class_name} {
#if (${Value_1} != "")
    public static final ${Class_name} ${Value_1} = new ${Class_name}("${Value_1}");
#end
#if (${Value_2} != "")
    public static final ${Class_name} ${Value_2} = new ${Class_name}("${Value_2}");
#end
#if (${Value_3} != "")
    public static final ${Class_name} ${Value_3} = new ${Class_name}("${Value_3}");
#end
#if (${Value_4} != "")
    public static final ${Class_name} ${Value_4} = new ${Class_name}("${Value_4}");
#end
#if (${Value_5} != "")
    public static final ${Class_name} ${Value_5} = new ${Class_name}("${Value_5}");
#end

    private final String myName; // for debug only

    private ${Class_name}(String name) {
        myName = name;
    }

    public String toString() {
        return myName;
    }
}