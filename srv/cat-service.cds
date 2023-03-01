using { com.linc.bookstore as bookshop } from '../db';

service CatalogService {
  entity Books as projection on bookshop.Books;
}
