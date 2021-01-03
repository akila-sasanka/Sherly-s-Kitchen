
package bo;

import bo.custom.impl.CustomerBoImpl;
import bo.custom.impl.ItemBoImpl;
import bo.custom.impl.OrderBoImpl;

public class BOFactory {
        private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        return boFactory==null ? boFactory=new BOFactory() : boFactory;
    }

    public enum BOTypes {
        CUSTOMER, ITEM, ORDER
    }

    public SuperBo getBO(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerBoImpl();
            case ITEM:
                return new ItemBoImpl();
            case ORDER:
                return new OrderBoImpl();
            default:
                return null;

        }
    }
}
