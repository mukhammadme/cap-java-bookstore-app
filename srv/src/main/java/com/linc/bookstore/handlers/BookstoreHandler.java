package com.linc.bookstore.handlers;

import cds.gen.catalogservice.Books_;
import cds.gen.catalogservice.CatalogService_;
import com.sap.cds.services.EventContext;
import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.Before;
import com.sap.cds.services.handler.annotations.ServiceName;

@Component
@ServiceName(CatalogService_.CDS_NAME)
public class BookstoreHandler implements EventHandler {
  @Before(event = CqnService.EVENT_READ, entity = Books_.CDS_NAME)
  public void sayHello(EventContext context) {
    // String language = context.getParameterInfo().getLocale().getLanguage();
    String lang = context.getParameterInfo().getQueryParameter("sap-language");
    String userName = context.getUserInfo().getName();
    System.out.println("User Name: " + userName);
    // System.out.println("User Language: " + language);
    System.out.println("User Language Param: " + lang);
  }
}
