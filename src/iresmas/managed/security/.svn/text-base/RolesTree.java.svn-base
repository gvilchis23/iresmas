package iresmas.managed.security;

import iresmas.common.util.Iconstants;
import iresmas.resources.ReadProperties;
import org.richfaces.event.NodeSelectedEvent;
import org.richfaces.model.TreeNode;
import org.richfaces.model.TreeNodeImpl;


/**
 * 
 * @author Jasso
 *
 */
public class RolesTree {

    @SuppressWarnings("unchecked")
	private TreeNode rootNode = new TreeNodeImpl();
    /**
     * El Parametro de locale esta para el idioma de Ingles 
     */
    private ReadProperties labels = new ReadProperties (Iconstants.LOCALE_ENGLISH);
    private String selection = "";
    
    @SuppressWarnings("unchecked")
	public RolesTree() {
        TreeNodeImpl mdsales = new TreeNodeImpl();
        
        mdsales.setData(labels.getValue("lblmenu.sales"));
        mdsales.setParent(rootNode);
        rootNode.addChild("A", mdsales);
        
        
        TreeNodeImpl subSales = new TreeNodeImpl();
        subSales.setData(labels.getValue("lblmenu.sales"));
        subSales.setParent(mdsales);
        mdsales.addChild("B", subSales);
        
        TreeNodeImpl subMarketing = new TreeNodeImpl();
        subMarketing.setData(labels.getValue("lblmenu.sales.marketing"));
        subMarketing.setParent(mdsales);
        mdsales.addChild("C", subMarketing);

        
        TreeNodeImpl subMarkPs = new TreeNodeImpl();
        subMarkPs.setData(labels.getValue("lblmenu.sales.marketing.ps"));
        subMarkPs.setParent(subSales);
        subSales.addChild("D", subMarkPs);
        
        
        TreeNodeImpl mdInventory = new TreeNodeImpl();
        
        mdInventory.setData(labels.getValue("lblmenu.inventory"));
		mdInventory.setParent(rootNode);
        rootNode.addChild("E", mdInventory);
        
        TreeNodeImpl subItemMaster = new TreeNodeImpl();
        subItemMaster.setData(labels.getValue("lblmenu.inventory.itemMaster"));
        subItemMaster.setParent(mdInventory);
        mdInventory.addChild("F", subItemMaster);
        
        TreeNodeImpl subAdmin = new TreeNodeImpl();
        subAdmin.setData(labels.getValue("lblmenu.admin"));
        subAdmin.setParent(mdInventory);
        mdInventory.addChild("G", subAdmin);
        
        TreeNodeImpl subCatalog = new TreeNodeImpl();
        subCatalog.setData(labels.getValue("lblmenu.inventory.administration.brandCatalog"));
        subCatalog.setParent(subAdmin);
        subAdmin.addChild("H", subCatalog);
        
        
        
    }

    public void processTreeNodeImplSelection(final NodeSelectedEvent event) {
        setSelection(event.toString());
    }

    @SuppressWarnings("unchecked")
	public TreeNode getRootNode() {
        return rootNode;
    }

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}
    
    
}
