/**
 * Created by IntelliJ IDEA.
 * User: Ben
 * Date: Dec 24, 2009
 * Time: 7:53:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImplementingMockableClass {
    private IInterface mockable;

    public ImplementingMockableClass(IInterface mockable)
    {

        this.mockable = mockable;
    }

    public String OutputString()
    {
         return "ImplementingMockableClass - " + mockable.GetString();
    }
}
