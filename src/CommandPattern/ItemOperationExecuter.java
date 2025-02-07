package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecuter {

    List<ItemOperation> itemOperations = new ArrayList<>();

    public void queuOperation(ItemOperation itemOperation){
        itemOperations.add(itemOperation);
    }


    public void checkout(){
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }
}
