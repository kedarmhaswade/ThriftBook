import java.util.*;
import org.apache.thrift.TException;

public class MessageHandler implements Message.Iface {

  public MessageHandler() {
    msg_index = 0;
  }

  @Override
  public String motd() throws TException {
    System.out.println("Call count: " + ++msg_index);
    return msgs.get(Math.abs(msg_index % 3));
  }
  @Override
  public Set<String> getNames() {
    Set<String> names = new HashSet<>();
    // Only "a" and "b" will be sent to the client!
    names.addAll(Arrays.asList("a", "b", "a")); // ignore ret val
    return names;
  }
  private int msg_index;
  private static List<String> msgs = Arrays.asList("Apache Thrift!!", 
                                                   "Childhood is a short season", 
                                                   "'Twas brillig");
}
