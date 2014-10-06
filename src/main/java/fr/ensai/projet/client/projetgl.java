package fr.ensai.projet.client;

import fr.ensai.projet.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.smartgwt.client.core.KeyIdentifier;
import com.smartgwt.client.util.KeyCallback;
import com.smartgwt.client.util.Page;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.TextItem;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class projetgl implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
   * Create a remote service proxy to talk to the server-side Greeting service.
   */
  private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

  private final Messages messages = GWT.create(Messages.class);

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
	  if (!GWT.isScript()) { 
		    KeyIdentifier debugKey = new KeyIdentifier(); 
		    debugKey.setCtrlKey(true); 
		    debugKey.setKeyName("D"); 
		    Page.registerKey(debugKey, new KeyCallback() { 
		        public void execute(String keyName) { 
		            SC.showConsole(); 
		        }
		    });
		}
		
		DynamicForm form = new DynamicForm();
		TextItem salutationItem = new TextItem();
		salutationItem.setName("salutation");
		salutationItem.setTitle("Title");
		TextItem firstNameItem = new TextItem();
		firstNameItem.setName("firstname");
		firstNameItem.setTitle("First Name");
		TextItem lastNameItem = new TextItem();
		lastNameItem.setName("lastname");
		lastNameItem.setTitle("Last Name");
		TextItem lastNameItem1 = new TextItem();
		lastNameItem1.setName("lastname1");
		lastNameItem1.setTitle("Last Name1");

		form.setFields(new FormItem[] {
		 salutationItem, firstNameItem, lastNameItem,lastNameItem1
		});
		form.draw();
	  
	  
  }
}
