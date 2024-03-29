using { com.linc.bookstore as bookshop } from '../db/index';

annotate bookshop.Books with {
  author @title : 'Author';
  genre  @title : 'Genre';
}
