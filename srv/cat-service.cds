using { com.linc.bookstore as bookshop } from '../db';

@path: 'browse'
service CatalogService {
  entity Books as projection on bookshop.Books;
}
